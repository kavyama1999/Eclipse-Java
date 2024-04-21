package com.xworkz.genereicinterface;

import java.util.function.BiConsumer;

public class BiConsumerCheck{
	
	
	private BiConsumer<Integer, Integer> biconsumer;
	
	//construtor
	public BiConsumerCheck(BiConsumer<Integer, Integer> bio)
	{
		this.biconsumer=bio;
	}

	public void check()
	{
		
		System.out.println("Check method running in BiConsumer");
		biconsumer.accept(20, 30);
	}
	
}
 

//package com.xworkz.genereicinterface;
//
//import java.util.function.BiConsumer;
//
//public class BiConsumerCheck {
//
//    private BiConsumer<Integer, Integer> bioconsumer;
//
//    public BiConsumerCheck(BiConsumer<Integer, Integer> bio) {
//        this.bioconsumer = bio;
//    }
//
//    public void check() {
//        System.out.println("Biconsumer");
//    }
//}
