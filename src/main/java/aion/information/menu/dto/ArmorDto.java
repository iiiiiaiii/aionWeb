package aion.information.menu.dto;

import lombok.Data;

@Data
public class ArmorDto {
    private String name;
    private int level;
    private int defense;
    private int magicResist;
    private int avoid;

    private String etc;

    public ArmorDto(String name, int level, int defense, int magicResist, int avoid, String etc) {
        this.name = name;
        this.level = level;
        this.defense = defense;
        this.magicResist = magicResist;
        this.avoid = avoid;
        this.etc = etc;
    }
}
