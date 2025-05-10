package com.javaAcunMedya.bootcampApp.service.mappers;

import com.javaAcunMedya.bootcampApp.entity.Blacklist;
import com.javaAcunMedya.bootcampApp.service.dtos.requests.blacklist.CreateBlacklistRequest;
import com.javaAcunMedya.bootcampApp.service.dtos.requests.blacklist.UpdateBlacklistRequest;
import com.javaAcunMedya.bootcampApp.service.dtos.responses.blacklist.CreatedBlacklistResponse;
import com.javaAcunMedya.bootcampApp.service.dtos.responses.blacklist.DeletedBlacklistResponse;
import com.javaAcunMedya.bootcampApp.service.dtos.responses.blacklist.GetBlacklistResponse;
import com.javaAcunMedya.bootcampApp.service.dtos.responses.blacklist.GetListBlacklistResponse;
import com.javaAcunMedya.bootcampApp.service.dtos.responses.blacklist.UpdatedBlacklistResponse;
import java.util.Date;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-10T17:15:12+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 23.0.2 (Oracle Corporation)"
)
@Component
public class BlacklistMapperImpl implements BlacklistMapper {

    @Override
    public Blacklist blacklistFromCreateBlacklistRequest(CreateBlacklistRequest request) {
        if ( request == null ) {
            return null;
        }

        Blacklist blacklist = new Blacklist();

        blacklist.setReason( request.reason() );
        blacklist.setDate( request.date() );
        blacklist.setApplicantId( request.applicantId() );

        return blacklist;
    }

    @Override
    public Blacklist blacklistFromUpdateBlacklistRequest(UpdateBlacklistRequest request) {
        if ( request == null ) {
            return null;
        }

        Blacklist blacklist = new Blacklist();

        blacklist.setId( request.id() );
        blacklist.setReason( request.reason() );
        blacklist.setDate( request.date() );
        blacklist.setApplicantId( request.applicantId() );

        return blacklist;
    }

    @Override
    public CreatedBlacklistResponse createdBlacklistResponseFromBlacklist(Blacklist blacklist) {
        if ( blacklist == null ) {
            return null;
        }

        Long id = null;
        String reason = null;
        Date date = null;
        Long applicantId = null;

        id = blacklist.getId();
        reason = blacklist.getReason();
        date = blacklist.getDate();
        applicantId = blacklist.getApplicantId();

        CreatedBlacklistResponse createdBlacklistResponse = new CreatedBlacklistResponse( id, reason, date, applicantId );

        return createdBlacklistResponse;
    }

    @Override
    public UpdatedBlacklistResponse updatedBlacklistResponseFromBlacklist(Blacklist blacklist) {
        if ( blacklist == null ) {
            return null;
        }

        Long id = null;
        String reason = null;
        Date date = null;
        Long applicantId = null;

        id = blacklist.getId();
        reason = blacklist.getReason();
        date = blacklist.getDate();
        applicantId = blacklist.getApplicantId();

        UpdatedBlacklistResponse updatedBlacklistResponse = new UpdatedBlacklistResponse( id, reason, date, applicantId );

        return updatedBlacklistResponse;
    }

    @Override
    public DeletedBlacklistResponse deletedBlacklistResponseFromBlacklist(Blacklist blacklist, String message) {
        if ( blacklist == null && message == null ) {
            return null;
        }

        Long id = null;
        if ( blacklist != null ) {
            id = blacklist.getId();
        }
        String message1 = null;
        message1 = message;

        DeletedBlacklistResponse deletedBlacklistResponse = new DeletedBlacklistResponse( id, message1 );

        return deletedBlacklistResponse;
    }

    @Override
    public GetBlacklistResponse getBlacklistResponseFromBlacklist(Blacklist blacklist) {
        if ( blacklist == null ) {
            return null;
        }

        Long id = null;
        String reason = null;
        Date date = null;
        Long applicantId = null;

        id = blacklist.getId();
        reason = blacklist.getReason();
        date = blacklist.getDate();
        applicantId = blacklist.getApplicantId();

        GetBlacklistResponse getBlacklistResponse = new GetBlacklistResponse( id, reason, date, applicantId );

        return getBlacklistResponse;
    }

    @Override
    public GetListBlacklistResponse getListBlacklistResponseFromBlacklist(Blacklist blacklist) {
        if ( blacklist == null ) {
            return null;
        }

        Long id = null;
        String reason = null;
        Date date = null;
        Long applicantId = null;

        id = blacklist.getId();
        reason = blacklist.getReason();
        date = blacklist.getDate();
        applicantId = blacklist.getApplicantId();

        GetListBlacklistResponse getListBlacklistResponse = new GetListBlacklistResponse( id, reason, date, applicantId );

        return getListBlacklistResponse;
    }

    @Override
    public GetListBlacklistResponse getApplicantIdBlacklistResponseFromBlacklist(Blacklist blacklist) {
        if ( blacklist == null ) {
            return null;
        }

        Long id = null;
        String reason = null;
        Date date = null;
        Long applicantId = null;

        id = blacklist.getId();
        reason = blacklist.getReason();
        date = blacklist.getDate();
        applicantId = blacklist.getApplicantId();

        GetListBlacklistResponse getListBlacklistResponse = new GetListBlacklistResponse( id, reason, date, applicantId );

        return getListBlacklistResponse;
    }
}
