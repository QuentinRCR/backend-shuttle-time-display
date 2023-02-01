package com.sfl.backendshuttletimedisplay.Repositories;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Stations {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;


    @ManyToMany
    private List<Lines> lines;
}
