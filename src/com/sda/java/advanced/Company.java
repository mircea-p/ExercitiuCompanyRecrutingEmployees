package com.sda.java.advanced;

import com.sda.java.advanced.Candidate;

import java.util.Set;

public class Company {

    private String name;
    private Set<Candidate> candidatesList;
    private Set<Department> departmentsList;

    public static void recruting(Candidate candidate){

        if(candidate.getDepartment() == DepartmentName.MARKETING) {
            Department marcheting = new Marcheting(50);
            marcheting.evaluate(candidate);
        }else
            if(candidate.getDepartment() == DepartmentName.PRODUCTION){
                Department production = new Production(100);
                production.evaluate(candidate);
            }else
                throw new EvaluationIncapacityException("Acest departament nu exista momentan!");


    }
}
