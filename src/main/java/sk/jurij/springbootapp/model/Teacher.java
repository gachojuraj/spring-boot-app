package sk.jurij.springbootapp.model;

public class Teacher extends Employee {
    public Teacher(float salary, int bonus) {
        super(salary, bonus, EmployeeType.TEACHER);
    }
}
