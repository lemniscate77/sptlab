package ru.sptlab.candidate.validator;

import org.springframework.http.MediaType;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.sptlab.candidate.validator.document.Deal;

import javax.validation.Valid;

@RestController
public class ValidatorController {

    @PostMapping(path = "/deal", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ValidationResult validate(@Valid @RequestBody Deal deal) {
        return new ValidationResult("ok");
    }

    @ExceptionHandler
    public ValidationResult handleException(MethodArgumentNotValidException exception) {
        return new ValidationResult(exception.getMessage());
    }

}
