package com.genspark.SpringBootDemo1.Entity;

public class AppEntities {
    private int courseId;
    private String title;
    private String instructor;

    public AppEntities() {
    }

    public AppEntities(int courseId, String title, String instructor) {
        this.courseId = courseId;
        this.title = title;
        this.instructor = instructor;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
}
