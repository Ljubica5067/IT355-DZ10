package org.example.it355dz08.entity;

import jakarta.persistence.*;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlignmentEntity that = (AlignmentEntity) o;
        return id == that.id && Objects.equals(alignment, that.alignment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, alignment);
    }
}
