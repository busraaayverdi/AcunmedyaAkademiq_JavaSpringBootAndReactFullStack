package service.abstracts;

import entity.ProgrammingLanguage;

import java.util.List;

public interface IProgrammingLanguageService {

    void addProgramingLanguage(ProgrammingLanguage programmingLanguage);
    List<ProgrammingLanguage> getAllProgramingLanguages();
    ProgrammingLanguage getProgrammingLanguageById(int id);
    void updateProgramingLanguage(ProgrammingLanguage programmingLanguage);
    void deleteProgramingLanguage(int id);
}
