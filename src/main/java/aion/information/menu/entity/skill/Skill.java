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

    private int coolTime;
    private String etc;
    private Job job;

    public Skill(int coolTime, String etc, Job job) {
        this.coolTime = coolTime;
        this.etc = etc;
        this.job = job;
    }
}
