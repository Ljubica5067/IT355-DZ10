package org.example.it355dz08.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "colour", schema = "superhero", catalog = "")
public class ColourEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "colour")
    private String colour;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ColourEntity that = (ColourEntity) o;
        return id == that.id && Objects.equals(colour, that.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, colour);
    }
}
