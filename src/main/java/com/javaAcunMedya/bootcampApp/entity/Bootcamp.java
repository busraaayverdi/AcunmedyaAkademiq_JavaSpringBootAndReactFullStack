package com.javaAcunMedya.bootcampApp.entity;
import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
public class Bootcamp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Long instructorId;
    private Date startDate;
    private Date endDate;

    public Bootcamp() {
    }

    public Bootcamp(Long id, String name, Long instructorId, Date startDate, Date endDate,BootcampState bootcampState) {
        this.id = id;
        this.name = name;
        this.instructorId = instructorId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.bootcampState = bootcampState;
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

    public Long getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(Long instructorId) {
        this.instructorId = instructorId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public BootcampState getBootcampState() {
        return bootcampState;
    }

    public void setBootcampState(BootcampState bootcampState) {
        this.bootcampState = bootcampState;
    }

    @Enumerated(EnumType.STRING)
    private BootcampState bootcampState;
}

