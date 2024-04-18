package aion.information.menu.service;

import aion.information.menu.controller.form.ArmorForm;
import aion.information.menu.dto.ArmorDto;
import aion.information.menu.entity.ArmorKind;
import aion.information.menu.entity.Job;
import aion.information.menu.entity.Value;
import aion.information.menu.entity.item.Accessory;
import aion.information.menu.entity.item.Armor;
import aion.information.menu.repository.ArmorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ArmorService {
    private final ArmorRepository armorRepository;

    @Transactional
    public void save(Armor armor) {
        armorRepository.save(armor);
    }

    @Transactional
    public void delete(Armor armor) {
        armorRepository.delete(armor);
    }

    @Transactional
    public void deleteAll() {
        armorRepository.deleteAll();
    }

    @Transactional
    public void updateArmor(Long id, ArmorForm armorForm) {
        String name = armorForm.getName();
        int level = armorForm.getLevel();
        int defense = armorForm.getDefense();
        int magicResist = armorForm.getMagicResist();
        int avoid = armorForm.getAvoid();
        String etc = armorForm.getEtc();
        Value value = armorForm.getValue();
        ArmorKind armorKind = armorForm.getArmorKind();
        List<Job> jobList = armorForm.getJobList();
        armorRepository.updateArmor(id, name, level, defense, magicResist, avoid, etc, value, armorKind,jobList);
    }

    public List<ArmorDto> findAllByDto() {
        return armorRepository.findAllByDto();
    }

    public List<ArmorDto> findKindDto(ArmorKind armorKind) {
        return armorRepository.findKindDto(armorKind);
    }

}
