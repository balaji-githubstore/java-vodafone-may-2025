package com.vodafone.datatypes;

public class Demo1Datatypes {
	
	public static void main(String[] args) {
		
		byte a=100; //8 bits occupied during runtime
		short b=100; //16 bits
		int c=100; //32 bits 
		long d=100L; //64 bits 
		
		
		//1000 students - assume percentage is calculated
		// Using byte - 8000 bits of memory 
		// Using int - 32000 bits of memory 
		
		float e=10.123456789f; //32 bits 
		double f=10.123456789; //64 bits 
		
		boolean check=true; //1 bit
		
		char letter='f'; //16 bits 
		
		String myName="Bala"; //16*4 bits of memory
		
		System.out.println(myName);
		
		System.out.println(myName.toUpperCase());
		System.out.println(myName.toLowerCase());
		System.out.println(myName.equals("Bala"));
		System.out.println(myName.equalsIgnoreCase("Bala"));
		System.out.println(myName.contains("ba"));
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		System.out.println(e);
		System.out.println(f);
		
		System.out.println(myName);
	}
	

}
