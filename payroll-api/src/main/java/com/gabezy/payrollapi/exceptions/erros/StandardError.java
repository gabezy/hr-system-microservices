package com.gabezy.payrollapi.exceptions.erros;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class StandardError {
    private String message;
    private Integer status;
    private LocalDateTime timestamp;
    private String path;

}
