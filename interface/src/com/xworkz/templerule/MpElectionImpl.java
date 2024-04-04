package com.xworkz.templerule;

public class MpElectionImpl implements ElectionRule {

	@Override
	public boolean secreteBallot() {
		System.out.println("Running  secreteBallot in MpElectionImpl");
		return null != null;
		//return true;
	}

	@Override
	public String voterName() {
		System.out.println("Running voterName in MpElectionImpl ");
		return "Sathwik";
	}

	@Override
	public String electionDate() {
		System.out.println("Running  electionDate in MpElectionImpl");
		return "26 April 2024";
	}

	@Override
	public String participateCandidate() {
		System.out.println("Running participateCandidate in MpElectionImpl");
		return "Modi";
	}

	@Override
	public String voterEducation() {
		System.out.println("Running voterEducation in MpElectionImpl ");
		return "Degree";
	}

	@Override
	public double electionDuration() {
		System.out.println("Running election duration inMpElectionImpl");
		double duration = 12.0d;
		return duration;
	}

}
