package com.javaAcunMedya.bootcampApp.service.concretes;

import com.javaAcunMedya.bootcampApp.entity.Application;
import com.javaAcunMedya.bootcampApp.repository.ApplicationRepository;
import com.javaAcunMedya.bootcampApp.service.abstracts.ApplicationService;
import com.javaAcunMedya.bootcampApp.service.dtos.requests.application.CreateApplicationRequest;
import com.javaAcunMedya.bootcampApp.service.dtos.requests.application.UpdateApplicationRequest;
import com.javaAcunMedya.bootcampApp.service.dtos.responses.application.*;
import com.javaAcunMedya.bootcampApp.service.mappers.ApplicationMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    private final ApplicationRepository applicationRepository;
    private final ApplicationMapper applicationMapper;

    public ApplicationServiceImpl(ApplicationRepository applicationRepository, ApplicationMapper applicationMapper) {
        this.applicationRepository = applicationRepository;
        this.applicationMapper = applicationMapper;
    }

    @Override
    public CreatedApplicationResponse add(CreateApplicationRequest request) {
        // Create request'i entity'ye dönüştürme
        Application application = applicationMapper.applicationFromCreateApplicationRequest(request);

        // Application'ı repository'ye kaydetme
        Application createdApplication = applicationRepository.save(application);

        // Created response'ü dönüştürme
        return applicationMapper.createdApplicationResponseFromApplication(createdApplication);
    }

    @Override
    public List<GetListApplicationResponse> getList() {
        // Tüm application'ları repository'den alıyoruz
        List<Application> applications = applicationRepository.findAll();

        // List'e dönüştürme
        return applications.stream()
                .map(applicationMapper::getListApplicationResponseFromApplication)
                .collect(Collectors.toList());
    }


    @Override
    public GetApplicationResponse getById(Long id) {
        // ID'ye göre application'ı buluyoruz
        Application application = applicationRepository.findById(id).orElseThrow(() -> new RuntimeException("Application not found"));

        // Get response dönüştürme
        return applicationMapper.getApplicationResponseFromApplication(application);
    }

    @Override
    public UpdatedApplicationResponse update(UpdateApplicationRequest request) {
        // Mevcut application'ı buluyoruz
        Application application = applicationRepository.findById(request.id())
                .orElseThrow(() -> new RuntimeException("Application not found"));

        // Update request'i entity'ye dönüştürme
        Application updatedApplication = applicationMapper.applicationFromUpdateApplicationRequest(request);

        // Güncellenmiş application'ı repository'de kaydediyoruz
        updatedApplication.setId(request.id());
        // id'yi set ediyoruz çünkü güncellenen application'da id'yi korumalıyız
        Application savedApplication = applicationRepository.save(updatedApplication);

        // Güncellenmiş application'ı response'a dönüştürüyoruz
        return applicationMapper.updatedApplicationResponseFromApplication(savedApplication);
    }

    @Override
    public DeletedApplicationResponse delete(Long id) {
        // Silinecek application'ı buluyoruz
        Application application = applicationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Application not found"));

        // Application'ı repository'den siliyoruz
        applicationRepository.delete(application);

        String message = "Application with ID " + id + " has been successfully deleted.";


        // Silinen application'ı response'a dönüştürüyoruz
        return applicationMapper.deletedApplicationResponseFromApplication(application,message);
    }
    @Override
    public List<GetListApplicationResponse> getAllByApplicantId(Long applicantId) {
        List<Application> applications = applicationRepository.findByApplicantId(applicantId);
        return applications.stream()
                .map(applicationMapper::applicationIdResponseFromApplication)
                .collect(Collectors.toList());
    }

}
