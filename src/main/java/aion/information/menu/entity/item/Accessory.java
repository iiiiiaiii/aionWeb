package aion.information.menu.entity.item;

import aion.information.menu.entity.Job;
import aion.information.menu.entity.Value;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

import java.util.List;

@Entity
@Getter
public class Accessory extends Item {
    @Id
    @GeneratedValue
    private Long id;
    private int magicResist;
    private String etc;

    public Accessory(String name, int level, Value value, List<Job> jobList, int magicResist, String etc) {
        super(name, level, value, jobList);
        this.magicResist = magicResist;
        this.etc = etc;
    }
}
