package com.xworkz.templerule;

public interface ElectionRule {
	
	String KARNATAKA_ELECTION="karnataka_election";
	String MLA_ELECTION="mla_election";
	
	boolean secreteBallot();
	String voterName();
	String electionDate();
	String participateCandidate();
	String voterEducation();
	double electionDuration();
	

}
