package com.gabezy.userapi.exceptions;

import com.gabezy.userapi.exceptions.erros.StandardError;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> handleResourceNotFoundException(ResourceNotFoundException ex, HttpServletRequest request) {
        var error = new StandardError();
        error.setMessage(ex.getMessage());
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setTimestamp(LocalDateTime.now());
        error.setPath(request.getRequestURI());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }

}
