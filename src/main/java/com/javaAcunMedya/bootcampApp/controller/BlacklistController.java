package com.javaAcunMedya.bootcampApp.controller;
import com.javaAcunMedya.bootcampApp.service.abstracts.BlacklistService;
import com.javaAcunMedya.bootcampApp.service.dtos.requests.blacklist.CreateBlacklistRequest;
import com.javaAcunMedya.bootcampApp.service.dtos.requests.blacklist.UpdateBlacklistRequest;
import com.javaAcunMedya.bootcampApp.service.dtos.responses.blacklist.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/blacklists")
public class BlacklistController {
    private final BlacklistService blacklistService;

    public BlacklistController(BlacklistService blacklistService) {
        this.blacklistService = blacklistService;
    }

    @PostMapping
    public ResponseEntity<CreatedBlacklistResponse> add(@RequestBody CreateBlacklistRequest request){
        CreatedBlacklistResponse response = blacklistService.add(request);
        return new ResponseEntity<>(response, HttpStatus.CREATED);

    }
    @GetMapping
    public ResponseEntity<List<GetListBlacklistResponse>> getList(){
        List<GetListBlacklistResponse> responseList =blacklistService.getList();
        return ResponseEntity.ok(responseList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GetBlacklistResponse> getById(@PathVariable Long id){
        GetBlacklistResponse response = blacklistService.getById(id);
        return ResponseEntity.ok(response);
    }
    @GetMapping("/applicant/{applicantId}")
    public ResponseEntity<List<GetListBlacklistResponse>> getAllApplicantById(@PathVariable Long applicantId  ){
        List<GetListBlacklistResponse> responseList = blacklistService.getAllByApplicantId(applicantId);
        return ResponseEntity.ok(responseList);
    }
    @PutMapping("/{id}")
    public ResponseEntity<UpdatedBlacklistResponse> update(@PathVariable Long id, @RequestBody UpdateBlacklistRequest request){
        UpdatedBlacklistResponse response = blacklistService.update(id,request);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<DeletedBlacklistResponse> delete(@PathVariable Long id){
        DeletedBlacklistResponse response = blacklistService.delete(id);
        return ResponseEntity.ok(response);

    }
}
