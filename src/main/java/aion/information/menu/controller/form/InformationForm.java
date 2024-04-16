package aion.information.menu.controller.form;

import lombok.Getter;

@Getter
public class InformationForm {
    private String name;
    private String context;

    public InformationForm(String name, String context) {
        this.name = name;
        this.context = context;
    }
}
