package aion.information.menu.dto;

import lombok.Getter;

@Getter
public class AccessoryDto {
    private String name;
    private int level;
    private int magicResists;
    private String etc;

    protected AccessoryDto() {

    }

    public AccessoryDto(String name, int level, int magicResists, String etc) {
        this.name = name;
        this.level = level;
        this.magicResists = magicResists;
        this.etc = etc;
    }
}
