package com.xworkz.passbookrunner;

import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collectioclass.Message;

public class MessageRunner {

	public static void main(String[] args) {
		Collection<String> collect = Message.getMessage();

		Iterator<String> iterator = collect.iterator();

		System.out.println("Size:" + collect.size());

		for (String name : collect) {
			System.out.println("message:" + name);
		}

		System.out.println("***************greater than 30*****************");
		for (String ms : collect) {
			// System.out.println("messages:"+ms);
			if (ms.length() > 30) {
				System.out.println("message length greater than 30:" + ms);
			}
		}

		// System.out.println("&&&&&&&&&&&removing&&&&&&&&&&&&&&&&&&&&&&&&");
		// iterator = collect.iterator();

//	while(iterator.hasNext())//return boolean
//	{
//		String msg=iterator.next();
//		System.out.println("Message: " + msg);
//		if(msg.equals("servlet"))
//		{
//			iterator.remove();
//		}
//	}
//		System.out.println("hxhhdh:"+collect);

//	
		
		System.out.println("&&&&&&&&&&&removing&&&&&&&&&&&&&&&&&&&&&&&&");
		int countwithremove=0;

		while (iterator.hasNext()) {
			String msg = iterator.next();
			if (msg.length() > 30) {
				iterator.remove();
				countwithremove++;
			}
		}
		
		System.out.println("message:" + collect);
		System.out.println("Removed message is:"+countwithremove);
		

		for(String after:collect)
		{
			System.out.println("avialable message:"+after);
			countwithremove++;

		}

	}
	
	

}
