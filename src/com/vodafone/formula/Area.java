package com.vodafone.formula;

public class Area {

	public static double areaOfCircle(int r) {
		return 3.14 * r * r;
	}

	public static double areaOfRectangle(double length, double width) {
		return length * width;
	}

	public double areaOfTriangle(double base, double height) {
		return (base * height) / 2;
	}

	public String getAuthorName() {
		return "Balaji Dinakaran";
	}

	public static void quit() {

	}
}
