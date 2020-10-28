package com.java.thymeleaf.thymeleafdemo.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentList {
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public StudentList(int id, String firstName,String lastName, String email){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
    }

    @Override
    public String toString() {
        return "StudentList{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
