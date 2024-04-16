package aion.information.menu.service;

import aion.information.menu.controller.form.AccessoryForm;
import aion.information.menu.controller.form.ArmorForm;
import aion.information.menu.controller.form.WeaponForm;
import aion.information.menu.entity.Job;
import aion.information.menu.entity.Value;
import aion.information.menu.entity.WeaponKind;
import aion.information.menu.entity.item.Item;
import aion.information.menu.entity.item.Weapon;
import aion.information.menu.repository.WeaponRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
@Transactional(readOnly = true)
public class WeaponService {
    private final WeaponRepository weaponRepository;

    @Transactional
    public void save(Weapon weapon) {
        weaponRepository.save(weapon);
    }
    @Transactional
    public void delete(Weapon weapon) {
        weaponRepository.delete(weapon);
    }

    @Transactional
    public void deleteAll() {
        weaponRepository.deleteAll();
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
        WeaponKind weaponKind = weaponForm.getWeaponKind();
        Value value = weaponForm.getValue();
        List<Job> jobList = weaponForm.getJobList();
        weaponRepository.updateWeapon(id, name, level, attack, accuracy, weaponArmor, weaponSpeed, critical, magicAttack, magicAccuracy, magicCritical, etc,value,weaponKind, jobList);
    }
}
