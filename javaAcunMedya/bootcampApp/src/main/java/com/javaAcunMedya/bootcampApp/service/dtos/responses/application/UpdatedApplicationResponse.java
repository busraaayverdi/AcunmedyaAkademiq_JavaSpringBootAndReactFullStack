package com.javaAcunMedya.bootcampApp.service.dtos.responses.application;

import com.javaAcunMedya.bootcampApp.entity.ApplicationState;

public record UpdatedApplicationResponse(Long id,
                                         Long applicantId,
                                         Long bootcampId,
                                         ApplicationState applicationState) {
}
