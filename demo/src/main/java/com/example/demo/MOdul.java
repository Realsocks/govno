package com.example.demo;

import com.example.demo.repos.EmployeeRepo;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MOdul {
    EmployeeRepo nameRepo;

    public MOdul(EmployeeRepo nameRepo) {
        this.nameRepo = nameRepo;
    }

    @GetMapping("/add")
    public void test(@RequestParam String parameters) {
        nameRepo.save(new Employees(parameters.split("\\|")));
    }
}
