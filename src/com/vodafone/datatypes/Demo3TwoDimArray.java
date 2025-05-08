package com.vodafone.datatypes;

public class Demo3TwoDimArray {

	public static void main(String[] args) {

		String[][] arr = { { "john", "john123" }, { "saul", "saul223" }, { "kim", "kim123" } };
		
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		
		System.out.println(arr[2][0]);
		System.out.println(arr[2][1]);
		
		
		Object[][] arr1=new Object[3][2]; 
		//i--> number of testcases
		//j-->number of arguments
		arr1[0][0]="john";
		arr1[0][1]=787878;
		
		arr1[1][0]="saul";
		arr1[1][1]="saul123";
		
		arr1[2][0]="kim";
		arr1[2][1]="kim123";
		
//		Object a =20;
//		a="";
//		a=45.2; //boxing
//		
//		String z=(String) a; //unboxing
//		System.out.println(z);
	}

}
