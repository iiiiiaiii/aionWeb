package aion.information.menu.controller.form;

import aion.information.menu.entity.Job;
import aion.information.menu.entity.Value;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter

@MappedSuperclass
public abstract class ItemForm extends InformationForm{

    private int level;
    private Value value;

    private List<Job> jobList = new ArrayList<>();

    public ItemForm(String name, String context, int level, Value value, List<Job> jobList) {
        super(name, context);
        this.level = level;
        this.value = value;
        this.jobList = jobList;
    }
}
