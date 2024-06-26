package aion.information.menu.service;

import aion.information.menu.controller.form.InformationForm;
import aion.information.menu.dto.InformationDto;
import aion.information.menu.entity.information.Information;
import aion.information.menu.repository.InformationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
@Transactional(readOnly = true)
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
    public void update(Information information, InformationForm informationForm) {
        String name = information.getName();
        String content = information.getContent();
        informationRepository.updateInfo(information.getId(),name,content);
    }

    public List<Information> findAll() {
        return informationRepository.findAll();
    }

    public List<InformationDto> findAllByDto() {
        return informationRepository.findAllByDto();
    }
    public void research() {

    }

}
