package org.example.it355dz08.entity;

import javax.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "hero_attribute", schema = "superhero", catalog = "")
public class HeroAttributeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "hero_id", nullable = false)
    private SuperheroEntity hero;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "attribute_id", nullable = false)
    private AttributeEntity attribute;

    public HeroAttributeEntity() {
    }

    public HeroAttributeEntity(int id, SuperheroEntity hero, AttributeEntity attribute) {
        this.id = id;
        this.hero = hero;
        this.attribute = attribute;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SuperheroEntity getHero() {
        return hero;
    }

    public void setHero(SuperheroEntity hero) {
        this.hero = hero;
    }

    public AttributeEntity getAttribute() {
        return attribute;
    }

    public void setAttribute(AttributeEntity attribute) {
        this.attribute = attribute;
    }

}
