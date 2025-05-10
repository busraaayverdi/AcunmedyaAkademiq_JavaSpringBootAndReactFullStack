package com.javaAcunMedya.bootcampApp.service.abstracts;

import com.javaAcunMedya.bootcampApp.entity.BootcampState;
import com.javaAcunMedya.bootcampApp.service.dtos.requests.bootcamp.CreateBootcampRequest;
import com.javaAcunMedya.bootcampApp.service.dtos.requests.bootcamp.UpdateBootcampRequest;
import com.javaAcunMedya.bootcampApp.service.dtos.responses.bootcamp.*;

import java.util.List;

public interface BootcampService {
    CreatedBootcampResponse add(CreateBootcampRequest request);
    UpdatedBootcampResponse update(Long id,UpdateBootcampRequest request);
    DeletedBootcampResponse delete(Long id);
    GetBootcampResponse getById(Long id);
    List<GetListBootcampResponse> getList();
    List<GetListBootcampResponse> getStateBootcamp(BootcampState bootcampState);



}
