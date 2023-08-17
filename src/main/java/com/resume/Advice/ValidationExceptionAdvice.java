package com.resume.Advice;

import com.resume.exception.AlreadyExistsException;
import com.resume.exception.ErrorMessageDto;
import com.resume.exception.NotFoundException;
import org.aspectj.weaver.ast.Not;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@RestControllerAdvice
public class ValidationExceptionAdvice {

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorMessageDto NotFoundException(NotFoundException e){
        return new ErrorMessageDto(e.getMessage(),HttpStatus.BAD_REQUEST.value());
    }

    @ExceptionHandler(AlreadyExistsException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorMessageDto alreadyException(AlreadyExistsException e){
        return new ErrorMessageDto(e.getMessage(),HttpStatus.BAD_REQUEST.value());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, String> handleValidationErrors(MethodArgumentNotValidException ex) {
        Map<String, String> errorResponse = new HashMap<>();
        ex.getBindingResult().getAllErrors()
                .forEach(error -> {
                    String name = ((FieldError)error).getField();
                    String msg = error.getDefaultMessage();
                    errorResponse.put(name, msg);
                });
        return errorResponse;
    }
}
