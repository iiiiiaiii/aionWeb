package aion.information.menu.controller.form;

import aion.information.menu.entity.Job;
import aion.information.menu.entity.Value;
import lombok.Getter;

import java.util.List;

@Getter
public class ArmorForm extends ItemForm{

    private int defense;
    private int magicResist;
    private int avoid;
    private String etc;
    private Value value;


    public ArmorForm(String name, String context, List<Job> jobList, int defense, int magicResist, int avoid, String etc, Value value) {
        super(name, context, jobList);
        this.defense = defense;
        this.magicResist = magicResist;
        this.avoid = avoid;
        this.etc = etc;
        this.value = value;
    }
}
