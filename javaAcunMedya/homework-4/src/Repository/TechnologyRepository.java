package Repository;

import Entity.ProgrammingLanguage;
import Entity.Technology;

import java.util.ArrayList;
import java.util.List;

public class TechnologyRepository {
    private List<Technology> technologies = new ArrayList<>();
    private int nextId = 1;

    public void add(String name, ProgrammingLanguage programmingLanguage) {
        Technology technology = new Technology(nextId++, name, programmingLanguage);
        technologies.add(technology);
    }

    public List<Technology> getAll() {
        return technologies;
    }

    public Technology getById(int id) {
        for (Technology tech : technologies) {
            if (tech.getId() == id) {
                return tech;
            }
        }
        return null;
    }

    public void delete(int id) {
        technologies.removeIf(tech -> tech.getId() == id);
    }

    public void update(int id, String newName) {
        for (Technology tech : technologies) {
            if (tech.getId() == id) {
                tech.setName(newName);
            }
        }
    }
}
