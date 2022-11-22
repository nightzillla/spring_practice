package com.codeup.springpractice.models;

import javax.persistence.*;

@Entity
@Table(name = "parks")
public class NationalParks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    // GETTER
    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    // SETTER
    public void setId(long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    // Constructors
    public NationalParks(){
    }
    public NationalParks(String name) {
        this.name = name;
    }
}
