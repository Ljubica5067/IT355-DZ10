package org.example.it355dz08.entity;

import jakarta.persistence.*;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RaceEntity that = (RaceEntity) o;
        return id == that.id && Objects.equals(race, that.race);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, race);
    }
}
