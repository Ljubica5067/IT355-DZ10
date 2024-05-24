package org.example.it355dz08.entity;

import javax.persistence.*;

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

    public PublisherEntity() {
    }

    public PublisherEntity(int id, String publisher) {
        this.id = id;
        this.publisherName = publisher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPublisher() {
        return publisherName;
    }

    public void setPublisher(String publisher) {
        this.publisherName = publisher;
    }
}
