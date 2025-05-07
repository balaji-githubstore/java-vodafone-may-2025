package com.vodafone.collections;

import java.util.ArrayList;

public class Demo1List {
	
	public static void main(String[] args) {
		
		ArrayList<String> colors=new ArrayList<String>();
		
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		colors.add("orange");
		colors.add("yellow");
		colors.add("black");
		
//		System.out.println(colors);
//		System.out.println(colors.size());
//		
//		colors.remove("blue");
//		
//		System.out.println(colors);
//		System.out.println(colors.size());
//		
//		colors.add(0, "yellow");
//		colors.add(0, "yellow");
//		System.out.println(colors);
//		System.out.println(colors.size());
//		
//		System.out.println(colors.get(2));
		
		System.out.println("---------------------");
		
		for(String color : colors)
		{
			if(color.equals("green"))
			{
				System.out.println(color+" is available");
				break;
			}
		}
	}

}
