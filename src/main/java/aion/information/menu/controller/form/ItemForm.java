package aion.information.menu.controller.form;

import aion.information.menu.entity.Job;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter

@MappedSuperclass
public abstract class ItemForm extends InformationForm{

    private String name;
    private int level;

    private List<Job> jobList = new ArrayList<>();
    public ItemForm(String name, String context,List<Job> jobList) {
        super(name, context);
        this.jobList.addAll(jobList);
    }

}
