package aion.information.menu.dto;

import lombok.Data;

@Data
public class WeaponDto {

    private String name;
    private int level;
    private String attack;
    private int accuracy;
    private int weaponArmor;
    private double weaponSpeed;
    private int critical;
    private int magicAttack;
    private int magicAccuracy;
    private int magicCritical;
    private String etc;

    protected WeaponDto() {

    }

    public WeaponDto(String name, int level, String attack, int accuracy, int weaponArmor, double weaponSpeed, int critical, int magicAttack, int magicAccuracy, int magicCritical, String etc) {
        this.name = name;
        this.level = level;
        this.attack = attack;
        this.accuracy = accuracy;
        this.weaponArmor = weaponArmor;
        this.weaponSpeed = weaponSpeed;
        this.critical = critical;
        this.magicAttack = magicAttack;
        this.magicAccuracy = magicAccuracy;
        this.magicCritical = magicCritical;
        this.etc = etc;
    }
}
