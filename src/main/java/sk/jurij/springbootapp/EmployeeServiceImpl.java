package sk.jurij.springbootapp;

import org.springframework.stereotype.Service;
import sk.jurij.springbootapp.model.Employee;
import java.util.Arrays;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private int number = 0;
    @Override
    public float getTotalSalary(Employee[] list) {
        return (float) Arrays.stream(list).mapToDouble(Employee::getSalary).sum();
    }

    @Override
    public int getTotalBonuses(Employee[] list) {
        return Arrays.stream(list).mapToInt(Employee::getBonus).sum();
    }

    public void writeNumber(){
        System.out.println(++number);
    }
}
