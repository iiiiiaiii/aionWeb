package aion.information.menu.entity.information;

import aion.information.menu.controller.form.InformationForm;
import aion.information.menu.entity.BaseEntityPlus;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter

public class Information extends BaseEntityPlus {
    @Id
    @GeneratedValue
    @Column(name="information_id")
    private Long id;
    private String name;
    private String content;

    protected Information() {

    }

    public Information(String name, String content) {
        this.name = name;
        this.content = content;
    }
}
