package com.learning.java;

public class GradeBook
{
    private String course;
    public GradeBook(String c)
    {
        course = c;
    }
    public void setCourse(String c) {
        course = c;
    }
    public String getCourse() {
        return course;
    }
    public void DisplayMessage() {
        System.out.printf("Welcome to the grade book for \n %s! \n",course);
    }
}

