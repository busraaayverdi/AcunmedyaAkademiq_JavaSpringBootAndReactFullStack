package Service;

import Entity.ProgrammingLanguage;
import Repository.ProgrammingLanguageRepository;

public class ProgrammingLanguageService {
    private ProgrammingLanguageRepository repository = new ProgrammingLanguageRepository();

    public void add(String name) {
        if (name.isEmpty()) {
            System.out.println("Programlama dili boş olamaz!");
            return;
        }
        repository.add(name);
        System.out.println("Programlama dili eklendi.");
    }

    public void listAll() {
        for (ProgrammingLanguage lang : repository.getAll()) {
            System.out.println(lang.getId() + " - " + lang.getName());
        }
    }
}
