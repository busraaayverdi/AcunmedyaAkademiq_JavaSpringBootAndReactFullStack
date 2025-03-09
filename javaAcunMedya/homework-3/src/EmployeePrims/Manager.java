package EmployeePrims;

public class Manager extends Employee{
    private int teamSize;

    public Manager(int id, String name, double salary, String department, int teamSize) {
        super(id, name, salary, department);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public double calculateBonus() {
        return getSalary()*0.20;
    }
}
