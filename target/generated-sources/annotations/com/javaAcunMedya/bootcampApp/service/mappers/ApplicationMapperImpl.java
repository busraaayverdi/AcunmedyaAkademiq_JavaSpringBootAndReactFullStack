package com.javaAcunMedya.bootcampApp.service.mappers;

import com.javaAcunMedya.bootcampApp.entity.Application;
import com.javaAcunMedya.bootcampApp.entity.ApplicationState;
import com.javaAcunMedya.bootcampApp.service.dtos.requests.application.CreateApplicationRequest;
import com.javaAcunMedya.bootcampApp.service.dtos.requests.application.UpdateApplicationRequest;
import com.javaAcunMedya.bootcampApp.service.dtos.responses.application.CreatedApplicationResponse;
import com.javaAcunMedya.bootcampApp.service.dtos.responses.application.DeletedApplicationResponse;
import com.javaAcunMedya.bootcampApp.service.dtos.responses.application.GetApplicationResponse;
import com.javaAcunMedya.bootcampApp.service.dtos.responses.application.GetListApplicationResponse;
import com.javaAcunMedya.bootcampApp.service.dtos.responses.application.UpdatedApplicationResponse;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-10T17:15:12+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 23.0.2 (Oracle Corporation)"
)
@Component
public class ApplicationMapperImpl implements ApplicationMapper {

    @Override
    public Application applicationFromCreateApplicationRequest(CreateApplicationRequest request) {
        if ( request == null ) {
            return null;
        }

        Application application = new Application();

        application.setApplicantId( request.applicantId() );
        application.setBootcampId( request.bootcampId() );
        application.setApplicationState( request.applicationState() );

        return application;
    }

    @Override
    public Application applicationFromUpdateApplicationRequest(UpdateApplicationRequest request) {
        if ( request == null ) {
            return null;
        }

        Application application = new Application();

        application.setId( request.id() );
        application.setApplicantId( request.applicantId() );
        application.setBootcampId( request.bootcampId() );
        application.setApplicationState( request.applicationState() );

        return application;
    }

    @Override
    public CreatedApplicationResponse createdApplicationResponseFromApplication(Application application) {
        if ( application == null ) {
            return null;
        }

        Long id = null;
        Long applicantId = null;
        Long bootcampId = null;
        ApplicationState applicationState = null;

        id = application.getId();
        applicantId = application.getApplicantId();
        bootcampId = application.getBootcampId();
        applicationState = application.getApplicationState();

        CreatedApplicationResponse createdApplicationResponse = new CreatedApplicationResponse( id, applicantId, bootcampId, applicationState );

        return createdApplicationResponse;
    }

    @Override
    public UpdatedApplicationResponse updatedApplicationResponseFromApplication(Application application) {
        if ( application == null ) {
            return null;
        }

        Long id = null;
        Long applicantId = null;
        Long bootcampId = null;
        ApplicationState applicationState = null;

        id = application.getId();
        applicantId = application.getApplicantId();
        bootcampId = application.getBootcampId();
        applicationState = application.getApplicationState();

        UpdatedApplicationResponse updatedApplicationResponse = new UpdatedApplicationResponse( id, applicantId, bootcampId, applicationState );

        return updatedApplicationResponse;
    }

    @Override
    public GetListApplicationResponse getListApplicationResponseFromApplication(Application application) {
        if ( application == null ) {
            return null;
        }

        Long id = null;
        Long applicantId = null;
        Long bootcampId = null;
        ApplicationState applicationState = null;

        id = application.getId();
        applicantId = application.getApplicantId();
        bootcampId = application.getBootcampId();
        applicationState = application.getApplicationState();

        GetListApplicationResponse getListApplicationResponse = new GetListApplicationResponse( id, applicantId, bootcampId, applicationState );

        return getListApplicationResponse;
    }

    @Override
    public GetApplicationResponse getApplicationResponseFromApplication(Application application) {
        if ( application == null ) {
            return null;
        }

        Long id = null;
        Long applicantId = null;
        Long bootcampId = null;
        ApplicationState applicationState = null;

        id = application.getId();
        applicantId = application.getApplicantId();
        bootcampId = application.getBootcampId();
        applicationState = application.getApplicationState();

        GetApplicationResponse getApplicationResponse = new GetApplicationResponse( id, applicantId, bootcampId, applicationState );

        return getApplicationResponse;
    }

    @Override
    public DeletedApplicationResponse deletedApplicationResponseFromApplication(Application application, String message) {
        if ( application == null && message == null ) {
            return null;
        }

        Long id = null;
        if ( application != null ) {
            id = application.getId();
        }
        String message1 = null;
        message1 = message;

        DeletedApplicationResponse deletedApplicationResponse = new DeletedApplicationResponse( id, message1 );

        return deletedApplicationResponse;
    }

    @Override
    public GetListApplicationResponse applicationIdResponseFromApplication(Application application) {
        if ( application == null ) {
            return null;
        }

        Long id = null;
        Long applicantId = null;
        Long bootcampId = null;
        ApplicationState applicationState = null;

        id = application.getId();
        applicantId = application.getApplicantId();
        bootcampId = application.getBootcampId();
        applicationState = application.getApplicationState();

        GetListApplicationResponse getListApplicationResponse = new GetListApplicationResponse( id, applicantId, bootcampId, applicationState );

        return getListApplicationResponse;
    }
}
