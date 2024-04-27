package org.example.it355dz08.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "hero_power", schema = "superhero", catalog = "")
public class HeroPowerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    @Column(name = "hero_id")
    private Integer heroId;
    @Basic
    @Column(name = "power_id")
    private Integer powerId;

    public Integer getHeroId() {
        return heroId;
    }

    public void setHeroId(Integer heroId) {
        this.heroId = heroId;
    }

    public Integer getPowerId() {
        return powerId;
    }

    public void setPowerId(Integer powerId) {
        this.powerId = powerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeroPowerEntity that = (HeroPowerEntity) o;
        return Objects.equals(heroId, that.heroId) && Objects.equals(powerId, that.powerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(heroId, powerId);
    }
}
