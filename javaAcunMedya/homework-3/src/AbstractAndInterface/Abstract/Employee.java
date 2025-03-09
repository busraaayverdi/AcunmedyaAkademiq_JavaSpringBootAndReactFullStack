package AbstractAndInterface.Abstract;

abstract class Employee {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract void work(); // Soyut metot

    public void showSalary() {
        System.out.println(name + "'s salary: $" + salary);
    }
}


