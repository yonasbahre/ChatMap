package com.example.chatmap;
import java.lang.String;
import java.util.ArrayList;

public class School {
    String schoolName;
    ArrayList<Course> courseList = new ArrayList<Course>();

    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    public void addCourse(String courseNum, String courseName) {
        courseList.add(new Course(courseNum, courseName));
    }
}
