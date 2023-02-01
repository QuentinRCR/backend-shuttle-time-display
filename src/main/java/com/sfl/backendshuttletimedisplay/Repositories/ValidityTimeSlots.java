package com.sfl.backendshuttletimedisplay.Repositories;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;

/**
 * Model of time periods for witch the timeTable is effective
 */
@Entity
public class ValidityTimeSlots {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    LocalDate beginningDate;

    @Column(nullable = false)
    LocalDate endingDate;

    public ValidityTimeSlots() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getBeginningDate() {
        return beginningDate;
    }

    public void setBeginningDate(LocalDate beginningDate) {
        this.beginningDate = beginningDate;
    }

    public LocalDate getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(LocalDate endingDate) {
        this.endingDate = endingDate;
    }
}
