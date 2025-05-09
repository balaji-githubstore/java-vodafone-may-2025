package com.vodafone.inheritance;


interface WebDriverDemo1
{
	public abstract void get(String url);
	public abstract void quit();
}

interface javascriptexecutordemo
{
	void executescript();
}

class ChromeDriverDemo implements WebDriverDemo1,javascriptexecutordemo
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
	
	public void executescript() {
		// TODO Auto-generated method stub
		System.out.println("chrome executescript");
	}
}

class EdgeDriverDemo implements WebDriverDemo1,javascriptexecutordemo
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
	public void testEdge()
	{
		
	}
	public void executescript() {
		// TODO Auto-generated method stub
		System.out.println("edge executescript");
	}
}


public class Demo2Interface {

	public static void main(String[] args) {
		
//		String browser="ch";
//		
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
		
		
		javascriptexecutordemo d= (javascriptexecutordemo) driver;
		d.executescript();
		//driver.exe


	}

}
