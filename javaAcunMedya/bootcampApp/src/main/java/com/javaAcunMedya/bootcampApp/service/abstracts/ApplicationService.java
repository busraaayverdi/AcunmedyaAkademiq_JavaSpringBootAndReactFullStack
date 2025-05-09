package com.javaAcunMedya.bootcampApp.service.abstracts;

import com.javaAcunMedya.bootcampApp.entity.ApplicationState;
import com.javaAcunMedya.bootcampApp.service.dtos.requests.application.CreateApplicationRequest;
import com.javaAcunMedya.bootcampApp.service.dtos.requests.application.UpdateApplicationRequest;
import com.javaAcunMedya.bootcampApp.service.dtos.responses.application.CreatedApplicationResponse;
import com.javaAcunMedya.bootcampApp.service.dtos.responses.application.GetApplicationResponse;
import com.javaAcunMedya.bootcampApp.service.dtos.responses.application.GetListApplicationResponse;
import com.javaAcunMedya.bootcampApp.service.dtos.responses.application.UpdatedApplicationResponse;

import java.util.List;

public interface ApplicationService {
    CreatedApplicationResponse createApplication(CreateApplicationRequest request);
    UpdatedApplicationResponse updateApplication(Long id, UpdateApplicationRequest request);
    void deleteApplication(Long id);
    GetApplicationResponse getApplicationById(Long id);
    List<GetApplicationResponse> getAllApplications();
    List<GetApplicationResponse> getApplicationsByState(ApplicationState state);

}
