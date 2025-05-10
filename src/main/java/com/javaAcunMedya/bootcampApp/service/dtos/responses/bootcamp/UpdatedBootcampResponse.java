package com.javaAcunMedya.bootcampApp.service.dtos.responses.bootcamp;

import com.javaAcunMedya.bootcampApp.entity.BootcampState;

import java.util.Date;

public record UpdatedBootcampResponse(Long id,
                                      String name,
                                      Long instructorId,
                                      Date startDate,
                                      Date endDate, BootcampState bootcampState) {
}
