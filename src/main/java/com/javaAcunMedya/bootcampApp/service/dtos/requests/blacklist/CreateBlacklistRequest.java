package com.javaAcunMedya.bootcampApp.service.dtos.requests.blacklist;

import java.util.Date;

public record CreateBlacklistRequest(
        String reason,
        Date date,
        Long applicantId) {
}
