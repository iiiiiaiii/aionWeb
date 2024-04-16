package aion.information.menu.controller.form;

import aion.information.menu.entity.Job;
import aion.information.menu.entity.Value;
import aion.information.menu.entity.item.Armor;
import lombok.Getter;

import java.util.List;

@Getter

public class WeaponForm extends ItemForm{

    private String attack;
    private int accuracy;
    private int weaponArmor;
    private float weaponSpeed;
    private int critical;

    private int magicAttack;
    private int magicAccuracy;

    private int magicCritical;

    private String etc;

    private Value value;

    public WeaponForm(String name, String context, List<Job> jobList, String attack, int accuracy, int weaponArmor, float weaponSpeed, int critical, int magicAttack, int magicAccuracy, int magicCritical, String etc, Value value) {
        super(name, context, jobList);
        this.attack = attack;
        this.accuracy = accuracy;
        this.weaponArmor = weaponArmor;
        this.weaponSpeed = weaponSpeed;
        this.critical = critical;
        this.magicAttack = magicAttack;
        this.magicAccuracy = magicAccuracy;
        this.magicCritical = magicCritical;
        this.etc = etc;
        this.value = value;
    }
}