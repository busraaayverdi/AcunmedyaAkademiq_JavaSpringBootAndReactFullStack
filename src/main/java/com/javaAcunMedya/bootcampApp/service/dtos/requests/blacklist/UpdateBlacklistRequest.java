package com.javaAcunMedya.bootcampApp.service.dtos.requests.blacklist;

import java.util.Date;

public record UpdateBlacklistRequest(Long id,
                                     String reason,
                                     Date date,
                                     Long applicantId) {
}
