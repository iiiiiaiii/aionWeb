package aion.information.menu.entity.item;

import aion.information.menu.entity.Job;
import aion.information.menu.entity.Value;
import aion.information.menu.entity.WeaponBaseStat;
import aion.information.menu.entity.WeaponKind;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Getter
public class Weapon extends Item {

    @Id
    @GeneratedValue
    @Column(name = "Weapon_id")
    private Long id;

    private String attack;
    private int accuracy;
    private int weaponArmor;
    @Embedded
    private WeaponBaseStat weaponBaseStat;
    private int magicAttack;
    private int magicAccuracy;
    private int magicCritical;
    private String etc;

    @Enumerated(EnumType.STRING)
    private WeaponKind weaponKind;

    public Weapon(String name, int level, Value value, List<Job> jobList, String attack, int accuracy, int weaponArmor, int magicAttack, int magicAccuracy, int magicCritical, String etc, WeaponKind weaponKind) {
        super(name, level, value, jobList);
        this.attack = attack;
        this.accuracy = accuracy;
        this.weaponArmor = weaponArmor;
        this.magicAttack = magicAttack;
        this.magicAccuracy = magicAccuracy;
        this.magicCritical = magicCritical;
        this.etc = etc;
        this.weaponKind = weaponKind;
        this.weaponBaseStat = WeaponBaseStat.getDefaultStats(weaponKind);
    }
}
