package com.javaAcunMedya.bootcampApp.service.dtos.responses.blacklist;

import java.util.Date;

public record UpdatedBlacklistResponse(Long id,
                                       String reason,
                                       Date date,
                                       Long applicantId) {
}
