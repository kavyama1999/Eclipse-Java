package com.xworkz.templerule;

public class ExamAdmin {
	private ExamRules examRules;

	public ExamAdmin(ExamRules examRules) {
		this.examRules = examRules;

	}

//*******************************************************************

	public void exam() {
		if (examRules != null) {
			boolean bl = examRules.haltTicket();
			System.out.println("Halticket Is given:" + bl);

		}
	}

	public void examInvigilator() {
		if (examRules != null) {
			String st = examRules.invigilator();
			System.out.println("Invigilator Name:" + st);
		}
	}

	public void examDuration() {
		if (examRules != null) {
			double dl = examRules.duration();
			System.out.println("Exam duration:" + dl);

		}
	}

}
