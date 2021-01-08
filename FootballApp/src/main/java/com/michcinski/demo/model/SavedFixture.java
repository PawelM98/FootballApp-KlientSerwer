package com.michcinski.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SavedFixture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int fixtureId;

    public SavedFixture(int fixtureId) {
        this.fixtureId = fixtureId;
    }

    public SavedFixture() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getFixtureId() {
        return fixtureId;
    }

    public void setFixtureId(int fixtureId) {
        this.fixtureId = fixtureId;
    }

    @Override
    public String toString() {
        return "SavedFixture{" +
                "id=" + id +
                ", fixtureId=" + fixtureId +
                '}';
    }
}
