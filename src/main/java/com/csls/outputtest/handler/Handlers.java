package com.csls.outputtest.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.RestClientException;
import org.springframework.web.context.request.WebRequest;

import javax.validation.ConstraintViolationException;

/*@Slf4j
@ControllerAdvice*/
public class Handlers {
    /*@ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({
            MethodArgumentNotValidException.class,
            BindException.class,
            ConstraintViolationException.class,
            InvalidRequestException.class})
    public void validationHandler() { }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler({ResourceNotFoundException.class})
    public void notFoundHandler() { }

    @ExceptionHandler({ RestClientException.class })
    public ResponseEntity<SingleMessage> handleAll(Exception ex, WebRequest request) {
        log.error("Excecao {} metodo {}", ex.getMessage(), request.getContextPath());
        log.error("Detalhes", ex);
        return new ResponseEntity<>(
                SingleMessage.builder().message("Erro interno ao processar requisição").build(),
                HttpStatus.INTERNAL_SERVER_ERROR);
    }*/
}

