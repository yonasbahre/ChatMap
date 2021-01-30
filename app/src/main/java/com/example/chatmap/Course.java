package com.example.chatmap;
import java.lang.String;
import java.util.ArrayList;

public class Course {
    String courseNum;
    String courseName;
    ArrayList<Chat> chatList = new ArrayList<Chat>();

    public Course(String courseNum, String courseName) {
        this.courseNum = courseNum;
        this.courseName = courseName;
    }

    public void addChat(String chatName, String chatLink) {
        chatList.add(new Chat(chatName, chatLink));
    }

}
