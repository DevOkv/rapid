package ru.sbrf.cl.decision.rapid.document;

import ru.sbrf.cl.decision.rapid.template.Attribute;

import java.util.Map;

public interface Document {
    Long getId();

    void setId(Long id);

    String getName();

    void setName(String name);

    Map<String, Attribute> getAttributes();

    void setAttributes(Map<String, Attribute> attributes);
}
