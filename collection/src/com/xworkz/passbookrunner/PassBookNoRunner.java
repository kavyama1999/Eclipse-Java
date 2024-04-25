package com.xworkz.passbookrunner;

import java.util.Collection;

import com.xworkz.collectioclass.PassBookNo;

public class PassBookNoRunner {
	public static void main(String[] args) {

		Collection<Long> collect = PassBookNo.passBookNo();
		System.out.println("Pass Book number:" + collect);
		System.out.println(" Size:" + collect.size());
		//collect.remove(5757671011002552l);

		int countStartsWithFour = 0;
		for (Long lg : collect) {
			// System.out.println("Pass Book No:"+lg);
			String passBookNumber = String.valueOf(lg);// In this case, it converts the Long value lg into a String.

			if (passBookNumber.startsWith("4")) {
				System.out.println("Pass Book number start with '4'  :" + passBookNumber);
				countStartsWithFour++;
			}
//			else if (passBookNumber.contains("0")) {
//				// System.out.println(passBookNumber.size());
//				System.out.println("whose number having '0':" + passBookNumber);
//			}

		}

		System.out.println("Count of whose number start with 4 is:" + countStartsWithFour);
		System.out.println("********************************");
		int countWithZero = 0;
		for (Long longer : collect) {
			String passBookNum = String.valueOf(longer);// In this , it converts the Long value lg into a String.
			if (passBookNum.contains("0")) {
				System.out.println("Whose number having '0' :" + passBookNum);
				countWithZero++;
			}

		}
		System.out.println("count of whose passbookno having 0 is:" + countWithZero);
	}
}

