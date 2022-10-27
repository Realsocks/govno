package com.example.demo.Controllers;

import com.example.demo.Employees;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Controller
public class AddContr {
    ArrayList<Employees> emp = new ArrayList<>();
    @GetMapping("/add")
    public void addEmp(@RequestParam String[] parameters){
        emp.add(new Employees(parameters));
    }

    @Controller








}
