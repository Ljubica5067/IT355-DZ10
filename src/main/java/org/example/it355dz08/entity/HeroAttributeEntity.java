package org.example.it355dz08.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "hero_attribute", schema = "superhero", catalog = "")
public class HeroAttributeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    @Column(name = "hero_id")
    private Integer heroId;
    @Basic
    @Column(name = "attribute_id")
    private Integer attributeId;
    @Basic
    @Column(name = "attribute_value")
    private Integer attributeValue;
    @ManyToOne
    @JoinColumn(name = "attribute_id", referencedColumnName = "id")
    private AttributeEntity attributeByAttributeId;

    public Integer getHeroId() {
        return heroId;
    }

    public void setHeroId(Integer heroId) {
        this.heroId = heroId;
    }

    public Integer getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Integer attributeId) {
        this.attributeId = attributeId;
    }

    public Integer getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(Integer attributeValue) {
        this.attributeValue = attributeValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeroAttributeEntity that = (HeroAttributeEntity) o;
        return Objects.equals(heroId, that.heroId) && Objects.equals(attributeId, that.attributeId) && Objects.equals(attributeValue, that.attributeValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(heroId, attributeId, attributeValue);
    }

    public AttributeEntity getAttributeByAttributeId() {
        return attributeByAttributeId;
    }

    public void setAttributeByAttributeId(AttributeEntity attributeByAttributeId) {
        this.attributeByAttributeId = attributeByAttributeId;
    }
}
