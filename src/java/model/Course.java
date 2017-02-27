/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author vamsyramk
 */
public class Course {
    String id;
    String coursename;
    String totalseats;
    String currentseats;

    public Course() {
    }

    public Course(String id, String coursename, String totalseats, String currentseats) {
        this.id = id;
        this.coursename = coursename;
        this.totalseats = totalseats;
        this.currentseats = currentseats;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getTotalseats() {
        return totalseats;
    }

    public void setTotalseats(String totalseats) {
        this.totalseats = totalseats;
    }

    public String getCurrentseats() {
        return currentseats;
    }

    public void setCurrentseats(String currentseats) {
        this.currentseats = currentseats;
    }
    
}
