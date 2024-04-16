package aion.information.menu.controller.form;

import aion.information.menu.entity.Job;
import lombok.Getter;

import java.util.List;

@Getter

public class AccessoryForm extends ItemForm{

    private int magicResist;
    private String etc;

    public AccessoryForm(String name, String context, List<Job> jobList, int magicResist, String etc) {
        super(name, context, jobList);
        this.magicResist = magicResist;
        this.etc = etc;
    }
}
