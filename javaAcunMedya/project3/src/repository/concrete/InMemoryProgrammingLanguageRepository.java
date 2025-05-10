package repository.concrete;

import entity.ProgrammingLanguage;
import repository.abstracts.IProgrammingLanguageRepository;
import service.concrete.ProgrammingLanguageServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class InMemoryProgrammingLanguageRepository implements IProgrammingLanguageRepository {

    private List<ProgrammingLanguage> programmingLanguages = new ArrayList<>();


    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        programmingLanguages.add(programmingLanguage);
        System.out.println("Added: "+ programmingLanguage);

    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguages;
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
            if (programmingLanguage.getId() == id) {
                return programmingLanguage;
            }
        }
        return null;
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {
        for (int i = 0; i < programmingLanguages.size(); i++) {
            if (programmingLanguages.get(i).getId() == programmingLanguage.getId()) {
                programmingLanguages.set(i, programmingLanguage);
                System.out.println("Updated: "+ programmingLanguage);
                return;
            }
        }

    }

    @Override
    public void delete(int id) {
        ProgrammingLanguage programmingLanguage = getById(id);
        programmingLanguages.remove(programmingLanguage);
        System.out.println("Deleted: "+ programmingLanguage);
    }

    public List<ProgrammingLanguage> getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(List<ProgrammingLanguage> programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }
}
