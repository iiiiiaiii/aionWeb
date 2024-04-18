package aion.information.menu.entity.item;

import aion.information.menu.entity.AccessoryKind;
import aion.information.menu.entity.Job;
import aion.information.menu.entity.Value;
import jakarta.persistence.*;
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

    @Enumerated(EnumType.STRING)
    private AccessoryKind accessoryKind;

    public Accessory(String name, int level, Value value, List<Job> jobList, int magicResist, String etc, AccessoryKind accessoryKind) {
        super(name, level, value, jobList);
        this.magicResist = magicResist;
        this.etc = etc;
        this.accessoryKind = accessoryKind;
    }
}
