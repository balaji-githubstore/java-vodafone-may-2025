package com.vodafone.datatypes;

public class Demo2Array {

	public static void main(String[] args) {
		
		//10, 20, 30, 40, 50 
		
		int[] numbers=new int[5]; //5*32 bits of memory
		
		numbers[0]=10;
		numbers[1]=20;
		//numbers[2]=30;
		numbers[3]=40;
		numbers[4]=50;
		
		System.out.println(numbers);
		System.out.println(numbers[0]);
		System.out.println(numbers[2]);
		System.out.println(numbers[4]);
		
		double[] arr1=new double[2]; //64*2 bits 
		
		//create an array to store colors --> red,green,yellow
		String[] colors=new String[3];
		colors[0]="red";
		colors[1]="green";
		//colors[2]="yellow";
		
		System.out.println(colors);
		
		System.out.println(colors[2]);
		
		String[] colors1= {"red","yellow","green"};
		System.out.println(colors1.length);
		System.out.println(colors1[2]);
	}

}





