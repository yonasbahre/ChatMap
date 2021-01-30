package com.example.chatmap;
import java.util.ArrayList;

public class SchoolList {
    ArrayList<School> schoolList = new ArrayList<School>();

    public void addSchool(String schoolName) {
        schoolList.add(new School(schoolName));
    }
}


