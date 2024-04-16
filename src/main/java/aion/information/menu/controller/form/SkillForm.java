package aion.information.menu.controller.form;

import aion.information.menu.entity.Job;
import lombok.Getter;

import java.util.List;

@Getter

public class SkillForm extends InformationForm{
    private int coolTime;
    private String etc;
    private Job job;

    public SkillForm(String name, String context, int coolTime, String etc, Job job) {
        super(name, context);
        this.coolTime = coolTime;
        this.etc = etc;
        this.job = job;
    }
}
