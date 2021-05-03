package com.sda.java.advanced;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Candidate c1 = new Candidate("Vasile Andrei", 70, DepartmentName.MARKETING, Status.AWAITING);
        Candidate c2 = new Candidate("Paul Puscas", 105, DepartmentName.PRODUCTION, Status.AWAITING);
        Candidate c3 = new Candidate("Barbatei Corina", 60, DepartmentName.MARKETING, Status.AWAITING);
        Candidate c4 = new Candidate("Tudor Ravoiu", 70, DepartmentName.PRODUCTION, Status.AWAITING);
        System.out.println(c1);
        System.out.println(c2);
        Company.recruting(c1);
        Company.recruting(c2);
        System.out.println(c1);
        System.out.println(c2);

    }
}
