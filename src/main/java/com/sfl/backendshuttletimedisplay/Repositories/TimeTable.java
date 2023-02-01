package com.sfl.backendshuttletimedisplay.Repositories;

import jakarta.persistence.*;

import java.time.LocalTime;

/**
 * Link the time of the bus to the stations and the lines
 */
@Entity
public class TimeTable {

    @Id
    @GeneratedValue
    private Long id;


    @Column(nullable = false)
    private LocalTime time;

    @ManyToOne
    private Stations station;

    @ManyToOne
    private Lines line;

    @ManyToOne
    private ValidityTimeSlots validityTimeSlot;

    public TimeTable() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public Stations getStation() {
        return station;
    }

    public void setStation(Stations station) {
        this.station = station;
    }

    public Lines getLine() {
        return line;
    }

    public void setLine(Lines line) {
        this.line = line;
    }

    public ValidityTimeSlots getValidityTimeSlot() {
        return validityTimeSlot;
    }

    public void setValidityTimeSlot(ValidityTimeSlots validityTimeSlot) {
        this.validityTimeSlot = validityTimeSlot;
    }
}
