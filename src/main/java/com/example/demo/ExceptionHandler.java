package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHandler {

    @ResponseBody
    @org.springframework.web.bind.annotation.ExceptionHandler(ExceptionOne.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ExceptionOneWrapper handleServerException(ExceptionOne e) {
        return new ExceptionOneWrapper();
    }

    @ResponseBody
    @org.springframework.web.bind.annotation.ExceptionHandler(ExceptionTwo.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ExceptionTwoWrapper handleMethodNotAllowedException(ExceptionTwo e) {
        return new ExceptionTwoWrapper();
    }
}
