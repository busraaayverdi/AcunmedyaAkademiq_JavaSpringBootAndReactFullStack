package EmployeePrims;

public class Developer extends  Employee {
    private String about;


    public Developer(int id, String name, double salary, String department, String about) {
        super(id, name, salary, department);
        this.about = about;
    }


    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }


    @Override
    public double calculateBonus() {
        return getSalary() * 0.10;
    }
}
