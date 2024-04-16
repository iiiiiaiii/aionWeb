package aion.information.menu.entity.item;

import aion.information.menu.entity.Job;
import aion.information.menu.entity.Value;
import aion.information.menu.entity.item.Item;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Getter
public class Armor extends Item {
    @Id
    @GeneratedValue
    @Column(name = "armor_id")
    private Long id;

    private int defense;
    private int magicResist;
    private int avoid;

    private String etc;

    public Armor(String name, int level, Value value, List<Job> jobList, int defense, int magicResist, int avoid, String etc) {
        super(name, level, value, jobList);
        this.defense = defense;
        this.magicResist = magicResist;
        this.avoid = avoid;
        this.etc = etc;
    }
}
