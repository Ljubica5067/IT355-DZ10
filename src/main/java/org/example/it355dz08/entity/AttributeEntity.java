package org.example.it355dz08.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "attribute", schema = "superhero", catalog = "")
public class AttributeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "attribute_name")
    private String attributeName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AttributeEntity that = (AttributeEntity) o;
        return id == that.id && Objects.equals(attributeName, that.attributeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, attributeName);
    }
}
