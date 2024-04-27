package org.example.it355dz08.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "publisher", schema = "superhero", catalog = "")
public class PublisherEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "publisher_name")
    private String publisherName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PublisherEntity that = (PublisherEntity) o;
        return id == that.id && Objects.equals(publisherName, that.publisherName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, publisherName);
    }
}
