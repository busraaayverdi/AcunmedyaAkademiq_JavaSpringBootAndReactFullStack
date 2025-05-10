package com.javaAcunMedya.bootcampApp.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long applicantId;
    private Long bootcampId;

    public Application(Long id, Long applicantId, Long bootcampId, ApplicationState applicationState) {
        this.id = id;
        this.applicantId = applicantId;
        this.bootcampId = bootcampId;
        this.applicationState = applicationState;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(Long applicantId) {
        this.applicantId = applicantId;
    }

    public Long getBootcampId() {
        return bootcampId;
    }

    public void setBootcampId(Long bootcampId) {
        this.bootcampId = bootcampId;
    }

    public ApplicationState getApplicationState() {
        return applicationState;
    }

    public void setApplicationState(ApplicationState applicationState) {
        this.applicationState = applicationState;
    }

    @Enumerated(EnumType.STRING)
    private ApplicationState applicationState;

    public Application() {

    }
}

