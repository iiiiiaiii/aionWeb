package aion.information.menu.entity;


public class WeaponBaseStat {

    private double weaponSpeed;
    private int critical;


    public WeaponBaseStat(double weaponSpeed, int critical) {
        this.weaponSpeed = weaponSpeed;
        this.critical = critical;
    }

    public WeaponBaseStat() {
    }

    public static WeaponBaseStat getDefaultStats(WeaponKind weaponKind) {
        return switch (weaponKind) {
            case 장검 -> new WeaponBaseStat(1.4, 50);
            case 단검 -> new WeaponBaseStat(1.2, 100);
            case 전곤 -> new WeaponBaseStat(1.5, 10);
            case 창 -> new WeaponBaseStat(2.8, 50);
            case 대검 -> new WeaponBaseStat(2.4, 10);
            case 법봉 -> new WeaponBaseStat(2.0, 60);
            case 사슬검 -> new WeaponBaseStat(2.3, 50);
            case 용아 -> new WeaponBaseStat(1.1, 110);
            case 장궁 -> new WeaponBaseStat(2.4, 50);
            case 보주, 마법서 -> new WeaponBaseStat(2.2, 0);
            default -> new WeaponBaseStat(0.0, 0);
        };
    }
}

