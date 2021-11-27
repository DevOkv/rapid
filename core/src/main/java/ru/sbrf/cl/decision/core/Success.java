package ru.sbrf.cl.decision.core;

public final class Success<T> implements Result<T> {
    private final T result;

    private Success() {
        result = null;
    }

    private Success(T result) {
        this.result = result;
    }

    public static <T> Result<T> empty() {
        return new Success<>();
    }

    public static <T> Result<T> of(T value) {
        return new Success<>(value);
    }

    @Override
    public T get() {
        return result;
    }

    @Override
    public boolean isSuccess() {
        return true;
    }
}
