package EmployeePrims;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager(1, "Büşra Ayverdi", 57002, "IT", 5);
        Developer developer = new Developer(2, "Muhammed İnan", 79650, "IT", "Java Developer");


        System.out.println("Manager's Bonus: " + manager.calculateBonus());
        System.out.println("Developer's Bonus: " + developer.calculateBonus());


    }
}