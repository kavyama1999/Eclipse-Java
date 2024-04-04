package com.xworkz.templerule;

public class ElectionAdmin {

	ElectionRule electionRule;

	public ElectionAdmin(ElectionRule electionRule) {
		this.electionRule = electionRule;
	}

	public void electionBallot() {
		if (electionRule != null) {
			boolean bl = electionRule.secreteBallot();
			System.out.println("SecreteBallot :" + bl);
		} else {
			System.out.println("dhjfh");
		}
	}

	public void eleVoterName() {
		if (electionRule != null) {
			String name = electionRule.voterName();
			System.out.println("VoterName:" + name);
		}

		else {
			System.out.println("name is not available");
		}
	}
	
	public void eleDate()
	{
		if(electionRule!=null)
		{
			String date=electionRule.electionDate();
			System.out.println("Election Date:"+date);
		}
	}
	
	public void participate()
	{
		if(electionRule!=null)
		{
		String participate=electionRule.participateCandidate();
		System.out.println("Participate candidate :"+participate);
		}
	}

	public void education()
	{
		if(electionRule!=null)
		{
			String education=electionRule.voterEducation();
			System.out.println("Voter Education:"+education);
		}
	}
}
