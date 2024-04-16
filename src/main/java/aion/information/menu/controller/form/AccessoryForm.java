package aion.information.menu.controller.form;

import aion.information.menu.entity.AccessoryKind;
import aion.information.menu.entity.Job;
import aion.information.menu.entity.Value;
import lombok.Getter;

import java.util.List;

@Getter

public class AccessoryForm extends ItemForm{

    private int magicResist;
    private String etc;
    private AccessoryKind accessoryKind;

    public AccessoryForm(String name, String context, int level, Value value, List<Job> jobList, int magicResist, String etc, AccessoryKind accessoryKind) {
        super(name, context, level, value, jobList);
        this.magicResist = magicResist;
        this.etc = etc;
        this.accessoryKind = accessoryKind;
    }
}
