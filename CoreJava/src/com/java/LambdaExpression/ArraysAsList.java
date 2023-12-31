package com.java.LambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ArraysAsList {

	public static void main(String[] args) {
		Integer arr[]= {25,14,17,25,47,78};
		List<Integer> l1=new ArrayList();
		l1=Arrays.asList(arr);//Returns a fixed-size list backed by the specified array
		//System.out.println(l1);
		/*for(int i:l1) {
			System.out.println(i);
		}*/
		//l1.forEach(i->System.out.println(i));//Lambda Expression = Consumer Implementation
		//Consumer<Integer>c = new ConsumerImplementation();//This is a functional interface whose functional method is accept(Object).
		/*Consumer<Integer>c =new Consumer<Integer>()
		{
			@Override
			public void accept(Integer i) {
				// TODO Auto-generated method stub
				System.out.println(i);
			}
			
		};*/
		//Consumer<Integer>c=(Integer i)->{System.out.println(i);};
		Consumer<Integer>c=(i->System.out.println(i));
		l1.forEach(c);
	}

}
/* class ConsumerImplementation implements Consumer<Integer>
{
	@Override
	public void accept(Integer i) {
		// TODO Auto-generated method stub
		System.out.println(i);
	}
	
} */