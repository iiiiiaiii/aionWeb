package aion.information.menu.service;

import aion.information.menu.controller.form.Form;
import aion.information.menu.entity.Information;
import aion.information.menu.repository.InformationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class InformationService {
    private final InformationRepository informationRepository;

    @Transactional
    public void save(Information information) {
        informationRepository.save(information);
    }

    @Transactional
    public void delete(Information information) {
        informationRepository.delete(information);
    }

    @Transactional
    public void updatePost(Information information, Form form) {
        information.updatePost(form);
    }

}
