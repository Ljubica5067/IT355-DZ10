package org.example.it355dz08.entity;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "superhero", schema = "superhero", catalog = "")
public class SuperheroEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "superhero_name")
    private String superHeroName;

    @Basic
    @Column(name = "full_name")
    private String fullName;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "gender_id", nullable = false)
    private GenderEntity gender;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "eye_colour_id", nullable = false)
    private ColourEntity eyeColour;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "hair_colour_id", nullable = false)
    private ColourEntity hairColour;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "skin_colour_id", nullable = false)
    private ColourEntity skinColour;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "race_id", nullable = false)
    private RaceEntity race;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "publisher_id", nullable = false)
    private PublisherEntity publisher;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "alignment_id", nullable = false)
    private AlignmentEntity alignment;

    @Basic
    @Column(name = "height_cm")
    private int heightCm;

    @Basic
    @Column(name = "weight_kg")
    private int weightKg;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "hero_power",
            joinColumns = @JoinColumn(name = "hero_id"),
            inverseJoinColumns = @JoinColumn(name = "power_id"))
    private List<SuperpowerEntity> superpower = new ArrayList<>();

    public SuperheroEntity() {
    }

    public SuperheroEntity(int id, String superHeroName, String fullName, GenderEntity gender, ColourEntity eyeColour, ColourEntity hairColour, ColourEntity skinColour, RaceEntity race, PublisherEntity publisher, AlignmentEntity alignment, int heightCm, int weightKg, List<SuperpowerEntity> superpower) {
        this.id = id;
        this.superHeroName = superHeroName;
        this.fullName = fullName;
        this.gender = gender;
        this.eyeColour = eyeColour;
        this.hairColour = hairColour;
        this.skinColour = skinColour;
        this.race = race;
        this.publisher = publisher;
        this.alignment = alignment;
        this.heightCm = heightCm;
        this.weightKg = weightKg;
        this.superpower = superpower;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSuperHeroName() {
        return superHeroName;
    }

    public void setSuperHeroName(String superHeroName) {
        this.superHeroName = superHeroName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public GenderEntity getGender() {
        return gender;
    }

    public void setGender(GenderEntity gender) {
        this.gender = gender;
    }

    public ColourEntity getEyeColour() {
        return eyeColour;
    }

    public void setEyeColour(ColourEntity eyeColour) {
        this.eyeColour = eyeColour;
    }

    public ColourEntity getHairColour() {
        return hairColour;
    }

    public void setHairColour(ColourEntity hairColour) {
        this.hairColour = hairColour;
    }

    public ColourEntity getSkinColour() {
        return skinColour;
    }

    public void setSkinColour(ColourEntity skinColour) {
        this.skinColour = skinColour;
    }

    public RaceEntity getRace() {
        return race;
    }

    public void setRace(RaceEntity race) {
        this.race = race;
    }

    public PublisherEntity getPublisher() {
        return publisher;
    }

    public void setPublisher(PublisherEntity publisher) {
        this.publisher = publisher;
    }

    public AlignmentEntity getAlignment() {
        return alignment;
    }

    public void setAlignment(AlignmentEntity alignment) {
        this.alignment = alignment;
    }

    public int getHeightCm() {
        return heightCm;
    }

    public void setHeightCm(int heightCm) {
        this.heightCm = heightCm;
    }

    public int getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(int weightKg) {
        this.weightKg = weightKg;
    }

    public List<SuperpowerEntity> getSuperpower() {
        return superpower;
    }

    public void setSuperpower(List<SuperpowerEntity> superpower) {
        this.superpower = superpower;
    }
}
