package com.javaAcunMedya.bootcampApp.service.dtos.responses.blacklist;

import java.util.Date;

public record GetListBlacklistResponse(Long id,
                                       String reason,
                                       Date date,
                                       Long applicantId) {
}
