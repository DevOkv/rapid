package ru.sbrf.cl.decision.core.validator;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@Getter
public class ValidationException extends RuntimeException {
    private final List<String> errors;
}
