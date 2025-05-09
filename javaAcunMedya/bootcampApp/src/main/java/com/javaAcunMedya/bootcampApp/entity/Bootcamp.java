package com.javaAcunMedya.bootcampApp.entity;
import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bootcamp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Long instructorId;
    private Date startDate;
    private Date endDate;

    @Enumerated(EnumType.STRING)
    private BootcampState bootcampState;
}

