package com.vodafone.collections;

import java.util.ArrayList;

public class Demo2List {
	
	public static void main(String[] args) {
		
		ArrayList<Double> colors=new ArrayList<Double>();
		
		colors.add(45.2);
		colors.add(45.3);
		colors.add(5.0);
		colors.add(5.0);
		colors.add(5.0);
		
		System.out.println(colors);
		System.out.println(colors.size());
		
		
//		for(int i=0;i<colors.size();i++)
//		{
//			System.out.println(colors.get(i));
//		}

		for(double x : colors)
		{
			System.out.println(x);
		}
		
	}

}
