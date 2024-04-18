package aion.information.menu.service;

import aion.information.menu.controller.form.AccessoryForm;
import aion.information.menu.controller.form.ArmorForm;
import aion.information.menu.dto.AccessoryDto;
import aion.information.menu.entity.AccessoryKind;
import aion.information.menu.entity.Job;
import aion.information.menu.entity.Value;
import aion.information.menu.entity.item.Accessory;
import aion.information.menu.repository.AccessoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class AccessoryService {

    private final AccessoryRepository accessoryRepository;

    @Transactional
    public void save(Accessory accessory) {
        accessoryRepository.save(accessory);
    }

    @Transactional
    public void delete(Accessory accessory) {
        accessoryRepository.delete(accessory);
    }

    @Transactional
    public void allDelete() {
        accessoryRepository.deleteAll();
    }

    @Transactional
    public void updateAccessory(Long id, AccessoryForm accessoryForm) {
        String name = accessoryForm.getName();
        int level = accessoryForm.getLevel();
        Value value = accessoryForm.getValue();
        int magicResist = accessoryForm.getMagicResist();
        AccessoryKind accessoryKind = accessoryForm.getAccessoryKind();

        String etc = accessoryForm.getEtc();

        accessoryRepository.updateAccessory(id, name, level, value,magicResist,accessoryKind ,etc);
    }


    public List<AccessoryDto> findAllByDto() {
        return accessoryRepository.findAllByDto();
    }

    public List<AccessoryDto> findKindDto(AccessoryKind accessoryKind) {
        return accessoryRepository.findKindDto(accessoryKind);
    }
}
