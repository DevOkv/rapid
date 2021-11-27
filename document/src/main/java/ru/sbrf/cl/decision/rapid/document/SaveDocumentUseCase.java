package ru.sbrf.cl.decision.rapid.document;

import ru.sbrf.cl.decision.core.Result;

public interface SaveDocumentUseCase {
    Result<Document> saveDocument(Document document);
}
