package org.example.it355dz08.entity;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "superpower", schema = "superhero", catalog = "")
public class SuperpowerEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "power_name")
    private String powerName;
    @OneToMany(mappedBy = "superpowerByPowerId")
    private Collection<HeroPowerEntity> heroPowersById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPowerName() {
        return powerName;
    }

    public void setPowerName(String powerName) {
        this.powerName = powerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SuperpowerEntity that = (SuperpowerEntity) o;
        return id == that.id && Objects.equals(powerName, that.powerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, powerName);
    }

    public Collection<HeroPowerEntity> getHeroPowersById() {
        return heroPowersById;
    }

    public void setHeroPowersById(Collection<HeroPowerEntity> heroPowersById) {
        this.heroPowersById = heroPowersById;
    }
}
