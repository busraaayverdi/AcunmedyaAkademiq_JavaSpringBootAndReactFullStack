package Repository;

import Entity.ProgrammingLanguage;

import java.util.ArrayList;
import java.util.List;

public class ProgrammingLanguageRepository {
    private List<ProgrammingLanguage> languages = new ArrayList<>();
    private int nextId = 1;

    public void add(String name) {
        ProgrammingLanguage language = new ProgrammingLanguage(nextId++, name);
        languages.add(language);
    }

    public List<ProgrammingLanguage> getAll() {
        return languages;
    }

    public ProgrammingLanguage getById(int id) {
        for (ProgrammingLanguage lang : languages) {
            if (lang.getId() == id) {
                return lang;
            }
        }
        return null;
    }

    public void delete(int id) {
        languages.removeIf(lang -> lang.getId() == id);
    }

    public void update(int id, String newName) {
        for (ProgrammingLanguage lang : languages) {
            if (lang.getId() == id) {
                lang.setName(newName);
            }
        }
    }
}
