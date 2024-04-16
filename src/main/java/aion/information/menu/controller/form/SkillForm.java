package aion.information.menu.controller.form;

import aion.information.menu.entity.Job;
import lombok.Getter;

import java.util.List;

@Getter

public class SkillForm extends InformationForm{

    private int level;
    private int coolTime;
    private Job job;

    public SkillForm(String name, String context, int level, int coolTime, Job job) {

        super(name, context);
        this.level = level;
        this.coolTime = coolTime;
        this.job = job;
    }
}
