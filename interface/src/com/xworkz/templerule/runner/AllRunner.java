package com.xworkz.templerule.runner;

import com.xworkz.templerule.ElectionAdmin;
import com.xworkz.templerule.ElectionRule;
import com.xworkz.templerule.ExamAdmin;
import com.xworkz.templerule.ExamRules;
import com.xworkz.templerule.GaneshaTempleImpl;
import com.xworkz.templerule.IpsExamImpl;
import com.xworkz.templerule.MpElectionImpl;
import com.xworkz.templerule.TempleAdmin;
import com.xworkz.templerule.TempleRules;

public class AllRunner {
	public static void main(String[] args) {

		TempleRules temp = new GaneshaTempleImpl();

		temp.openTime();

//		GaneshaTempleImpl ga=new GaneshaTempleImpl();
//		
//		ga.specialEntry();

		TempleAdmin tp = new TempleAdmin(temp);
		tp.templeAdmin();
		tp.temple();
		tp.temples();

		// ExamRules ex=new ExamRules() ;//cannot instantiate becz it is interface
//***************************************************
		System.out.println("*******************************");
		ExamRules ex = new IpsExamImpl();
		ex.duration();

		ExamAdmin ad = new ExamAdmin(ex);
		ad.exam();
		ad.examInvigilator();
		ad.examDuration();

		System.out.println("*******************************");
		
		ElectionRule el=new MpElectionImpl();
		el.electionDate();
		
		ElectionAdmin admin=new ElectionAdmin(el);
		admin.electionBallot();
		admin.eleVoterName();
		admin.eleDate();
		admin.education();
		admin.participate();
		//admin.
	}

}
