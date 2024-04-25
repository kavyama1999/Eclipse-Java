package com.xworkz.passbookrunner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.xworkz.collectioclass.VoterIds;

public class VoterIdsRunner {

	public static void main(String[] args) {

		Collection<String> collection = VoterIds.voterIds();
		
		System.out.println("Size:"+collection.size());
		
		
		System.out.println("VoterIds");
		for(String voterId:collection)
		{
			System.out.println(voterId);
		}
		
		
		System.out.println("Removed voter lists");
		Iterator<String> itr=collection.iterator();
		
		int removedVoterid=0;
          while(itr.hasNext())
          {
        	  String id=itr.next();
        	  if(id.equals("SQU5144738"))
        	  {
        		  itr.remove();
        		  System.out.println(id);
        		  removedVoterid++;
        	  }
          }
          
System.out.println("Total number voter id:"+collection.size());
System.out.println(removedVoterid);
//itr= id.replaceAll("[^a-zA-Z0-9]"," ");
// System.out.println("after removing special charectors: "+itr);


Iterator<String> it=collection.iterator();
while(it.hasNext())
{
	String vote=it.next();
	Pattern special = Pattern.compile("[^S-Z]", Pattern.CASE_INSENSITIVE);
	Matcher matcher = special.matcher(vote);// name does not contain special characters
	// matcher performs against the pattern
	// System.out.println("Messages:"+msg);

	if (matcher.find()) 
	{
		System.out.println(vote + "Message having Spcial Characters");	
}
	//System.out.println();
	//System.out.println("After Total Messages:" + collection.size());
}
	for (String msg : collection)
	{
		System.out.println(msg);
	}
	}
	}
