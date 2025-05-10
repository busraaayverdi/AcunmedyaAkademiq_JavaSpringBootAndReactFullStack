package com.javaAcunMedya.bootcampApp.service.concretes;

import com.javaAcunMedya.bootcampApp.entity.Application;
import com.javaAcunMedya.bootcampApp.entity.Bootcamp;
import com.javaAcunMedya.bootcampApp.entity.BootcampState;
import com.javaAcunMedya.bootcampApp.repository.BootcampRepository;
import com.javaAcunMedya.bootcampApp.service.abstracts.BootcampService;
import com.javaAcunMedya.bootcampApp.service.dtos.requests.bootcamp.CreateBootcampRequest;
import com.javaAcunMedya.bootcampApp.service.dtos.requests.bootcamp.UpdateBootcampRequest;
import com.javaAcunMedya.bootcampApp.service.dtos.responses.bootcamp.*;
import com.javaAcunMedya.bootcampApp.service.mappers.BootcampMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BootcampServiceImpl implements BootcampService {

    private final BootcampRepository bootcampRepository;
    private final BootcampMapper bootcampMapper;

    public BootcampServiceImpl(BootcampRepository bootcampRepository, BootcampMapper bootcampMapper) {
        this.bootcampRepository = bootcampRepository;
        this.bootcampMapper = bootcampMapper;
    }

    @Override
    public CreatedBootcampResponse add(CreateBootcampRequest request) {
        Bootcamp bootcamp = bootcampMapper.bootcampFromCreateBootcampRequest(request);
        Bootcamp createdBootcamp = bootcampRepository.save(bootcamp);
        return bootcampMapper.createdBootcampResponseFromBootcamp(createdBootcamp);
    }

    @Override
    public UpdatedBootcampResponse update(Long id, UpdateBootcampRequest request) {
        Bootcamp bootcamp = bootcampRepository.findById(id).orElseThrow(() -> new RuntimeException("Bootcamp not found"));
        Bootcamp updatedBootcamp = bootcampMapper.bootcampFromUpdateBootcampRequest(request);
        updatedBootcamp.setId(id);
        Bootcamp savedBootcamp = bootcampRepository.save(updatedBootcamp);
        return bootcampMapper.updatedBootcampResponseFromBootcamp(savedBootcamp);
    }

    @Override
    public DeletedBootcampResponse delete(Long id) {
        Bootcamp bootcamp = bootcampRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Bootcamp not found"));
        bootcampRepository.delete(bootcamp);
        String message = "Bootcamp with ID " + id + " has been successfully deleted.";
        return bootcampMapper.deletedBootcampResponseFromBootcamp(bootcamp,message);
    }

    @Override
    public GetBootcampResponse getById(Long id) {
        Bootcamp bootcamp = bootcampRepository.findById(id).orElseThrow(() -> new RuntimeException("Bootcamp not found"));
        return bootcampMapper.getBootcampResponseFromBootcamp(bootcamp);
    }

    @Override
    public List<GetListBootcampResponse> getList() {
        List<Bootcamp> bootcamps = bootcampRepository.findAll();
        return bootcamps.stream()
                .map(bootcampMapper::getListBootcampResponseFromBootcamp)
                .collect(Collectors.toList());
    }

    @Override
    public List<GetListBootcampResponse> getStateBootcamp(BootcampState bootcampState) {
        List<Bootcamp> bootcamps = bootcampRepository.findByBootcampState(bootcampState);
        return bootcamps.stream()
                .map(bootcampMapper::statesBootcampResponseFromBootcamp)
                .collect(Collectors.toList());
    }
}