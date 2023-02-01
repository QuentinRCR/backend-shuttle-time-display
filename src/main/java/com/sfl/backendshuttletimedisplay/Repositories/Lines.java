package com.sfl.backendshuttletimedisplay.Repositories;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Lines {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Long idTeminus1;

    @Column(nullable = false)
    private Long idTerminus2;

    @ManyToMany
    private List<Stations> stations;

    public Lines() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getIdTeminus1() {
        return idTeminus1;
    }

    public void setIdTeminus1(Long idTeminus1) {
        this.idTeminus1 = idTeminus1;
    }

    public Long getIdTerminus2() {
        return idTerminus2;
    }

    public void setIdTerminus2(Long idTerminus2) {
        this.idTerminus2 = idTerminus2;
    }
}
