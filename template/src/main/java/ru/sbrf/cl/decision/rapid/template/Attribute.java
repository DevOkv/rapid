package ru.sbrf.cl.decision.rapid.template;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Attribute {
    private Long id;
    private AttributeType type;
    private String value;
}
