package com.xworkz.genereicinterface.runner;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.IntSupplier;

import com.xworkz.genereicinterface.BiConsumerCheck;
import com.xworkz.genereicinterface.BiFunctionCheck;
import com.xworkz.genereicinterface.FunctionCheck;
import com.xworkz.genereicinterface.IntSupplierChek;
import com.xworkz.genereicinterface.LongFunctionCheck;
import com.xworkz.genereicinterface.ObjDoubleConsumerCheck;
import com.xworkz.genereicinterface.PredicateCheck;
import com.xworkz.genereicinterface.ToIntBiFunctionCheck;
import com.xworkz.genereicinterface.ToLongFunctioncheck;

public class Runner {
	public static void main(String[] args) {

		BiConsumer<Integer, Integer> consumer = (a, b) -> {
			System.out.println("addition of a and b is:" + (a + b));
		};
		consumer.accept(20, 40);

		// explicit
		BiConsumer<Integer, Integer> consume = (k, y) -> {
			System.out.println("Explicit Biconsumer");
			System.out.println("Substraction of k and y is:" + (k - y));
		};
		consume.accept(40, 30);

		BiConsumerCheck bi = new BiConsumerCheck(consume);
		bi.check();

		System.out.println("^^^^^^^^^^^^BiFuntion^^^^^^^^^^^^^^^^^^^^");

		// implicit
		BiFunctionCheck bifunction = new BiFunctionCheck((p, l) -> {

			System.out.println("Addition od p and l:" + (p + l));
			return true;
		});
		bifunction.function();

//		BiFunctionCheck bifun = new BiFunctionCheck((a, c) -> {
//			System.out.println("Multiflication is :"+(a*c));
//			return true;
//		});
//		bifun.function();

		System.out.println("*******Function**********");

		Function<Float, Integer> fun = (h) -> {
			return 90;// return compare with association class
		};
		// fun.apply(null)
		FunctionCheck ch = new FunctionCheck(fun);
		ch.fun();

		System.out.println("*************IntSupplier*****************");

//		IntSupplier sup=()->20;
//		IntSupplierChek gh=new IntSupplierChek(sup);
//		gh.supplier();

//		or

		IntSupplierChek gh = new IntSupplierChek(() -> 40);
		gh.supplier();

		System.out.println("*************LongFunction*****************");

		LongFunctionCheck lg = new LongFunctionCheck((d) -> "Smithan");

		lg.check();

		System.out.println("*************Predicate*****************");

		PredicateCheck predicate = new PredicateCheck((Integer k) -> {
			System.out.println(k + 2);// compare with predicate built in method test
			return false;// compare with if condition
		});
		predicate.pre();

		System.out.println("*************ObjDoubleConsumer*****************");

		ObjDoubleConsumerCheck check = new ObjDoubleConsumerCheck((String s, double value) -> {
			System.out.println("String:" + s + ",Double:" + value);
		});
		check.objConsumer();

		System.out.println("*************ToIntBiFunction*****************");

//		ToIntBiFunctionCheck checkFunction=new ToIntBiFunctionCheck((f,k)->20);
//		System.out.println("Integer:" + f+",String:"+k);
//		checkFunction.to();

		ToIntBiFunctionCheck checkfunction = new ToIntBiFunctionCheck((Integer f, String t) -> {
			System.out.println("Integer :" + f + ",String:" + t);
			return 30;
		});
		checkfunction.to();

		System.out.println("*************ToLongFunction*****************");
		ToLongFunctioncheck function = new ToLongFunctioncheck((g) -> {
			System.out.println("Double:" + (g + 3));

			return 30444l;

		});
		function.to();

	}
}
