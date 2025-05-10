package AbstractAndInterface.Abstract;


class Manager extends Employee {
    public Manager(String name, int salary) {
        super(name, salary);
    }

    @Override
    void work() {
        System.out.println(name + " is managing the team.");
    }
}