package aion.information.menu.dto;

public class SkillDto {

    private String name;
    private int level;
    private int coolTime;
    private String content;

    public SkillDto(String name, int level, int coolTime, String content) {
        this.name = name;
        this.level = level;
        this.coolTime = coolTime;
        this.content = content;
    }
}
