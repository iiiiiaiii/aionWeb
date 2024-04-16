package aion.information.menu.entity.item;

import aion.information.menu.entity.Job;
import aion.information.menu.entity.Value;
import aion.information.menu.entity.WeaponKind;
import aion.information.menu.entity.item.Item;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
    private float weaponSpeed;
    private int critical;
    private int magicAttack;
    private int magicAccuracy;
    private int magicCritical;
    private String etc;

    private WeaponKind weaponKind;

    public Weapon(String name, int level, Value value, List<Job> jobList, Long id, String attack, int accuracy, int weaponArmor, float weaponSpeed, int critical, int magicAttack, int magicAccuracy, int magicCritical, String etc, WeaponKind weaponKind) {
        super(name, level, value, jobList);
        this.id = id;
        this.attack = attack;
        this.accuracy = accuracy;
        this.weaponArmor = weaponArmor;
        this.weaponSpeed = weaponSpeed;
        this.critical = critical;
        this.magicAttack = magicAttack;
        this.magicAccuracy = magicAccuracy;
        this.magicCritical = magicCritical;
        this.etc = etc;
        this.weaponKind = weaponKind;
    }
}
