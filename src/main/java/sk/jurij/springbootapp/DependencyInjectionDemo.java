package sk.jurij.springbootapp;

import org.springframework.stereotype.Component;
import sk.jurij.springbootapp.model.Employee;
import sk.jurij.springbootapp.model.Programmer;
import sk.jurij.springbootapp.model.Teacher;

@Component
public class DependencyInjectionDemo {
    EmployeeService service;
    public DependencyInjectionDemo(sk.jurij.springbootapp.EmployeeService service){
        this.service = service;
        System.out.println(getSum(new Employee[]{new Programmer(1000, 15),new Teacher(800, 10)}));
        ((EmployeeServiceImpl)service).writeNumber();
    }
    public float getSum(Employee[] arr){
        return service.getTotalBonuses(arr) + service.getTotalSalary(arr);
    }

}
