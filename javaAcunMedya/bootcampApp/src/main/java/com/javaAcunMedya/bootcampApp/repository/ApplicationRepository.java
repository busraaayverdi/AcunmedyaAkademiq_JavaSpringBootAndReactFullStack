package com.javaAcunMedya.bootcampApp.repository;

import com.javaAcunMedya.bootcampApp.entity.Application;
import com.javaAcunMedya.bootcampApp.entity.ApplicationState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplicationRepository extends JpaRepository<Application,Long> {
    List<Application> findByApplicantId(Long applicantId);
    List<Application> findByApplicationState(ApplicationState state);
}
