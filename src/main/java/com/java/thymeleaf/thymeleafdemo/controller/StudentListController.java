package com.java.thymeleaf.thymeleafdemo.controller;

import com.java.thymeleaf.thymeleafdemo.model.StudentList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentListController {

    private List<StudentList> theStudentList;

    @PostConstruct
    private void loadData(){

        // Creates StudentList
        StudentList sl1= new StudentList(1,"A","b","ab@gmail.com");
        StudentList sl2= new StudentList(2,"C","d","cd@hotmail.com.tr");
        StudentList sl3= new StudentList(3,"E","f","ef@gmail.com");
        StudentList sl4= new StudentList(4,"G","h","gh@outlook.com");

        // Creates the list
        theStudentList= new ArrayList<>();

        // Add to the list
        theStudentList.add(sl1);
        theStudentList.add(sl2);
        theStudentList.add(sl3);
        theStudentList.add(sl4);
    }
    @GetMapping("/list")
    public String listOfStudents(Model theModel){
        theModel.addAttribute("students",theStudentList);
        return "list-students";
    }
}