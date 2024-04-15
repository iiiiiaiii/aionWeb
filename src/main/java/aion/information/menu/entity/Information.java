package aion.information.menu.entity;

import aion.information.menu.controller.form.Form;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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

    public Information(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public void updatePost(Form form) {
        name = form.name;
        content = form.content;
    }
}
