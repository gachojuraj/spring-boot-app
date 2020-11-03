package sk.jurij.springbootapp;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;
import sk.jurij.springbootapp.model.Employee;
import sk.jurij.springbootapp.model.Programmer;
import sk.jurij.springbootapp.model.Teacher;

import java.util.List;

@RestController
@EnableAutoConfiguration
public class EmployeeController {
    EmployeeService service;
    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @RequestMapping("/hello")
    String sayHello() {
        return "Hello Spring Boot!";
    }
    @RequestMapping("/salary")
    String getTotalSalary() {
        return (String.valueOf(service.getTotalSalary(new Employee[]{new Programmer(1000, 15),new Teacher(800, 10)})));
    }
    @RequestMapping("/bonuses")
    String getTotalBonuses() {
        return (String.valueOf(service.getTotalBonuses(new Employee[]{new Programmer(1000, 15),new Teacher(800, 10)})));
    }
    @RequestMapping("/snail")
    @ResponseBody
    public String getDistance(@RequestParam List<Double> values) {
        return String.valueOf(Snail.TotalDistance(values.get(0), values.get(1), values.get(2)));
    }
}
