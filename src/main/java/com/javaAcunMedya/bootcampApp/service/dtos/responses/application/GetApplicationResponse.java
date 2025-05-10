package com.javaAcunMedya.bootcampApp.service.dtos.responses.application;

import com.javaAcunMedya.bootcampApp.entity.ApplicationState;

public record GetApplicationResponse(
        Long id,
        Long applicantId,
        Long bootcampId,
        ApplicationState applicationState
) {
}
