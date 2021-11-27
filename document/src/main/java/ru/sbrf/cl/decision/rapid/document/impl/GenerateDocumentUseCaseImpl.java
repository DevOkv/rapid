package ru.sbrf.cl.decision.rapid.document.impl;

import lombok.RequiredArgsConstructor;
import ru.sbrf.cl.decision.rapid.document.Document;
import ru.sbrf.cl.decision.rapid.document.GenerateDocumentUseCase;
import ru.sbrf.cl.decision.rapid.document.OutputFormat;
import ru.sbrf.cl.decision.rapid.template.Template;

@RequiredArgsConstructor
public class GenerateDocumentUseCaseImpl implements GenerateDocumentUseCase {

    @Override
    public byte[] build(Document document, Template template) {
        return new byte[0];
    }

    @Override
    public byte[] build(Document document, Template template, OutputFormat format) {
        return new byte[0];
    }
}
