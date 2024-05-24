package org.example.it355dz08.entity;



import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "gender", schema = "superhero", catalog = "")
public class GenderEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "gender")
    private String gender;

    public GenderEntity() {
    }

    public GenderEntity(int id, String gender) {
        this.id = id;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
