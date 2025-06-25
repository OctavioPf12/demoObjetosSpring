package org.example.demoobjetos.RemitenteExeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

public class HandlerException {
    @ExceptionHandler(
            value = { MethodArgumentNotValidException.class })
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String,String> getException(MethodArgumentNotValidException ex) {
        Map<String,String> map = new HashMap<>();
        ex.getBindingResult()
                .getFieldErrors().forEach(error->
                        map.put(error.getField()
                                ,error.getDefaultMessage()));
        return map;
    }
    @ExceptionHandler(value = {RegistroException.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Map<String,String> getException(RegistroException re) {
        Map<String,String> map = new HashMap<>();
        map.put("error",re.getMessage());
        return map;
    }
}
