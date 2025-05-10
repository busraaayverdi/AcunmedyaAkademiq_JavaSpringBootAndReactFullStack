package com.javaAcunMedya.bootcampApp.service.dtos.responses.bootcamp;

import com.javaAcunMedya.bootcampApp.entity.BootcampState;

import java.util.Date;

public record DeletedBootcampResponse(Long id,
                                      String name,
                                      String message) {
}
