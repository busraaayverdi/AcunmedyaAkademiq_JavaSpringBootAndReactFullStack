package com.javaAcunMedya.bootcampApp.service.mappers;


import com.javaAcunMedya.bootcampApp.entity.Application;
import com.javaAcunMedya.bootcampApp.entity.Bootcamp;
import com.javaAcunMedya.bootcampApp.service.dtos.requests.application.UpdateApplicationRequest;
import com.javaAcunMedya.bootcampApp.service.dtos.requests.bootcamp.CreateBootcampRequest;
import com.javaAcunMedya.bootcampApp.service.dtos.requests.bootcamp.UpdateBootcampRequest;
import com.javaAcunMedya.bootcampApp.service.dtos.responses.bootcamp.*;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BootcampMapper {

    Bootcamp bootcampFromCreateBootcampRequest(CreateBootcampRequest request);
    Bootcamp bootcampFromUpdateBootcampRequest(UpdateBootcampRequest request);
    CreatedBootcampResponse createdBootcampResponseFromBootcamp(Bootcamp bootcamp);
    UpdatedBootcampResponse updatedBootcampResponseFromBootcamp(Bootcamp bootcamp);
    GetListBootcampResponse getListBootcampResponseFromBootcamp(Bootcamp bootcamp);
    GetBootcampResponse getBootcampResponseFromBootcamp(Bootcamp bootcamp);
    DeletedBootcampResponse deletedBootcampResponseFromBootcamp(Bootcamp bootcamp,String message);
    GetListBootcampResponse statesBootcampResponseFromBootcamp(Bootcamp bootcamp);



}
