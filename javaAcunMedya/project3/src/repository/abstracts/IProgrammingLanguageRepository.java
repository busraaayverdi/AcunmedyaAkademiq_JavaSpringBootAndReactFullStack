package repository.abstracts;

import entity.ProgrammingLanguage;

import java.util.List;

public interface IProgrammingLanguageRepository {

    void add(ProgrammingLanguage programmingLanguage);

    List<ProgrammingLanguage> getAll();

    ProgrammingLanguage getById(int id);

    void update(ProgrammingLanguage programmingLanguage);

    void delete(int id);
}
