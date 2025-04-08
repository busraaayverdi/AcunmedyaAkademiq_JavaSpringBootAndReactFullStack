package presentation;

import entity.ProgrammingLanguage;
import entity.Technology;
import repository.abstracts.IProgrammingLanguageRepository;
import repository.abstracts.ITechnologyRepository;
import repository.concrete.InMemoryProgrammingLanguageRepository;
import repository.concrete.InMemoryTechnologyRepository;
import service.abstracts.IProgrammingLanguageService;
import service.abstracts.ITechnologyService;
import service.concrete.ProgrammingLanguageServiceImpl;
import service.concrete.TechnologyServiceImpl;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static <programmingLanguageRepository> void main(String[] args) {
        IProgrammingLanguageRepository programmingLanguageRepository = new InMemoryProgrammingLanguageRepository();
        IProgrammingLanguageService programmingLanguageService = new ProgrammingLanguageServiceImpl(programmingLanguageRepository);

        ITechnologyRepository technologyRepository = new InMemoryTechnologyRepository();
        ITechnologyService technologyService = new TechnologyServiceImpl(technologyRepository);


        Scanner scanner = new Scanner(System.in);

        System.out.println("Programming languages and technologies management system");

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Add Programing Language");
            System.out.println("2 - List Programing Language");
            System.out.println("3 - Add Technology");
            System.out.println("4 - List Technology");
            System.out.println("5 - Exit");
            System.out.print("Your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    int langId = Integer.parseInt(scanner.nextLine());
                    System.out.print("Name: ");
                    String langName = scanner.nextLine();
                    ProgrammingLanguage lang = new ProgrammingLanguage(langId, langName);
                    programmingLanguageService.addProgramingLanguage(lang);
                    break;

                case 2:
                    List<ProgrammingLanguage> languages = programmingLanguageService.getAllProgramingLanguages();
                    System.out.println("--- Programing Languages ---");
                    for (ProgrammingLanguage pl : languages) {
                        System.out.println(pl.getId() + " - " + pl.getName());
                    }
                    break;

                case 3:
                    System.out.print("ID: ");
                    int techId = Integer.parseInt(scanner.nextLine());
                    System.out.print("Name: ");
                    String techName = scanner.nextLine();
                    System.out.print(" Programming Language: ");
                    int plId = Integer.parseInt(scanner.nextLine());
                    ProgrammingLanguage programmingLanguage = programmingLanguageService.getProgrammingLanguageById(plId);
                    Technology tech = new Technology(techId, techName, programmingLanguage);
                    technologyService.addTechnology(tech);
                    break;

                case 4:
                    List<Technology> technologies = technologyService.getAllTechnologies();
                    System.out.println("--- Technologies ---");
                    for (Technology t : technologies) {
                        System.out.println(t.getId() + " - " + t.getName() + " (" + t.getProgrammingLanguage() + ")");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Unknown choice.");
            }
        }
    }
}