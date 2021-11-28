package ru.sbrf.cl.decision.rapid.document;

import ru.sbrf.cl.decision.rapid.template.Template;

public interface DocumentBuilder {
    OutputFormat getOutputFormat();

    byte[] build(Document document, Template template);
}
