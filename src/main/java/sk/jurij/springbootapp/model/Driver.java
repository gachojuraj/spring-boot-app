package sk.jurij.springbootapp.model;

public class Driver extends Employee {
    public Driver(float salary, int bonus) {
        super(salary, bonus, EmployeeType.DRIVER);
    }
}
