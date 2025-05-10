package com.javaAcunMedya.bootcampApp.service.dtos.requests.application;

import com.javaAcunMedya.bootcampApp.entity.ApplicationState;

public record CreateApplicationRequest(Long applicantId,
                                       Long bootcampId,
                                       ApplicationState applicationState) {
}
