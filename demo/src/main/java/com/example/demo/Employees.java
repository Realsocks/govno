package com.example.demo;

import javax.persistence.*;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.ArrayList;
import java.util.LinkedList;

import static java.lang.Integer.parseInt;

@ Table(name = "имя")

@Entity // This tells Hibernate to make a table out of this class
public class Employees {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String name;

    private String lastname;

    private String secondname;

    private String Work;

    private String sex;

    private String dateofbirth;

    public String getSecondname() {
        return secondname;
    }
    //геттеры и сеттеры
    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public String getWork() {
        return Work;
    }

    public void setWork(String work) {
        Work = work;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }





    //констуркторы
    public Employees(String[] parameters) {

        this.name = parameters[0];
        this.lastname = parameters[1];
        this.secondname = parameters[2];
        this.sex = parameters[3];
        this.dateofbirth = parameters[4];
        this.Work = parameters[5];


    }

    //пустой конструктор
    public Employees() {

    }
}