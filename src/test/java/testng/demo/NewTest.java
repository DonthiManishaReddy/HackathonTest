package testng.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


@Test
public class NewTest {
	
	ChromeDriver driver;
	
	

  public void open()
  {
	  //System.setProperty("web driver.chrome.driver",".//Resources//chromedriver.exe");
      driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
  }
	
	public void xogin()
	  {
//		  driver.findElement(By.name("username")).sendKeys("Admin");
		  driver.findElement(By.xpath("//input[@class=oxd-input oxd-input--active]")).sendKeys("Admin");
		
	  }
	
	public void close()
	  {
		  driver.close();
		
	  }
	
  
}
