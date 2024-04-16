package aion.information.menu.service;

import aion.information.menu.controller.form.AccessoryForm;
import aion.information.menu.controller.form.ArmorForm;
import aion.information.menu.controller.form.WeaponForm;
import aion.information.menu.entity.Job;
import aion.information.menu.entity.Value;
import aion.information.menu.entity.item.Item;
import aion.information.menu.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
@Transactional(readOnly = true)
public class ItemService {
    private final ItemRepository itemRepository;

    @Transactional
    public void save(Item item) {
        itemRepository.save(item);
    }

    @Transactional
    public void delete(Item item) {
        itemRepository.delete(item);
    }

    @Transactional
    public void updateWeapon(Long id, WeaponForm weaponForm) {
        String name = weaponForm.getName();
        int level = weaponForm.getLevel();
        String attack = weaponForm.getAttack();
        int accuracy = weaponForm.getAccuracy();
        int weaponArmor = weaponForm.getWeaponArmor();
        float weaponSpeed = weaponForm.getWeaponSpeed();
        int critical = weaponForm.getCritical();
        int magicAttack = weaponForm.getMagicAttack();
        int magicAccuracy = weaponForm.getMagicAccuracy();
        int magicCritical = weaponForm.getMagicCritical();
        String etc = weaponForm.getEtc();
        Value value = weaponForm.getValue();
        List<Job> jobList = weaponForm.getJobList();
        itemRepository.updateWeapon(id, name, level, attack, accuracy, weaponArmor, weaponSpeed, critical, magicAttack, magicAccuracy, magicCritical, etc, value, jobList);

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
        List<Job> jobList = armorForm.getJobList();
        itemRepository.updateArmor(id, name, level, defense, magicResist, avoid, etc, value, jobList);
    }

    @Transactional
    public void updateAccessory(Long id, AccessoryForm accessoryForm) {
        String name = accessoryForm.getName();
        int level = accessoryForm.getLevel();
        int magicResist = accessoryForm.getMagicResist();
        String etc = accessoryForm.getEtc();

        itemRepository.updateAccessory(id, name, level, magicResist, etc);
    }
}
