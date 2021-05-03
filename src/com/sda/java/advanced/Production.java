package com.sda.java.advanced;

public class Production extends Department{


    public Production(int minLevelOfCompetence){
        super.minLevelOfCompetence = minLevelOfCompetence;
    }

    @Override
    public void evaluate(Candidate candidate) {

        if(candidate.getLevelOfCompetence() >= minLevelOfCompetence)
            candidate.setStatus(Status.ACCEPTED);
        else
            candidate.setStatus(Status.REJECTED);

    }
}
