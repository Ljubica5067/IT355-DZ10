package org.example.it355dz08.entity;

import javax.persistence.*;

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

    public AttributeEntity() {
    }

    public AttributeEntity(int id, String attributeName) {
        this.id = id;
        this.attributeName = attributeName;
    }

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
}
