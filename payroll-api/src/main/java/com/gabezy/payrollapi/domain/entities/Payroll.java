package com.gabezy.payrollapi.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Payroll {
    private Long employeeId;
    private String employeeUsername;
    private Double workingHours;
    private Double hourlyPrice;
    private Double totalToPay;
}
