package com.starter.myspringboot.api;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.starter.myspringboot.exception.BaseException;

import lombok.Data;

@ControllerAdvice
public class ErrorAdvisor {

  // @ExceptionHandler(BaseException.class)
  // public ResponseEntity<ErrorResponse> handleBaseException(BaseException e) {
  // ErrorResponse response = new ErrorResponse();
  // response.setError(e.getMessage());
  // response.setStatus(HttpStatus.EXPECTATION_FAILED.value());

  // return new ResponseEntity<>(response, HttpStatus.EXPECTATION_FAILED);
  // }

  // @Data
  // public static class ErrorResponse {

  // private LocalDateTime timestamp = LocalDateTime.now();

  // private int status;

  // private String error;
  // }
}
