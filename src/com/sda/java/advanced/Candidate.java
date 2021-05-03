package com.sda.java.advanced;

public class Candidate {

    private String fullName;
    private int levelOfCompetence;
    private DepartmentName department;
    private Status status;

    public Candidate(String fullName, int levelOfCompetence, DepartmentName department, Status status) {
        this.fullName = fullName;
        this.levelOfCompetence = levelOfCompetence;
        this.department = department;
        this.status = status;
    }

    public String toString(){

        return "Candidate Name: " + fullName +
                " Level of competence: " + levelOfCompetence +
                " Department: " + department +
                " Status: " + status;
    }

    public DepartmentName getDepartment() {
        return department;
    }

    public int getLevelOfCompetence() {
        return levelOfCompetence;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
