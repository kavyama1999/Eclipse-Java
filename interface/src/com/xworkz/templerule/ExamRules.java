package com.xworkz.templerule;

public interface ExamRules {
	String IPS="Ips";
	String KPSC="kpsc";
	
	boolean haltTicket();
	String invigilator();
	double duration();

}
