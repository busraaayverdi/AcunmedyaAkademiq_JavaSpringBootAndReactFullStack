package com.javaAcunMedya.bootcampApp.repository;

import com.javaAcunMedya.bootcampApp.entity.Bootcamp;
import com.javaAcunMedya.bootcampApp.entity.BootcampState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BootcampRepository extends JpaRepository<Bootcamp,Long> {
    List<Bootcamp> findByBootcampState(BootcampState state);
}
