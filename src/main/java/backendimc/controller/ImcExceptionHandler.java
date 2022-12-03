package backendimc.controller;

import backendimc.dto.ExceptionDescription;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class ImcExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<ExceptionDescription>> handleMethodArgumentNotValid(MethodArgumentNotValidException ex) {

        final List<ExceptionDescription> errorMessages = new ArrayList<>();

        for (ObjectError error : ex.getAllErrors()) {
            errorMessages.add(new ExceptionDescription(error.getDefaultMessage(), LocalDateTime.now()));
        }

        return ResponseEntity.badRequest().body(errorMessages);
    }
}
