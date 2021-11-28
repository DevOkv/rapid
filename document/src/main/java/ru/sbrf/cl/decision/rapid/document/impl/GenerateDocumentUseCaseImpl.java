package ru.sbrf.cl.decision.rapid.document.impl;

import ru.sbrf.cl.decision.rapid.document.Document;
import ru.sbrf.cl.decision.rapid.document.DocumentBuilder;
import ru.sbrf.cl.decision.rapid.document.GenerateDocumentUseCase;
import ru.sbrf.cl.decision.rapid.document.OutputFormat;
import ru.sbrf.cl.decision.rapid.template.Template;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class GenerateDocumentUseCaseImpl implements GenerateDocumentUseCase {

    Map<OutputFormat, DocumentBuilder> documentBuilders = new HashMap<>();

    public GenerateDocumentUseCaseImpl(List<DocumentBuilder> documentBuilders) {
        documentBuilders.forEach(builder -> {
            OutputFormat outputFormat = builder.getOutputFormat();
            if (this.documentBuilders.containsKey(outputFormat)) {
                throw new IllegalArgumentException("Can be only one DocumentBuilder for: " + outputFormat);
            }
            this.documentBuilders.put(outputFormat, builder);
        });
    }

    @Override
    public byte[] build(Document document, Template template) {
        return build(document, template, OutputFormat.DOCX);
    }

    @Override
    public byte[] build(Document document, Template template, OutputFormat format) {
        DocumentBuilder builder = Optional.ofNullable(documentBuilders.get(format))
                .orElseThrow(() -> new RuntimeException("Implementation for: " + format + " is not exists"));
        return builder.build(document, template);
    }
}
