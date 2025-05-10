package com.javaAcunMedya.bootcampApp.service.abstracts;

import com.javaAcunMedya.bootcampApp.entity.Application;
import com.javaAcunMedya.bootcampApp.service.dtos.requests.application.CreateApplicationRequest;
import com.javaAcunMedya.bootcampApp.service.dtos.requests.application.UpdateApplicationRequest;
import com.javaAcunMedya.bootcampApp.service.dtos.responses.application.*;

import java.util.List;

public interface ApplicationService {
    CreatedApplicationResponse add(CreateApplicationRequest request);
    UpdatedApplicationResponse update(UpdateApplicationRequest request);
    DeletedApplicationResponse delete(Long id);
    GetApplicationResponse getById(Long id);
    List<GetListApplicationResponse> getList();

    List<GetListApplicationResponse> getAllByApplicantId(Long applicantId);
}
