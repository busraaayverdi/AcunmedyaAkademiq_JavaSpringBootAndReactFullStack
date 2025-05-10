package repository.concrete;

import entity.ProgrammingLanguage;
import entity.Technology;
import repository.abstracts.ITechnologyRepository;
import service.concrete.TechnologyServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class InMemoryTechnologyRepository implements ITechnologyRepository {


    public List<Technology> getTechnologies() {
        return technologies;
    }

    @Override
    public void add(Technology technology) {
        technologies.add(technology);
        System.out.println("Added: "+ technology);
    }

    @Override
    public List<Technology> getAll() {
        return technologies;
    }

    @Override
    public Technology getById(int id) {
        for (Technology technology : technologies) {
            if (technology.getId() == id) {
                return technology;
            }
        }
        return null;
    }

    @Override
    public void update(Technology technology) {
        for (int i = 0; i < technologies.size(); i++) {
            if (technologies.get(i).getId() == technology.getId()) {
                technologies.set(i, technology);
                System.out.println("Updated: "+ technology);
                return;
            }
        }
    }

    @Override
    public void delete(int id) {
        Technology technology = getById(id);
        technologies.remove(technology);
        System.out.println("Deleted: "+ technology);

    }

    public void setTechnologies(List<Technology> technologies) {
        this.technologies = technologies;
    }

    private List<Technology> technologies = new ArrayList<>();
}
