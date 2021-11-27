package ru.sbrf.cl.decision.core.validator;

import ru.sbrf.cl.decision.core.Result;

import java.util.List;

public interface Validator<T> {
    List<ValidationRule<T>> getValidationRules();

    Result<List<String>> validate(T document);

    void addRule(ValidationRule<T> rule);

    void addRules(List<ValidationRule<T>> rules);
}
