package aion.information.menu.entity.skill;

import aion.information.menu.entity.BaseEntity;
import aion.information.menu.entity.Job;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter

public class Skill extends BaseEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int level;
    private int coolTime;
    private String content;
    private Job job;

    public Skill(String name, int level, int coolTime, String content, Job job) {
        this.name = name;
        this.level = level;
        this.coolTime = coolTime;
        this.content = content;
        this.job = job;
    }
}
