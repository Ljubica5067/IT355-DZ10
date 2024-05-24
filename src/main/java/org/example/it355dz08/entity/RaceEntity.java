package org.example.it355dz08.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "race", schema = "superhero", catalog = "")
public class RaceEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "race")
    private String race;

    public RaceEntity() {
    }

    public RaceEntity(int id, String race) {
        this.id = id;
        this.race = race;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}
