package com.ironhack.classes.courses;

public class Course {
    private int classId;
    private int capacity;
    private int studentCount;
    private String title;

    public Course(int classId, int capacity, int studentCount, String title) {
        this.classId = classId;
        this.capacity = capacity;
        this.studentCount = studentCount;
        this.title = title;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    private String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Course{" +
                "classId=" + classId +
                ", capacity=" + capacity +
                ", studentCount=" + studentCount +
                ", title='" + title + '\'' +
                '}';
    }
}
