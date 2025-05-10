package com.javaAcunMedya.bootcampApp.controller;

import com.javaAcunMedya.bootcampApp.service.abstracts.ApplicationService;
import com.javaAcunMedya.bootcampApp.service.dtos.requests.application.CreateApplicationRequest;
import com.javaAcunMedya.bootcampApp.service.dtos.requests.application.UpdateApplicationRequest;
import com.javaAcunMedya.bootcampApp.service.dtos.responses.application.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/applications")
public class ApplicationController {

    private final ApplicationService applicationService;


    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<GetListApplicationResponse> getAll() {
        return applicationService.getList();
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public GetApplicationResponse getById(@PathVariable Long id) {
        return applicationService.getById(id);
    }

    @GetMapping("applicant/{applicantId}")
    @ResponseStatus(HttpStatus.OK)
    public List<GetListApplicationResponse> getByApplicantId(@PathVariable Long applicantId) {
        return applicationService.getAllByApplicantId(applicantId);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public UpdatedApplicationResponse update(@RequestBody UpdateApplicationRequest request) {
        return applicationService.update(request);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreatedApplicationResponse add(@RequestBody CreateApplicationRequest request) {
        return applicationService.add(request);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Long id) {
        applicationService.delete(id);
    }

}

