package ru.sbrf.cl.decision.core.validator;

public interface ValidationRule<T> {
    /**
     * Return error message if validation fail
     *
     * @return error message
     */
    String getErrorMessage(T model);

    /**
     * Validate model, return false if validation fails and true if validation success
     *
     * @param model model for validation
     * @return return false if validation fails and true if validation success
     */
    boolean hasError(T model);

    default ValidationResult validate(T model) {
        return new ValidationResult(getErrorMessage(model), hasError(model));
    }
}
