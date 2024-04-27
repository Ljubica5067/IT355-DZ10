package org.example.it355dz08.entity;

import jakarta.persistence.*;

import java.util.Collection;
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
    private String superheroName;
    @Basic
    @Column(name = "full_name")
    private String fullName;
    @Basic
    @Column(name = "gender_id")
    private Integer genderId;
    @Basic
    @Column(name = "eye_colour_id")
    private Integer eyeColourId;
    @Basic
    @Column(name = "hair_colour_id")
    private Integer hairColourId;
    @Basic
    @Column(name = "skin_colour_id")
    private Integer skinColourId;
    @Basic
    @Column(name = "race_id")
    private Integer raceId;
    @Basic
    @Column(name = "publisher_id")
    private Integer publisherId;
    @Basic
    @Column(name = "alignment_id")
    private Integer alignmentId;
    @Basic
    @Column(name = "height_cm")
    private Integer heightCm;
    @Basic
    @Column(name = "weight_kg")
    private Integer weightKg;
    @OneToMany(mappedBy = "superheroByHeroId")
    private Collection<HeroAttributeEntity> heroAttributesById;
    @OneToMany(mappedBy = "superheroByHeroId")
    private Collection<HeroPowerEntity> heroPowersById;
    @ManyToOne
    @JoinColumn(name = "gender_id", referencedColumnName = "id")
    private GenderEntity genderByGenderId;
    @ManyToOne
    @JoinColumn(name = "eye_colour_id", referencedColumnName = "id")
    private ColourEntity colourByEyeColourId;
    @ManyToOne
    @JoinColumn(name = "hair_colour_id", referencedColumnName = "id")
    private ColourEntity colourByHairColourId;
    @ManyToOne
    @JoinColumn(name = "skin_colour_id", referencedColumnName = "id")
    private ColourEntity colourBySkinColourId;
    @ManyToOne
    @JoinColumn(name = "race_id", referencedColumnName = "id")
    private RaceEntity raceByRaceId;
    @ManyToOne
    @JoinColumn(name = "publisher_id", referencedColumnName = "id")
    private PublisherEntity publisherByPublisherId;
    @ManyToOne
    @JoinColumn(name = "alignment_id", referencedColumnName = "id")
    private AlignmentEntity alignmentByAlignmentId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSuperheroName() {
        return superheroName;
    }

    public void setSuperheroName(String superheroName) {
        this.superheroName = superheroName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getGenderId() {
        return genderId;
    }

    public void setGenderId(Integer genderId) {
        this.genderId = genderId;
    }

    public Integer getEyeColourId() {
        return eyeColourId;
    }

    public void setEyeColourId(Integer eyeColourId) {
        this.eyeColourId = eyeColourId;
    }

    public Integer getHairColourId() {
        return hairColourId;
    }

    public void setHairColourId(Integer hairColourId) {
        this.hairColourId = hairColourId;
    }

    public Integer getSkinColourId() {
        return skinColourId;
    }

    public void setSkinColourId(Integer skinColourId) {
        this.skinColourId = skinColourId;
    }

    public Integer getRaceId() {
        return raceId;
    }

    public void setRaceId(Integer raceId) {
        this.raceId = raceId;
    }

    public Integer getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Integer publisherId) {
        this.publisherId = publisherId;
    }

    public Integer getAlignmentId() {
        return alignmentId;
    }

    public void setAlignmentId(Integer alignmentId) {
        this.alignmentId = alignmentId;
    }

    public Integer getHeightCm() {
        return heightCm;
    }

    public void setHeightCm(Integer heightCm) {
        this.heightCm = heightCm;
    }

    public Integer getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(Integer weightKg) {
        this.weightKg = weightKg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SuperheroEntity that = (SuperheroEntity) o;
        return id == that.id && Objects.equals(superheroName, that.superheroName) && Objects.equals(fullName, that.fullName) && Objects.equals(genderId, that.genderId) && Objects.equals(eyeColourId, that.eyeColourId) && Objects.equals(hairColourId, that.hairColourId) && Objects.equals(skinColourId, that.skinColourId) && Objects.equals(raceId, that.raceId) && Objects.equals(publisherId, that.publisherId) && Objects.equals(alignmentId, that.alignmentId) && Objects.equals(heightCm, that.heightCm) && Objects.equals(weightKg, that.weightKg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, superheroName, fullName, genderId, eyeColourId, hairColourId, skinColourId, raceId, publisherId, alignmentId, heightCm, weightKg);
    }

    public Collection<HeroAttributeEntity> getHeroAttributesById() {
        return heroAttributesById;
    }

    public void setHeroAttributesById(Collection<HeroAttributeEntity> heroAttributesById) {
        this.heroAttributesById = heroAttributesById;
    }

    public Collection<HeroPowerEntity> getHeroPowersById() {
        return heroPowersById;
    }

    public void setHeroPowersById(Collection<HeroPowerEntity> heroPowersById) {
        this.heroPowersById = heroPowersById;
    }

    public GenderEntity getGenderByGenderId() {
        return genderByGenderId;
    }

    public void setGenderByGenderId(GenderEntity genderByGenderId) {
        this.genderByGenderId = genderByGenderId;
    }

    public ColourEntity getColourByEyeColourId() {
        return colourByEyeColourId;
    }

    public void setColourByEyeColourId(ColourEntity colourByEyeColourId) {
        this.colourByEyeColourId = colourByEyeColourId;
    }

    public ColourEntity getColourByHairColourId() {
        return colourByHairColourId;
    }

    public void setColourByHairColourId(ColourEntity colourByHairColourId) {
        this.colourByHairColourId = colourByHairColourId;
    }

    public ColourEntity getColourBySkinColourId() {
        return colourBySkinColourId;
    }

    public void setColourBySkinColourId(ColourEntity colourBySkinColourId) {
        this.colourBySkinColourId = colourBySkinColourId;
    }

    public RaceEntity getRaceByRaceId() {
        return raceByRaceId;
    }

    public void setRaceByRaceId(RaceEntity raceByRaceId) {
        this.raceByRaceId = raceByRaceId;
    }

    public PublisherEntity getPublisherByPublisherId() {
        return publisherByPublisherId;
    }

    public void setPublisherByPublisherId(PublisherEntity publisherByPublisherId) {
        this.publisherByPublisherId = publisherByPublisherId;
    }

    public AlignmentEntity getAlignmentByAlignmentId() {
        return alignmentByAlignmentId;
    }

    public void setAlignmentByAlignmentId(AlignmentEntity alignmentByAlignmentId) {
        this.alignmentByAlignmentId = alignmentByAlignmentId;
    }
}
