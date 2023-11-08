package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.SoloCabPage;

public class SoloCabTest {
	WebDriver driver;
	@BeforeTest
	public void setvalues()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.solocabs.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void Bazar1() throws Exception 
	{
	SoloCabPage sc=new SoloCabPage(driver);
	sc.pickupdest("Kochi","Alappuzha, Kerala, India");
	sc.date();
	sc.pickuptime();
	sc.phonetest();
	sc.searching();
	sc.roundtrip();
	sc.rounddest("Kollam,Kerala,India","Bangalore, Karnataka, India");
	sc.plustest();
	sc.rdates();
	
	sc.rpickuptime();
    sc.rddatee();
	sc.rsearching();
	sc.pack1();
	//sc.psearching();

	}
	@AfterMethod
	public void ends()
	{
		//driver.close();
	}



}
