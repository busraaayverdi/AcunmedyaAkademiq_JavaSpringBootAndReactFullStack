package Presentation;

import Service.ProgrammingLanguageService;
import Service.TechnologyService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProgrammingLanguageService languageService = new ProgrammingLanguageService();
        TechnologyService technologyService = new TechnologyService();

        while (true) {
            System.out.println("\n1 - Programlama Dili Ekle");
            System.out.println("2 - Programlama Dillerini Listele");
            System.out.println("3 - Teknoloji Ekle");
            System.out.println("4 - Teknolojileri Listele");
            System.out.println("5 - Çıkış");
            System.out.print("Seçiminiz: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Programlama Dili Adı: ");
                    String name = scanner.nextLine();
                    languageService.add(name);
                }
                case 2 -> languageService.listAll();
                case 3 -> {
                    System.out.print("Teknoloji Adı: ");
                    String techName = scanner.nextLine();
                    System.out.print("Bağlı Programlama Dili ID: ");
                    int langId = scanner.nextInt();
                    technologyService.add(techName, langId);
                }
                case 4 -> technologyService.listAll();
                case 5 -> {
                    System.out.println("Çıkış yapılıyor...");
                    return;
                }
                default -> System.out.println("Geçersiz seçim!");
            }
        }
    }
}
