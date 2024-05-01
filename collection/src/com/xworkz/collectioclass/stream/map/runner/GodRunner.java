package com.xworkz.collectioclass.stream.map.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

import com.xworkz.collectioclass.stream.map.GodDTO;

public class GodRunner {

	public static void main(String[] args) {

GodDTO god1=new GodDTO("Shiva", "Kailasa", "Male", "Kalabhairava", "Destroy EveryThing");

GodDTO god2=new GodDTO("Vishnu", "Vaikunta", "Male", "Venkateshwara", "SudarshanaChakra");

GodDTO god3=new GodDTO("Parvathi", "Kailasa", "Female", "Kempamma", "Nature");

GodDTO god4=new GodDTO("Lakshmi", "Vaikunta", "Female", "AdrustaLakshmi", "Rich");

GodDTO god5=new GodDTO("Bramha", "Air", "Male", "bramha", "Creater");

GodDTO god6=new GodDTO("Indra", "Air", "Male", "Indra", "Protect");

GodDTO god7=new GodDTO("Saraswathi", "Kailasa", "Female", "VidyaSarsaswathi", "Education");

GodDTO god8=new GodDTO("Surya", "SuryaLokha", "Male", "Sun", "Brightness");

GodDTO god9=new GodDTO("Ganga", "River", "Female", "Water", "Give water to use");

GodDTO god10=new GodDTO("Venkataramna", "Tirupathi", "Male", "Venkateshwara", "give vara");


Collection<GodDTO> godCollection=new ArrayList<GodDTO>();
godCollection.add(god1);
godCollection.add(god2);
godCollection.add(god3);
godCollection.add(god4);
godCollection.add(god5);
godCollection.add(god6);
godCollection.add(god7);
godCollection.add(god8);
godCollection.add(god9);
godCollection.add(god10);

//comparable
System.out.println("*******1********");
godCollection
.stream()
//.map(ref->ref.getName())
.sorted()
.forEach(name->System.out.println(name));

////desc
//System.out.println("***************place********");
//godCollection
//.stream()
//.map(ref->ref.getPlace())//dto convert to string //now access string 
//.sorted()
//.forEach(place->System.out.println(place));
//
////


System.out.println("********** desc place***********");
godCollection
.stream()
.map(ref->ref.getPlace())
.sorted((p1,p2)->p2.compareTo(p1))
.forEach(place->System.out.println(place));

//asce 
System.out.println("********** asc place***********");
godCollection
.stream()
.map(ref->ref.getPlace())
.sorted((p1,p2)->p1.compareTo(p2))
.forEach(place->System.out.println(place));

System.out.println("**********************");
godCollection
.stream()
.filter(male->male.getGender().contains("Male"))
.sorted((m1,m2)->m2.getAvatar().compareTo(m1.getAvatar()))
.forEach(avtar->System.out.println(avtar));

System.out.println("*********5*************");
godCollection
.stream()
.filter(female->female.getGender().contains("Female"))
.sorted((m1,m2)->m1.getPlace().compareTo(m2.getPlace()))
.forEach(avtar->System.out.println(avtar));

System.out.println("*********6*************");

godCollection
.stream()
.map(ref->ref.getPlace())
.sorted((c1,c2)->c2.compareTo(c1))
.forEach(name->System.out.println(name));

System.out.println("*********7*************");


godCollection
.stream()
.map(spl->spl.getSpecialPower())
.sorted((s1,s2)->s2.compareTo(s1))
.forEach(spl->System.out.println(spl));

System.out.println("**********8************");

godCollection
.stream()
.filter(god->god.getName().equals("Shiva") && god.getPlace().equals("kailasa"))
//.sorted()
.forEach(n->System.out.println(n));
	
	}

}



//.sorted((entry1, entry2) -> entry2.getKey().compareTo(entry1.getKey())) // Sort by name in descending order

