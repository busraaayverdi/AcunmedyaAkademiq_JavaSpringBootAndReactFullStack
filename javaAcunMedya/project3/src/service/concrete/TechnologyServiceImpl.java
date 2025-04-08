package service.concrete;

import entity.Technology;
import repository.abstracts.ITechnologyRepository;
import service.abstracts.ITechnologyService;

import java.util.List;

public class TechnologyServiceImpl implements ITechnologyService {

    private ITechnologyRepository technologyRepository;



    public TechnologyServiceImpl(ITechnologyRepository technologyRepository) {
        this.technologyRepository = technologyRepository;
    }

    public ITechnologyRepository getTechnologyRepository() {
        return technologyRepository;
    }

    public void setTechnologyRepository(ITechnologyRepository technologyRepository) {
        this.technologyRepository = technologyRepository;
    }

    public TechnologyServiceImpl() {
    }

    @Override
    public void addTechnology(Technology technology) {
        if(technology.getName() == null || technology.getName().isBlank()){
            System.out.println("Name is null or blank");
            return;
        }
        for (Technology tech : technologyRepository.getAll()) {
            if (tech.getName().equalsIgnoreCase(technology.getName())) {
                System.out.println("Name already exists");
                return;
            }
        }
        technologyRepository.add(technology);
        System.out.println("Added: "+ technology);
    }

    @Override
    public List<Technology> getAllTechnologies() {
        return technologyRepository.getAll();
    }

    @Override
    public Technology getTechnologyById(int id) {
        return technologyRepository.getById(id);
    }

    @Override
    public void updateTechnology(Technology technology) {
        Technology existingTechnology = getTechnologyById(technology.getId());
        if(existingTechnology == null){
            System.out.println("No technology found with id: "+ technology.getId());
            return;
        }
        existingTechnology.setName(technology.getName());
        technologyRepository.update(existingTechnology);
        System.out.println("Updated: "+ technology);
    }

    @Override
    public void deleteTechnology(int id) {
        Technology technology = getTechnologyById(id);

        if(technology == null){
            System.out.println("No technology found with id: "+ id);
            return;
        }
        technologyRepository.delete(id);
        System.out.println("Deleted: "+ technology);
    }
}
