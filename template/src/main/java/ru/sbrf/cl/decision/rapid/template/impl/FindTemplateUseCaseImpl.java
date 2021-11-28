package ru.sbrf.cl.decision.rapid.template.impl;

import lombok.RequiredArgsConstructor;
import ru.sbrf.cl.decision.rapid.template.FindTemplateUseCase;
import ru.sbrf.cl.decision.rapid.template.Template;
import ru.sbrf.cl.decision.rapid.template.TemplateRepository;

@RequiredArgsConstructor
public class FindTemplateUseCaseImpl implements FindTemplateUseCase {

    private final TemplateRepository repository;

    @Override
    public Template findTemplateByURN(String URN) {
        return repository.getTemplateByURN(URN);
    }
}
