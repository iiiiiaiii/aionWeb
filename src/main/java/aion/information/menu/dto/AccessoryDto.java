package aion.information.menu.dto;

import lombok.Getter;

@Getter
public class AccessoryDto {
    private String name;
    private String level;
    private int magicResists;
    private String etc;
    private String value;
    private String kind;

    public AccessoryDto(String name, String level, int magicResists, String etc, String value, String kind) {
        this.name = name;
        this.level = level;
        this.magicResists = magicResists;
        this.etc = etc;
        this.value = value;
        this.kind = kind;
    }
}
