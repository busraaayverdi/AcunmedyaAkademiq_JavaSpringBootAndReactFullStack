package com.javaAcunMedya.bootcampApp.repository;

import com.javaAcunMedya.bootcampApp.entity.Blacklist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BlacklistRepository extends JpaRepository<Blacklist,Long> {
    List<Blacklist> findByApplicantId(Long applicantId);
}
