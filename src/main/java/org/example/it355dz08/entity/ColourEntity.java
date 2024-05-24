package org.example.it355dz08.entity;

import javax.persistence.*;

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

    public ColourEntity() {
    }

    public ColourEntity(int id, String colour) {
        this.id = id;
        this.colour = colour;
    }

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
}
