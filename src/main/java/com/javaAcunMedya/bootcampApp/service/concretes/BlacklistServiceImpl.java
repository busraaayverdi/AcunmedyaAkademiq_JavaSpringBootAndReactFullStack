package com.javaAcunMedya.bootcampApp.service.concretes;

import com.javaAcunMedya.bootcampApp.entity.Blacklist;
import com.javaAcunMedya.bootcampApp.entity.Bootcamp;
import com.javaAcunMedya.bootcampApp.repository.BlacklistRepository;
import com.javaAcunMedya.bootcampApp.service.abstracts.BlacklistService;
import com.javaAcunMedya.bootcampApp.service.dtos.requests.blacklist.CreateBlacklistRequest;
import com.javaAcunMedya.bootcampApp.service.dtos.requests.blacklist.UpdateBlacklistRequest;
import com.javaAcunMedya.bootcampApp.service.dtos.responses.blacklist.*;
import com.javaAcunMedya.bootcampApp.service.mappers.BlacklistMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BlacklistServiceImpl implements BlacklistService {

    private final BlacklistRepository blacklistRepository;
    private final BlacklistMapper blacklistMapper;

    public BlacklistServiceImpl(BlacklistRepository blacklistRepository, BlacklistMapper blacklistMapper) {
        this.blacklistRepository = blacklistRepository;
        this.blacklistMapper = blacklistMapper;
    }


    @Override
    public CreatedBlacklistResponse add(CreateBlacklistRequest request) {
        Blacklist blacklist = blacklistMapper.blacklistFromCreateBlacklistRequest(request);

        Blacklist createdBlacklist = blacklistRepository.save(blacklist);

        return blacklistMapper.createdBlacklistResponseFromBlacklist(createdBlacklist);
    }

    @Override
    public UpdatedBlacklistResponse update(Long id,UpdateBlacklistRequest request) {
        Optional<Blacklist> blacklist = blacklistRepository.findById(id);
        Blacklist updatedBlacklist = blacklistMapper.blacklistFromUpdateBlacklistRequest(request);
        updatedBlacklist.setId(id);
        Blacklist savedBlacklist = blacklistRepository.save(updatedBlacklist);
        return blacklistMapper.updatedBlacklistResponseFromBlacklist(savedBlacklist);
    }

    @Override
    public DeletedBlacklistResponse delete(Long id) {
        Blacklist blacklist =blacklistRepository.findById(id).orElseThrow(() -> new RuntimeException("Blacklist not found"));
        blacklistRepository.delete(blacklist);
        String message = "Blacklist with ID " + id + " has been successfully deleted.";
        return blacklistMapper.deletedBlacklistResponseFromBlacklist(blacklist,message);
    }

    @Override
    public GetBlacklistResponse getById(Long id) {
        Blacklist blacklist = blacklistRepository.findById(id).orElseThrow(() -> new RuntimeException("Blacklist not found"));
        return blacklistMapper.getBlacklistResponseFromBlacklist(blacklist);
    }

    @Override
    public List<GetListBlacklistResponse> getList() {
        List<Blacklist> blacklists = blacklistRepository.findAll();
        return blacklists.stream().map(blacklistMapper::getListBlacklistResponseFromBlacklist).collect(Collectors.toList());
    }

    @Override
    public List<GetListBlacklistResponse> getAllByApplicantId(Long applicantId) {
        List<Blacklist> blacklists = blacklistRepository.findByApplicantId(applicantId);
        return blacklists.stream().map(blacklistMapper::getListBlacklistResponseFromBlacklist).collect(Collectors.toList());
    }
}
