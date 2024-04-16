package aion.information.menu.entity.item;

import aion.information.menu.entity.ArmorKind;
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
    private ArmorKind armorKind;

    public Armor(String name, int level, Value value, List<Job> jobList, Long id, int defense, int magicResist, int avoid, String etc, ArmorKind armorKind) {
        super(name, level, value, jobList);
        this.id = id;
        this.defense = defense;
        this.magicResist = magicResist;
        this.avoid = avoid;
        this.etc = etc;
        this.armorKind = armorKind;
    }
}
