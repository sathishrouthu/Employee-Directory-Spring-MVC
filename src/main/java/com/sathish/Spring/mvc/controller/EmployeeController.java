package com.sathish.Spring.mvc.controller;

import com.sathish.Spring.mvc.entity.Employee;
import com.sathish.Spring.mvc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    private EmployeeService employeeService;
    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("")
    public String listEmployees(Model theModel){
        // get the employees from db
        List<Employee> employees = employeeService.findAll();

        System.out.println(employees);
        // add to the spring model
        theModel.addAttribute("employees",employees);

        return "list-employees";
    }

    @GetMapping("/add")
    public String addEmployee(Model theModel){
        // create model attribute to bind form data
        Employee employee = new Employee();

        theModel.addAttribute("employee",employee);
        return "employee-form";
    }
    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee theEmployee){
        employeeService.save(theEmployee);
        return "redirect:/employees";
    }
    @PostMapping("/update")
    public String updateEmployee(@RequestParam("employeeId") int id,Model theModel){
        // get the employee from the service
        Employee theEmployee = employeeService.findById(id);

        // Set the employee as a model attribute to pre-populate the form
        theModel.addAttribute("employee",theEmployee);

        //send over to the form
        return "employee-form";
    }

    @PostMapping("/delete")
    public String deleteVyId(@RequestParam("employeeId") int id){
        // delete employee
        employeeService.deleteById(id);

        // redirect to list employees
        return "redirect:/employees";
    }
}
