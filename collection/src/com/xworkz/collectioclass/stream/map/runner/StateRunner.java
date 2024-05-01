package com.xworkz.collectioclass.stream.map.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

import com.xworkz.collectioclass.stream.map.Direction;
import com.xworkz.collectioclass.stream.map.StateDTO;

public class StateRunner {

	public static void main(String[] args) {

        StateDTO state1 = new StateDTO("Karnataka", 1500000L, Direction.SOUTH, "Siddaramaiah", 23000d, 2300000L);
        StateDTO state2 = new StateDTO("Arunachal Pradesh", 2000000L, Direction.SOUTH, "Pema Khandu", 200000d, 600000L);
        StateDTO state3 = new StateDTO("Goa", 1500000L, Direction.EAST, "Himanta Biswa Sarma", 150000d, 700000L);
        StateDTO state4 = new StateDTO("Andhra Pradesh", 1200000L, Direction.WEST, "Nitish Kumar", 120000d, 800000L);
        StateDTO state5 = new StateDTO("Chhattisgarh", 1800000L, Direction.NORTH, "Vishnu Deo Sai", 180000d, 900000L);
        StateDTO state6 = new StateDTO("Assam", 1300000L, Direction.SOUTH, "Pramod Sawant", 130000d, 1000000L);
        StateDTO state7 = new StateDTO("Gujarat", 1100000L, Direction.EAST, "Bhupendra Patel", 110000d, 1100000L);
        StateDTO state8 = new StateDTO("Haryana", 1700000L, Direction.WEST, "Nayab Singh Saini", 170000d, 1200000L);
        StateDTO state9 = new StateDTO("Himachal Pradesh", 1400000L, Direction.NORTH, "Sukhvinder Singh Sukhu", 140000d, 1300000L);
        StateDTO state10 = new StateDTO("Jharkhand", 1600000L, Direction.SOUTH, "Champai Soren", 120000d, 8900000L);
		StateDTO state11 = new StateDTO("Bihar", 1000000L, Direction.NORTH, "YS Jagan Mohan Reddy", 100000d, 500000L);
        StateDTO state12 = new StateDTO("Kerala", 600000L, Direction.SOUTH, "Pinarayi Vijayan", 130000d, 23400000L);
        StateDTO state13 = new StateDTO("Madhya Pradesh", 100000L, Direction.SOUTH, "Mohan Yadav", 210000d, 4400000L);
        StateDTO state14 = new StateDTO("Maharashtra", 2100000L, Direction.SOUTH, "Eknath Shinde", 540000d, 100000L);
        StateDTO state15 = new StateDTO("Manipur", 800000L, Direction.SOUTH, "N. Biren Singh", 560000d, 140000L);
        StateDTO state16 = new StateDTO("Meghalaya", 100000L, Direction.SOUTH, "Conrad Kongkal Sangma", 340000d, 4400000L);
        StateDTO state17 = new StateDTO("Mizoram", 1200000L, Direction.SOUTH, "Lalduhoma", 230000d, 1200000L);
        StateDTO state18 = new StateDTO("Nagaland", 2600000L, Direction.SOUTH, "Neiphiu Rio", 1340000d, 5600000L);
        StateDTO state19 = new StateDTO("Odisha", 160000L, Direction.SOUTH, "Naveen Patnaik", 450000d, 239000L);
        StateDTO state20 = new StateDTO("Punjab", 1800000L, Direction.SOUTH, "Bhagwant Singh Mann", 150000d, 1700000L);
        StateDTO state21 = new StateDTO("Rajasthan", 1100000L, Direction.SOUTH, "Bhajan Lal Sharma", 780000d, 1300000L);
        StateDTO state22 = new StateDTO("Sikkim", 450000L, Direction.SOUTH, "PS Golay", 560000d, 1200000L);
        StateDTO state23 = new StateDTO("Tamil Nadu", 2300000L, Direction.SOUTH, "M. K. Stalin", 670000d, 3200000L);
        StateDTO state24 = new StateDTO("Telangana", 120000L, Direction.SOUTH, "Anumula Revanth Reddy", 240000d, 1200000L);
        StateDTO state25 = new StateDTO("Tripura", 123000L, Direction.SOUTH, "Dr. Manik Saha", 670000d, 4500000L);
        StateDTO state26 = new StateDTO("Uttar Pradesh", 6700000L, Direction.SOUTH, "Yogi Aditya Nath", 40000d, 600000L);
        StateDTO state27 = new StateDTO("Uttarakhand", 1200000L, Direction.SOUTH, "Pushkar Singh Dhami", 120000d, 1200000L);
        StateDTO state28 = new StateDTO("West Bengal", 86000L, Direction.NORTH, "Mamata Banerjee", 760000d, 4500000L);
        StateDTO state29 = new StateDTO("Jharkhand", 2300000L, Direction.SOUTH, "CM10", 120000d, 2300000L);


        Collection<StateDTO> stateCollection= new ArrayList<StateDTO>();
        stateCollection.add(state1);
        stateCollection.add(state2);
        stateCollection.add(state3);
        stateCollection.add(state4);
        stateCollection.add(state5);
        stateCollection.add(state6);
        stateCollection.add(state7);
        stateCollection.add(state8);
        stateCollection.add(state9);
        stateCollection.add(state10);
        stateCollection.add(state11);
        stateCollection.add(state12);
        stateCollection.add(state13);
        stateCollection.add(state14);
        stateCollection.add(state15);
        stateCollection.add(state16);
        stateCollection.add(state17);
        stateCollection.add(state18);
        stateCollection.add(state19);
        stateCollection.add(state20);
        stateCollection.add(state21);
        stateCollection.add(state22);
        stateCollection.add(state23);
        stateCollection.add(state24);
        stateCollection.add(state25);
        stateCollection.add(state26);
        stateCollection.add(state27);
        stateCollection.add(state28);
        stateCollection.add(state29);
        
       // Fix default sorting by name asc
        System.out.println("**********1**********");

       stateCollection
       .stream() 
       .sorted()
       .forEach(name->System.out.println(name));
       
       //Sort all states by name in desc 
       System.out.println("**********2**********");
       stateCollection
       .stream()
       .sorted((n1,n2)->n2.getName().compareTo(n1.getName()))
       .forEach(name->System.out.println(name));

       //get all states by each direction*4
       System.out.println("**********3**********");
       System.out.println("**********East**********");

       stateCollection
       .stream()
       .filter(di->di.getDirection().equals(Direction.EAST))
      .map(state->state.getName())
       .forEach(name->System.out.println("State with East:"+name));
       
       
       System.out.println("**********WEST**********");

       stateCollection
       .stream()
       .filter(s->s.getDirection().equals(Direction.WEST))
       .map(a->a.getName())
       //.sorted((g1,g2)->g1.getDirection().compareTo(g2.getDirection().WEST))
       .forEach(s->System.out.println(s));
   
       
       
       System.out.println("**********NORTH**********");

       stateCollection
       .stream()
       .filter(s->s.getDirection().equals(Direction.NORTH))
       .map(a->a.getName())
       //.sorted((g1,g2)->g1.getDirection().compareTo(g2.getDirection().WEST))
       .forEach(s->System.out.println(s));
       
       System.out.println("**********SOUTH**********");

       stateCollection
       .stream()
       .filter(s->s.getDirection().equals(Direction.SOUTH))
       .map(a->a.getName())
       //.sorted((g1,g2)->g1.getDirection().compareTo(g2.getDirection().WEST))
       .forEach(s->System.out.println(s));
       
       
       
       
       
       
       
       //get all population only by asc
       System.out.println("**********4**********");
       
       stateCollection
       .stream()
       .map(p->p.getPopulation())
       .sorted((p1,p2)->p1.compareTo(p2))
       .forEach(p->System.out.println(p));

       
       
       //get population only by state name 
       System.out.println("**********5**********");
stateCollection
.stream()
.filter(state -> state.getName().equals("Karnataka"))
.map(s->s.getPopulation()) 
.forEach(t->System.out.println(t));

//get chieftMinsiter name by state name 
System.out.println("**********6**********");

stateCollection
.stream()
.filter(c->c.getName().equals("Karnataka"))
.map(name->name.getChiefMinister())
.forEach(name->System.out.println(name));



//get state with max budget
System.out.println("**********7**********");

stateCollection
.stream()
.max(Comparator.comparingDouble(state -> state.getBudget()))
.ifPresent(state -> System.out.println("Maximum Budget: " + state.getBudget()));




//get state with min budget
System.out.println("**********8**********");
stateCollection
.stream()
//.min(Comparator.comparing())
.min(Comparator.comparingDouble(s->s.getBudget()))
.ifPresent(state -> System.out.println("Minimum Budget: " + state.getBudget()));


//get state with second max budget

System.out.println("**********9**********");


stateCollection
.stream()
.skip(1)
.findFirst()
.map(f->f.getName() )
.ifPresent(s->System.out.println("Second Maximum budget:" + s ));

//stateCollection
//.stream()
//.findFirst()
//get all by revenue greater than 10  
System.out.println("**********10**********");

stateCollection
.stream()
.filter(rev->rev.getRevenue()>10)
.forEach(revenue->System.out.println(revenue));



	}

}
