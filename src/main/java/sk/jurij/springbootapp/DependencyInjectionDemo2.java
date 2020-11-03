package sk.jurij.springbootapp;

import org.springframework.stereotype.Component;

@Component
public class DependencyInjectionDemo2 {
    EmployeeService service;

    public DependencyInjectionDemo2(EmployeeService service) {
        this.service = service;
        ((EmployeeServiceImpl)service).writeNumber();
    }
}
