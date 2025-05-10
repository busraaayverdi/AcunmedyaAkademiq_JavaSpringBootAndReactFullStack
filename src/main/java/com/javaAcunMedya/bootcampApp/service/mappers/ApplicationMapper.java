package com.javaAcunMedya.bootcampApp.service.mappers;

import com.javaAcunMedya.bootcampApp.entity.Application;
import com.javaAcunMedya.bootcampApp.service.dtos.requests.application.CreateApplicationRequest;
import com.javaAcunMedya.bootcampApp.service.dtos.requests.application.UpdateApplicationRequest;
import com.javaAcunMedya.bootcampApp.service.dtos.responses.application.*;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring") // Spring ile uyumlu hale getiriyoruz
public interface ApplicationMapper {

    // Create Request -> Entity
    Application applicationFromCreateApplicationRequest(CreateApplicationRequest request);

    // Update Request -> Entity
    Application applicationFromUpdateApplicationRequest(UpdateApplicationRequest request);

    // Entity -> Created Response
    CreatedApplicationResponse createdApplicationResponseFromApplication(Application application);

    // Entity -> Updated Response
    UpdatedApplicationResponse updatedApplicationResponseFromApplication(Application application);

    // Entity -> GetAll Response
    GetListApplicationResponse getListApplicationResponseFromApplication(Application application);

    // Entity -> Get Response
    GetApplicationResponse getApplicationResponseFromApplication(Application application);

    // Entity -> Deleted Response
    DeletedApplicationResponse deletedApplicationResponseFromApplication(Application application ,String message);

    GetListApplicationResponse applicationIdResponseFromApplication(Application application);

}
