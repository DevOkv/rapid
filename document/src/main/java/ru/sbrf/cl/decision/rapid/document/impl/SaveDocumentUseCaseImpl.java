package ru.sbrf.cl.decision.rapid.document.impl;

import lombok.RequiredArgsConstructor;
import ru.sbrf.cl.decision.core.Result;
import ru.sbrf.cl.decision.core.validator.Validator;
import ru.sbrf.cl.decision.rapid.document.Document;
import ru.sbrf.cl.decision.rapid.document.DocumentRepository;
import ru.sbrf.cl.decision.rapid.document.SaveDocumentUseCase;

@RequiredArgsConstructor
public class SaveDocumentUseCaseImpl implements SaveDocumentUseCase {

    private final DocumentRepository repository;
    private final Validator<Document> validator;

    @Override
    public Result<Document> saveDocument(Document document) {
        return Result.of(() -> document)
                .ifSuccess(validator::validate)
                .ifSuccess(repository::saveDocument);
    }
}
