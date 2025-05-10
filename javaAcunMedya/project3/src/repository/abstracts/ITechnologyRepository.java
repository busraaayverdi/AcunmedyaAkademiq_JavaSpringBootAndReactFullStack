package repository.abstracts;

import entity.Technology;

import java.util.List;

public interface ITechnologyRepository {
    void add(Technology technology);
    List<Technology> getAll();
    Technology getById(int id);
    void update(Technology technology);
    void delete(int id);
}
