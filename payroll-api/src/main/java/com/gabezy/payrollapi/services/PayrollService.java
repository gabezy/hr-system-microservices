package com.gabezy.payrollapi.services;

import com.gabezy.payrollapi.clients.UserApiClient;
import com.gabezy.payrollapi.domain.entities.dtos.UserClientDTO;
import com.gabezy.payrollapi.domain.entities.Payroll;
import com.gabezy.payrollapi.domain.entities.dtos.PayrollDTO;
import com.gabezy.payrollapi.exceptions.UserApiClientNotFoundException;
import com.gabezy.payrollapi.utils.RequestCounter;
import feign.FeignException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class PayrollService {

    private final UserApiClient userApiClient;
    private final Environment env;

    public Payroll generatePayroll(PayrollDTO input) {
        log.info("PAYROLL_SERVICE ::: POST REQUEST ON PORT {} - REQUEST COUNTER [{}]",
                env.getProperty("server.port"), RequestCounter.increment());
        var user = getUser(input.userId());
        var payroll = new Payroll();
        payroll.setEmployeeId(user.id());
        payroll.setHourlyPrice(user.hourlyPrice());
        payroll.setEmployeeUsername(user.username());
        payroll.setWorkingHours(input.workingHours());
        payroll.setTotalToPay(calculateTotalToPay(payroll.getHourlyPrice(), payroll.getWorkingHours()));
        return payroll;
    }

    private Double calculateTotalToPay(Double hourlyPrice, Double workingHours) {
        return hourlyPrice * workingHours;
    }

    private UserClientDTO getUser(Long userId) {
        try {
            return userApiClient.findById(userId).getBody();
        } catch (FeignException.NotFound e) {
            throw new UserApiClientNotFoundException();
        }
    }

}
