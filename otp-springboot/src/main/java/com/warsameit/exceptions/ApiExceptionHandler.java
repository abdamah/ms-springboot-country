package com.warsameit.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;
@ControllerAdvice
public class ApiExceptionHandler {
    @ExceptionHandler(value = {ApiRequestException.class})
    public ResponseEntity<ApiException> handleApiExceptions(ApiRequestException e){
        HttpStatus badRequest = e.getHttpStatus();
        String message = e.getMessage();
        ApiException apiException = new ApiException(message, badRequest, ZonedDateTime.now(ZoneId.systemDefault()));
        return new ResponseEntity<>(apiException,badRequest);
    }

}
