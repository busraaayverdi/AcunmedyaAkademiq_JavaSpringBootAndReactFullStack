package com.javaAcunMedya.bootcampApp.service.mappers;

import com.javaAcunMedya.bootcampApp.entity.Blacklist;
import com.javaAcunMedya.bootcampApp.service.dtos.requests.blacklist.CreateBlacklistRequest;
import com.javaAcunMedya.bootcampApp.service.dtos.requests.blacklist.UpdateBlacklistRequest;
import com.javaAcunMedya.bootcampApp.service.dtos.responses.blacklist.*;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BlacklistMapper {

    Blacklist blacklistFromCreateBlacklistRequest(CreateBlacklistRequest request);
    Blacklist blacklistFromUpdateBlacklistRequest(UpdateBlacklistRequest request);
    CreatedBlacklistResponse createdBlacklistResponseFromBlacklist(Blacklist blacklist);
    UpdatedBlacklistResponse updatedBlacklistResponseFromBlacklist(Blacklist blacklist);
    DeletedBlacklistResponse deletedBlacklistResponseFromBlacklist(Blacklist blacklist,String message);
    GetBlacklistResponse getBlacklistResponseFromBlacklist(Blacklist blacklist);
    GetListBlacklistResponse getListBlacklistResponseFromBlacklist(Blacklist blacklist);
    GetListBlacklistResponse getApplicantIdBlacklistResponseFromBlacklist(Blacklist blacklist);






}
