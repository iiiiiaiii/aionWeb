package aion.information.menu.entity.item;

import aion.information.menu.entity.BaseEntity;
import aion.information.menu.entity.Job;
import aion.information.menu.entity.Value;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@MappedSuperclass
public abstract class Item extends BaseEntity {
    private String name;
    private int level;
    private Value value;
    @Enumerated(EnumType.STRING)
    private List<Job> jobs = new ArrayList<>();


    public Item(String name, int level, Value value, List<Job> jobList) {
        this.name = name;
        this.level = level;
        this.value = value;
        this.jobs.addAll(jobList);
    }
}
