package ru.sbrf.cl.decision.rapid.document;

import ru.sbrf.cl.decision.rapid.template.Template;

public interface GenerateDocumentUseCase {
    byte[] build(Document document, Template template);
    byte[] build(Document document, Template template, OutputFormat format);
}
