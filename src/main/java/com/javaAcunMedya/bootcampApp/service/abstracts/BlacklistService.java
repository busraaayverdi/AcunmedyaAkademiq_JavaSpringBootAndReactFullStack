package com.javaAcunMedya.bootcampApp.service.abstracts;

import com.javaAcunMedya.bootcampApp.service.dtos.requests.blacklist.CreateBlacklistRequest;
import com.javaAcunMedya.bootcampApp.service.dtos.requests.blacklist.UpdateBlacklistRequest;
import com.javaAcunMedya.bootcampApp.service.dtos.responses.blacklist.*;

import java.util.List;

public interface BlacklistService {
    CreatedBlacklistResponse add(CreateBlacklistRequest request);
    UpdatedBlacklistResponse update(Long id,UpdateBlacklistRequest request);
    DeletedBlacklistResponse delete(Long id);
    GetBlacklistResponse getById(Long id);
    List<GetListBlacklistResponse> getList();
    List<GetListBlacklistResponse> getAllByApplicantId(Long applicantId);
}
