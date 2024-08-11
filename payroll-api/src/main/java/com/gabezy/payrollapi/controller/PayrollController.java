package com.gabezy.payrollapi.controller;

import com.gabezy.payrollapi.domain.entities.Payroll;
import com.gabezy.payrollapi.domain.entities.dtos.PayrollDTO;
import com.gabezy.payrollapi.services.PayrollService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/payments")
public class PayrollController {

    private final PayrollService payrollService;

    @PostMapping
    public ResponseEntity<Payroll> createPayroll(@RequestBody PayrollDTO input) {
        return ResponseEntity.ok(payrollService.generatePayroll(input));
    }

}
