package com.xworkz.templerule;

public class IpsExamImpl implements ExamRules {

	@Override
	public boolean haltTicket() {
		System.out.println("Halticket is issued");
		return true;
	}

	@Override
	public String invigilator() {
		System.out.println("Invigilator");
		return "Smithan";
	}

	@Override
	public double duration() {
		System.out.println("Exam duration");
		return 3.30d;
	}

}

//ctr+shift+F for content format