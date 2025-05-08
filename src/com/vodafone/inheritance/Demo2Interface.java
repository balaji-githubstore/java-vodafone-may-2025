package com.vodafone.inheritance;


interface WebDriverDemo1
{
	public abstract void get(String url);
	public abstract void quit();
}

class ChromeDriverDemo implements WebDriverDemo1
{
	public ChromeDriverDemo()
	{
		System.out.println("Launch chrome");
	}

	public void get(String url) {
		System.out.println("navigate url in chrome browser");
	}

	public void quit() {
		System.out.println("close chrome browser");
	}
	
	public void testChrome()
	{
		
	}
}

class EdgeDriverDemo implements WebDriverDemo1
{
	public EdgeDriverDemo()
	{
		System.out.println("Launch edge");
	}
	public void get(String url) {
		System.out.println("navigate url in edge browser");
	}

	public void quit() {
		System.out.println("close edge browser");
	}
}


public class Demo2Interface {

	public static void main(String[] args) {
		
		String browser="edge";
		
//		WebDriverDemo1 driver;
//		
//		if(browser.equalsIgnoreCase("edge"))
//		{
//			 driver=new EdgeDriverDemo();
//		}
//		else
//		{
//			driver=new ChromeDriverDemo();
//		}
		
		WebDriverDemo1 driver=new EdgeDriverDemo();
		
		driver.get("");
		
		driver.quit();
		
		
		

	}

}
