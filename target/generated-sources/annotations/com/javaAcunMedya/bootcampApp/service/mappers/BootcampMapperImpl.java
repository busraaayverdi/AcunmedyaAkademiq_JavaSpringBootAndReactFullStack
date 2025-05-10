package com.javaAcunMedya.bootcampApp.service.mappers;

import com.javaAcunMedya.bootcampApp.entity.Bootcamp;
import com.javaAcunMedya.bootcampApp.entity.BootcampState;
import com.javaAcunMedya.bootcampApp.service.dtos.requests.bootcamp.CreateBootcampRequest;
import com.javaAcunMedya.bootcampApp.service.dtos.requests.bootcamp.UpdateBootcampRequest;
import com.javaAcunMedya.bootcampApp.service.dtos.responses.bootcamp.CreatedBootcampResponse;
import com.javaAcunMedya.bootcampApp.service.dtos.responses.bootcamp.DeletedBootcampResponse;
import com.javaAcunMedya.bootcampApp.service.dtos.responses.bootcamp.GetBootcampResponse;
import com.javaAcunMedya.bootcampApp.service.dtos.responses.bootcamp.GetListBootcampResponse;
import com.javaAcunMedya.bootcampApp.service.dtos.responses.bootcamp.UpdatedBootcampResponse;
import java.util.Date;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-10T17:15:12+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 23.0.2 (Oracle Corporation)"
)
@Component
public class BootcampMapperImpl implements BootcampMapper {

    @Override
    public Bootcamp bootcampFromCreateBootcampRequest(CreateBootcampRequest request) {
        if ( request == null ) {
            return null;
        }

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setName( request.name() );
        bootcamp.setInstructorId( request.instructorId() );
        bootcamp.setStartDate( request.startDate() );
        bootcamp.setEndDate( request.endDate() );
        bootcamp.setBootcampState( request.bootcampState() );

        return bootcamp;
    }

    @Override
    public Bootcamp bootcampFromUpdateBootcampRequest(UpdateBootcampRequest request) {
        if ( request == null ) {
            return null;
        }

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setId( request.id() );
        bootcamp.setName( request.name() );
        bootcamp.setInstructorId( request.instructorId() );
        bootcamp.setStartDate( request.startDate() );
        bootcamp.setEndDate( request.endDate() );
        bootcamp.setBootcampState( request.bootcampState() );

        return bootcamp;
    }

    @Override
    public CreatedBootcampResponse createdBootcampResponseFromBootcamp(Bootcamp bootcamp) {
        if ( bootcamp == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        Long instructorId = null;
        Date startDate = null;
        Date endDate = null;
        BootcampState bootcampState = null;

        id = bootcamp.getId();
        name = bootcamp.getName();
        instructorId = bootcamp.getInstructorId();
        startDate = bootcamp.getStartDate();
        endDate = bootcamp.getEndDate();
        bootcampState = bootcamp.getBootcampState();

        CreatedBootcampResponse createdBootcampResponse = new CreatedBootcampResponse( id, name, instructorId, startDate, endDate, bootcampState );

        return createdBootcampResponse;
    }

    @Override
    public UpdatedBootcampResponse updatedBootcampResponseFromBootcamp(Bootcamp bootcamp) {
        if ( bootcamp == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        Long instructorId = null;
        Date startDate = null;
        Date endDate = null;
        BootcampState bootcampState = null;

        id = bootcamp.getId();
        name = bootcamp.getName();
        instructorId = bootcamp.getInstructorId();
        startDate = bootcamp.getStartDate();
        endDate = bootcamp.getEndDate();
        bootcampState = bootcamp.getBootcampState();

        UpdatedBootcampResponse updatedBootcampResponse = new UpdatedBootcampResponse( id, name, instructorId, startDate, endDate, bootcampState );

        return updatedBootcampResponse;
    }

    @Override
    public GetListBootcampResponse getListBootcampResponseFromBootcamp(Bootcamp bootcamp) {
        if ( bootcamp == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        Long instructorId = null;
        Date startDate = null;
        Date endDate = null;
        BootcampState bootcampState = null;

        id = bootcamp.getId();
        name = bootcamp.getName();
        instructorId = bootcamp.getInstructorId();
        startDate = bootcamp.getStartDate();
        endDate = bootcamp.getEndDate();
        bootcampState = bootcamp.getBootcampState();

        GetListBootcampResponse getListBootcampResponse = new GetListBootcampResponse( id, name, instructorId, startDate, endDate, bootcampState );

        return getListBootcampResponse;
    }

    @Override
    public GetBootcampResponse getBootcampResponseFromBootcamp(Bootcamp bootcamp) {
        if ( bootcamp == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        Long instructorId = null;
        Date startDate = null;
        Date endDate = null;
        BootcampState bootcampState = null;

        id = bootcamp.getId();
        name = bootcamp.getName();
        instructorId = bootcamp.getInstructorId();
        startDate = bootcamp.getStartDate();
        endDate = bootcamp.getEndDate();
        bootcampState = bootcamp.getBootcampState();

        GetBootcampResponse getBootcampResponse = new GetBootcampResponse( id, name, instructorId, startDate, endDate, bootcampState );

        return getBootcampResponse;
    }

    @Override
    public DeletedBootcampResponse deletedBootcampResponseFromBootcamp(Bootcamp bootcamp, String message) {
        if ( bootcamp == null && message == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        if ( bootcamp != null ) {
            id = bootcamp.getId();
            name = bootcamp.getName();
        }
        String message1 = null;
        message1 = message;

        DeletedBootcampResponse deletedBootcampResponse = new DeletedBootcampResponse( id, name, message1 );

        return deletedBootcampResponse;
    }

    @Override
    public GetListBootcampResponse statesBootcampResponseFromBootcamp(Bootcamp bootcamp) {
        if ( bootcamp == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        Long instructorId = null;
        Date startDate = null;
        Date endDate = null;
        BootcampState bootcampState = null;

        id = bootcamp.getId();
        name = bootcamp.getName();
        instructorId = bootcamp.getInstructorId();
        startDate = bootcamp.getStartDate();
        endDate = bootcamp.getEndDate();
        bootcampState = bootcamp.getBootcampState();

        GetListBootcampResponse getListBootcampResponse = new GetListBootcampResponse( id, name, instructorId, startDate, endDate, bootcampState );

        return getListBootcampResponse;
    }
}
