package com.javaAcunMedya.bootcampApp.service.dtos.requests.bootcamp;

import com.javaAcunMedya.bootcampApp.entity.BootcampState;

import java.util.Date;

public record UpdateBootcampRequest(Long id,
                                    String name,
                                    Long instructorId,
                                    Date startDate,
                                    Date endDate, BootcampState bootcampState) {
}
