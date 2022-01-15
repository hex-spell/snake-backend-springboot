package com.modulariz.snakebackendspringboot.errorHandlers

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice
import javax.validation.ConstraintViolationException

data class ValidationError(val message: String? = "bad request")

@RestControllerAdvice
class ValidationHandling {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ConstraintViolationException::class)
    fun handleContraintViolationException(err: ConstraintViolationException): ValidationError =
        ValidationError(err.constraintViolations.joinToString { it-> "${it.messageTemplate}" })
}