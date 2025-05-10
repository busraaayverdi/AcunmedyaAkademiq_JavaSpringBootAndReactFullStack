package service.abstracts;

import entity.Technology;

import java.util.List;

public interface ITechnologyService {
    void addTechnology(Technology technology);
    List<Technology> getAllTechnologies();
    Technology getTechnologyById(int id);
    void updateTechnology(Technology technology);
    void deleteTechnology(int id);

}
