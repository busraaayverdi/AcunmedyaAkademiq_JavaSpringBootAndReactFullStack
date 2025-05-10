package AbstractAndInterface.Abstract;

class Developer extends Employee {
    public Developer(String name, int salary) {
        super(name, salary);
    }

    @Override
    void work() {
        System.out.println(name + " is writing code.");
    }
}
