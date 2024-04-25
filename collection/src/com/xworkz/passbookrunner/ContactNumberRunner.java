package com.xworkz.passbookrunner;

import java.util.Collection;

import com.xworkz.collectioclass.ContactNumber;

public class ContactNumberRunner {

	public static void main(String[] args) {
    Collection<Long> collect=ContactNumber .contactNumber();
    System.out.println("number size:"+collect.size());
    
    
	System.out.println("contact Numbers");
	
	for(Long number:collect)
	{
		System.out.println(number);
	}

	System.out.println("************************************");
	
	
	
	
	
	
	
	//extra 
	int countnumber9=0;
    for(Long num:collect)
    {
		String phoneNum = String.valueOf(num);// In this , it converts the Long value lg into a String.

    	if(phoneNum.startsWith("9"))
    	
    	{
    		System.out.println(phoneNum);
    		countnumber9++;
    	}
    }
    System.out.println("start with number 9 are:"+countnumber9);
	}

}
