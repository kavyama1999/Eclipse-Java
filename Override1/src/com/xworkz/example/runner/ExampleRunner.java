package com.xworkz.example.runner;

import com.xworkz.example.Company;
import com.xworkz.example.Employee;
import com.xworkz.example.Manager;

public class ExampleRunner {

	public static void main(String[] args) {
		Company cmp=new Company();
		cmp.hireEmployee();
		cmp.salary();
		cmp.softwareDevelopment();
		
		
		Employee emp=new Employee();
		emp.coding();
		emp.teamWork();
		emp.hireEmployee();
		 emp.salary();
		 emp.softwareDevelopment();
		 
		 
		 Company cm=new Employee();
		 cm.hireEmployee();
			cm.salary();
			cm.softwareDevelopment();
			//cm.coding();
			//cm.teamWork();
			
			
			//casting
			
			Employee emp1=(Employee)cm;
			emp1.coding();
			emp1.teamWork();
	
		 
		 Manager mg=new Manager();
		 mg.teamBuilding();
		 mg.decisionmaking();
		 mg.coding();
		 mg.teamWork();
		 mg.hireEmployee();
		 mg.salary();	
		 mg.softwareDevelopment();
		 
		 Company company=new  Manager();
		 company.hireEmployee();
		 company.salary();
		 company.softwareDevelopment();
		 //company. teamBuilding();
		 
		
		 Manager manager=(Manager)company;
		 manager.teamBuilding();
		 manager.decisionmaking();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
