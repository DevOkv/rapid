package ru.sbrf.cl.decision.rapid.template;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@RequiredArgsConstructor
@Getter
public enum AttributeType {
    STRING_TYPE(String.class),
    BOOLEAN_TYPE(Boolean.class),
    DATE_TYPE(Date.class),
    INTEGER_TYPE(Integer.class);

    @SuppressWarnings("rawtypes")
    private final Class cls;
}
