package com.vodafone.methods;

import com.vodafone.formula.Area;

public class Demo1Runner {

	public static void main(String[] args) {
		
		
		Area obj=new Area(); 

		int radius = 10;

		double result = Area.areaOfCircle(radius);
		System.out.println(result);

		result = Area.areaOfCircle(20);
		System.out.println(result);

		result = Area.areaOfRectangle(2.2, 2.2);
		System.out.println(result);

		System.out.println(Area.areaOfRectangle(4, 4));

		System.out.println(obj.areaOfTriangle(25, 1));
		
		//System.out.println((double)22/7);
		
		String myName=obj.getAuthorName();
		System.out.println(myName);
		
		Area.quit();
	}

}
