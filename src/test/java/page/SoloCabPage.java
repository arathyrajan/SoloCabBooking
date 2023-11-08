package page;
import java.time.Duration;

//import java.util.List;

//import java.util.List;

//import java.util.List;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.ElementNotInteractableException;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.WebDriverWait;
public class SoloCabPage {
	WebDriver driver;
	By pickup=By.id("pickup_city1");
	By drop=By.id("next_destination1");
	By dateclick=By.id("datepicker1");
	//By day=By.xpath("//tbody/tr[5]/td[2]");
	By time=By.xpath("//*[@id=\"pickUpTime\"]");
	//By pickdate=By.xpath("//*[@id=\"datepicker1\"]");
	By mob=By.id("phone1");
	By search=By.xpath("//*[@id=\"myTabContent\"]/button");
	By bookcap=By.xpath("//*[@id=\"popclick\"]");
	By round=By.xpath("//*[@id=\"Three-tab\"]");
	By rpickup=By.xpath("//input[@id='pickup_city']");
	By rdrop=By.xpath("//*[@id=\"next_destination\"]");
	By plus=By.xpath("//body/div[1]/main[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/button[1]");
	By next=By.xpath("//*[@id=\"next_destination2\"]");
	By back=By.xpath("//*[@id=\"content\"]/div/div/div/div/div/a/button[1]");
	By datess=By.xpath("//*[@id=\"datepicker\"]");
	By rtime=By.xpath("//*[@id=\"pickUpTime1\"]");
	By redate=By.xpath("//*[@id=\"datepicker2\"]");
	By rmob=By.xpath("//*[@id=\"phone\"]");
	By rsearch=By.xpath("//button[contains(text(),'Search Now')]");
	By rbookcab=By.xpath("//*[@id=\"popclick\"]");
	By pack=By.linkText("Package");
	By pt=By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[2]/select[1]");
	By pdate=By.xpath("//*[@id=\"datepicker3\"]");
	By ptime=By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[6]/select[1]");
	By pmob=By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[4]/input[1]");
	By psearch=By.xpath("//*[@id=\"myTabContent\"]/button");
	By pbookcab=By.xpath("//*[@id=\"popclick\"]");
	public SoloCabPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Titleverification()
	{
		String actualtitles=driver.getTitle();
		System.out.println(actualtitles);
		String expectedtitle="";
		if(actualtitles.equals(expectedtitle))
		{	
			System.out.println("pass");	
		}
		else
		{
			System.out.println("fail");
		}
	}
		public void contentverification()
		{
			String cont=driver.getPageSource();
			
			if(cont.contains("Enquiry"))
			{
				System.out.println("contains");	
			}
			else
			{
				System.out.println(" not contains");		
			}
		}
	public void pickupdest(String pd,String dd) 
	{
		driver.findElement(pickup).click();;
		driver.findElement(pickup).sendKeys(pd);
		driver.findElement(drop).click();
		driver.findElement(drop).sendKeys(dd);	
		driver.findElement(dateclick).click();
		
		
}
	public void date()
	{	
		WebElement date_input=driver.findElement(dateclick);
		date_input.sendKeys("31/10/2023");  

	}
	public void pickuptime()
	{
		WebElement t=driver.findElement(time);
		Select ti=new Select(t);
		ti.selectByValue("08:00 AM");
	}
	public void phonetest()
	{
		driver.findElement(mob).click();
		driver.findElement(mob).sendKeys("8606061772");
	}
	public void searching()
	{
		driver.findElement(search).click();
		driver.findElement(bookcap).click();
		driver.navigate().refresh();
		driver.navigate().back();
	}
	public void roundtrip()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(round).click();
		
	}
	public void rounddest(String d,String p) 
		{
		driver.findElement(rpickup).sendKeys(d);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.findElement(rdrop).sendKeys(p);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		}
	public void plustest()
	{
		driver.findElement(plus).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(next).sendKeys("Mysore, Karnataka, India");
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.findElement(datess).click();
	
	}
	public void rdates()
	{	
		WebElement date_inputs=driver.findElement(datess);
		date_inputs.sendKeys("26/11/2023");  

	}
	public void rpickuptime()
	{
		try {
			driver.findElement(rtime).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement t1=driver.findElement(rtime);
		Select tim=new Select(t1);
		tim.selectByValue("08:00 AM");
		}
		 catch (ElementNotInteractableException e)
	    {
	      System.out.println("Element not interactable: " + e.getMessage());
	     
	     }
	}
	public void rddatee()
	{	
		WebElement dateinput=driver.findElement(redate);
		dateinput.sendKeys("2/11/2023");  

	}
	public void rphonetest()
	{
		driver.findElement(rmob).click();
		driver.findElement(rmob).sendKeys("8606061772");
	}
	public void scrolldown() throws Exception
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("/html/body/footer/div/div/div[2]/div/div[1]/div/h4[1]")).click();
	}
	public void rsearching()
	{
		
		driver.findElement(rsearch).click();
		driver.findElement(rbookcab).click();
		driver.navigate().refresh();
		driver.navigate().back();
		//driver.findElement(back).click();
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();;
	}
	public void pack1()
	{
		try
		{
			
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(pack).click();
		}
		 catch (NoSuchElementException e)
		{
		      System.out.println("Element not found: " + e.getMessage());
		 }
		Select objSelect = new Select(driver.findElement(By.id("cog")));
		objSelect.selectByIndex(1);
		WebElement datepackage=driver.findElement(pdate);
		datepackage.sendKeys("2/11/2023");
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		try {
			driver.findElement(ptime).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement tp=driver.findElement(ptime);
		Select tp1=new Select(tp);
		tp1.selectByValue("08:00 AM");
		}
		 catch (ElementNotInteractableException e)
	    {
	      System.out.println("Element not interactable: " + e.getMessage());
	     
	     }
		driver.findElement(pmob).click();
		driver.findElement(pmob).sendKeys("8606061772");
		
	}
	public void psearching()
	{
		
		driver.findElement(psearch).click();
		driver.findElement(pbookcab).click();
		driver.navigate().refresh();
		driver.navigate().back();
		driver.findElement(back).click();
		driver.navigate().back();
	}
	

}
