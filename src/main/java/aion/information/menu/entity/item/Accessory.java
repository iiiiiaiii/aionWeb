package aion.information.menu.entity.item;

import aion.information.menu.entity.AccessoryKind;
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
    private AccessoryKind accessoryKind;

    public Accessory(String name, int level, Value value, List<Job> jobList, Long id, int magicResist, String etc, AccessoryKind accessoryKind) {
        super(name, level, value, jobList);
        this.id = id;
        this.magicResist = magicResist;
        this.etc = etc;
        this.accessoryKind = accessoryKind;
    }
}
