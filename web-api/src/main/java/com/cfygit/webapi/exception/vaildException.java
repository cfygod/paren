package com.cfygit.webapi.exception;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class vaildException {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public List<FieldError> exception(MethodArgumentNotValidException e) {
        BindingResult bindingResult = e.getBindingResult();
        List<ObjectError> allErrors = bindingResult.getAllErrors();
        List<FieldError> errorMsgs = new ArrayList<>();

        allErrors.forEach(objectError -> {
            FieldError fieldError = (FieldError)objectError;

            errorMsgs.add(fieldError);
        });
        return errorMsgs;
    }
}
