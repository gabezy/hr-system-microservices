package com.gabezy.payrollapi.exceptions;

import com.gabezy.payrollapi.exceptions.erros.StandardError;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ExceptionHandlerPayRoll {

    @ExceptionHandler(UserApiClientNotFoundException.class)
    public ResponseEntity<StandardError> handleUserApiClientNotFoundException(UserApiClientNotFoundException e, HttpServletRequest request) {
        var error = new StandardError();
        error.setMessage(e.getMessage());
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setTimestamp(LocalDateTime.now());
        error.setPath(request.getRequestURI());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }

}
