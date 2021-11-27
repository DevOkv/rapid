package ru.sbrf.cl.decision.core.validator;

import ru.sbrf.cl.decision.core.Failure;
import ru.sbrf.cl.decision.core.Result;
import ru.sbrf.cl.decision.core.Success;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BaseValidator<T> implements Validator<T> {

    private final List<ValidationRule<T>> validationRules = new ArrayList<>();

    @Override
    public List<ValidationRule<T>> getValidationRules() {
        return validationRules;
    }

    @Override
    public Result<List<String>> validate(T document) {
        List<String> errors = validationRules.stream().map(rule -> rule.validate(document))
                .filter(ValidationResult::isError)
                .map(ValidationResult::getErrorMessage)
                .collect(Collectors.toList());
        return errors.isEmpty() ? Success.empty() : Failure.of(new ValidationException(errors));
    }

    @Override
    public void addRule(ValidationRule<T> rule) {
        validationRules.add(rule);
    }

    @Override
    public void addRules(List<ValidationRule<T>> rules) {
        validationRules.addAll(rules);
    }
}
