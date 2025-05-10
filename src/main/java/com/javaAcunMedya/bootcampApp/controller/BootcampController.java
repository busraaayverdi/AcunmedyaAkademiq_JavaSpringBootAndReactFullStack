package com.javaAcunMedya.bootcampApp.controller;

import com.javaAcunMedya.bootcampApp.entity.BootcampState;
import com.javaAcunMedya.bootcampApp.service.abstracts.BootcampService;
import com.javaAcunMedya.bootcampApp.service.dtos.requests.bootcamp.CreateBootcampRequest;
import com.javaAcunMedya.bootcampApp.service.dtos.requests.bootcamp.UpdateBootcampRequest;
import com.javaAcunMedya.bootcampApp.service.dtos.responses.application.DeletedApplicationResponse;
import com.javaAcunMedya.bootcampApp.service.dtos.responses.bootcamp.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bootcamps")
public class BootcampController {
    private final BootcampService bootcampService;

    public BootcampController(BootcampService bootcampService) {
        this.bootcampService = bootcampService;
    }

    @PostMapping
    public ResponseEntity<CreatedBootcampResponse> add(@RequestBody CreateBootcampRequest request){
        CreatedBootcampResponse response = bootcampService.add(request);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<GetListBootcampResponse>> getList(){
        List<GetListBootcampResponse> responseList =bootcampService.getList();
    return ResponseEntity.ok(responseList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GetBootcampResponse> getById(@PathVariable Long id){
        GetBootcampResponse response = bootcampService.getById(id);
        return ResponseEntity.ok(response);
    }
    @GetMapping("/{bootcampState}")
    public ResponseEntity<List<GetListBootcampResponse>> getStateBootcamp(@PathVariable BootcampState bootcampState){
        List<GetListBootcampResponse> responseList = bootcampService.getStateBootcamp(bootcampState);
        return ResponseEntity.ok(responseList);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UpdatedBootcampResponse> update(@PathVariable Long id, @RequestBody UpdateBootcampRequest request){
        UpdatedBootcampResponse response = bootcampService.update(id,request);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<DeletedBootcampResponse> delete(@PathVariable Long id){
        DeletedBootcampResponse response = bootcampService.delete(id);
        return ResponseEntity.ok(response);

    }

}
