package org.example.it355dz08.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "superpower", schema = "superhero", catalog = "")
public class SuperpowerEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "power_name")
    private String powerName;

    public SuperpowerEntity() {
    }

    public SuperpowerEntity(int id, String powerName) {
        this.id = id;
        this.powerName = powerName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPowerName() {
        return powerName;
    }

    public void setPowerName(String powerName) {
        this.powerName = powerName;
    }
}
