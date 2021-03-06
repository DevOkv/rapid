package ru.sbrf.cl.decision.rapid.document;

import java.util.List;
import java.util.Optional;

public interface DocumentRepository {
    /**
     * Get document by id
     *
     * @param id - document id
     * @return document
     */
    Optional<Document> getDocumentById(Long id);

    /**
     * Get all documents
     *
     * @return documents
     */
    List<Document> getDocuments();

    /**
     * Save document.
     *
     * @param document - document
     * @return document
     */
    Document saveDocument(Document document);
}
