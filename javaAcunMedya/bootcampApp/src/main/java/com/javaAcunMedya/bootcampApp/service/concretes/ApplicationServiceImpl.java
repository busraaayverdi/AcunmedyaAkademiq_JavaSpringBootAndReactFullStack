package com.javaAcunMedya.bootcampApp.service.concretes;

import com.javaAcunMedya.bootcampApp.entity.ApplicationState;
import com.javaAcunMedya.bootcampApp.service.abstracts.ApplicationService;
import com.javaAcunMedya.bootcampApp.service.dtos.requests.application.CreateApplicationRequest;
import com.javaAcunMedya.bootcampApp.service.dtos.requests.application.UpdateApplicationRequest;
import com.javaAcunMedya.bootcampApp.service.dtos.responses.application.CreatedApplicationResponse;
import com.javaAcunMedya.bootcampApp.service.dtos.responses.application.GetApplicationResponse;
import com.javaAcunMedya.bootcampApp.service.dtos.responses.application.UpdatedApplicationResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService {
    @Override
    public CreatedApplicationResponse createApplication(CreateApplicationRequest request) {
        return null;
    }

    @Override
    public UpdatedApplicationResponse updateApplication(Long id, UpdateApplicationRequest request) {
        return null;
    }

    @Override
    public void deleteApplication(Long id) {

    }

    @Override
    public GetApplicationResponse getApplicationById(Long id) {
        return null;
    }

    @Override
    public List<GetApplicationResponse> getAllApplications() {
        return List.of();
    }

    @Override
    public List<GetApplicationResponse> getApplicationsByState(ApplicationState state) {
        return List.of();
    }
}
