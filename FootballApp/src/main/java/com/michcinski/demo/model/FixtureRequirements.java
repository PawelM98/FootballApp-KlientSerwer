package com.michcinski.demo.model;

public class FixtureRequirements {
    private Long id;
    private int number;

    public FixtureRequirements(Long id, int number) {
        this.id = id;
        this.number = number;
    }

    public FixtureRequirements() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
