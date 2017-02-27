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
public class Student {
    private String firstname;
    private String lastname;
    private String suffix;
    private String dob;
    private String email;
    private String contact;
    private String branch;
    private int grescore;
    private Double englishscore;
    private Double percentage;
    private String country;
    private String state;
    private String zip;

    public Student() {
    }

    public Student(String firstname, String lastname, String suffix, String dob, String email, String contact, String branch, int grescore, Double englishscore, Double percentage, String country, String state, String zip) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.suffix = suffix;
        this.dob = dob;
        this.email = email;
        this.contact = contact;
        this.branch = branch;
        this.grescore = grescore;
        this.englishscore = englishscore;
        this.percentage = percentage;
        this.country = country;
        this.state = state;
        this.zip = zip;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    
    

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getGrescore() {
        return grescore;
    }

    public void setGrescore(int grescore) {
        this.grescore = grescore;
    }

    public Double getEnglishscore() {
        return englishscore;
    }

    public void setEnglishscore(Double englishscore) {
        this.englishscore = englishscore;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
    
}
