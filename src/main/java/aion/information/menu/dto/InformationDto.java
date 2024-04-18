package aion.information.menu.dto;

import lombok.Data;

@Data

public class InformationDto {

    private String name;
    private String content;


    public InformationDto(String name, String content) {
        this.name = name;
        this.content = content;
    }
}
