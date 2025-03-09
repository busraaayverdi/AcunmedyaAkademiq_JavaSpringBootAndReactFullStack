package AbstractAndInterface.Abstract;

public class Main {
    public static void main(String[] args) {
        Manager mgr = new Manager("Ali", 260000);
        Developer dev = new Developer("Büşra", 130000);

        mgr.work();
        mgr.showSalary();

        dev.work();
        dev.showSalary();
    }
}
