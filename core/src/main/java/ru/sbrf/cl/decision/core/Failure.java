package ru.sbrf.cl.decision.core;

public final class Failure<T> implements Result<T> {
    private final Exception failure;

    private Failure(Exception exception) {
        this.failure = exception;
    }

    public static <T> Result<T> of(Exception exception) {
        return new Failure<>(exception);
    }

    @Override
    public T get() {
        throw new RuntimeException(failure);
    }

    @Override
    public boolean isSuccess() {
        return false;
    }
}
