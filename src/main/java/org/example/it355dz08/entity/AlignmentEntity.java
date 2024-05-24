package org.example.it355dz08.entity;

import javax.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "alignment", schema = "superhero", catalog = "")
public class        AlignmentEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "alignment")
    private String alignment;

    public AlignmentEntity() {
    }

    public AlignmentEntity(int id, String alignment) {
        this.id = id;
        this.alignment = alignment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }
}
