package service.concrete;

import entity.ProgrammingLanguage;
import repository.abstracts.IProgrammingLanguageRepository;
import repository.concrete.InMemoryProgrammingLanguageRepository;
import service.abstracts.IProgrammingLanguageService;

import java.util.List;

public class ProgrammingLanguageServiceImpl implements IProgrammingLanguageService {

    private IProgrammingLanguageRepository programmingLanguageRepository;

    public ProgrammingLanguageServiceImpl(IProgrammingLanguageRepository programmingLanguageRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    public IProgrammingLanguageRepository getProgrammingLanguageRepository() {

        return programmingLanguageRepository;
    }

    public void setProgrammingLanguageRepository(IProgrammingLanguageRepository programmingLanguageRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    @Override
    public void addProgramingLanguage(ProgrammingLanguage language) {
        if (language.getName() == null || language.getName().isBlank()) {
            throw new IllegalArgumentException("The name of the language cannot be empty");
        }

        for (ProgrammingLanguage existing : programmingLanguageRepository.getAll()) {
            if (existing.getName().equalsIgnoreCase(language.getName())) {
                throw new IllegalArgumentException("The language already exists: "+existing.getName());
            }
        }
        programmingLanguageRepository.add(language);
    }

    @Override
    public List<ProgrammingLanguage> getAllProgramingLanguages() {
        return programmingLanguageRepository.getAll();
    }

    @Override
    public ProgrammingLanguage getProgrammingLanguageById(int id) {
        return programmingLanguageRepository.getById(id);
    }

    @Override
    public void updateProgramingLanguage(ProgrammingLanguage programmingLanguage) {
        ProgrammingLanguage existing = programmingLanguageRepository.getById(programmingLanguage.getId());
        if (existing == null) {
            System.out.println("The language does not exist: "+programmingLanguage.getName());
        }
        programmingLanguageRepository.update(programmingLanguage);
        System.out.println("Updated: "+ programmingLanguage);

    }

    @Override
    public void deleteProgramingLanguage(int id) {
        ProgrammingLanguage programmingLanguage = getProgrammingLanguageById(id);
        programmingLanguageRepository.delete(id);
        System.out.println("Deleted: "+ programmingLanguage);

    }
}
