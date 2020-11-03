package sk.jurij.springbootapp.model;

public class Programmer extends Employee {
    public Programmer(float salary, int bonus) {
        super(salary, bonus, EmployeeType.PROGRAMMER);
    }

    @Override
    public String getInfo() {
        return String.format("%s’s salary is %.2f", this.getClass().getSimpleName(), salary+bonus);
    }
}
