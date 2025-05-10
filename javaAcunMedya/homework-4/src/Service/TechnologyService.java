package Service;

import Entity.ProgrammingLanguage;
import Entity.Technology;
import Repository.ProgrammingLanguageRepository;
import Repository.TechnologyRepository;

public class TechnologyService {
    private TechnologyRepository technologyRepository = new TechnologyRepository();
    private ProgrammingLanguageRepository programmingLanguageRepository = new ProgrammingLanguageRepository();

    public void add(String name, int langId) {
        ProgrammingLanguage lang = programmingLanguageRepository.getById(langId);
        if (lang == null) {
            System.out.println("Böyle bir programlama dili bulunamadı.");
            return;
        }
        technologyRepository.add(name, lang);
        System.out.println("Teknoloji eklendi.");
    }

    public void listAll() {
        for (Technology tech : technologyRepository.getAll()) {
            System.out.println(tech.getId() + " - " + tech.getName() + " (" + tech.getProgrammingLanguage().getName() + ")");
        }
    }
}
