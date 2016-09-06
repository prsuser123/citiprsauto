import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.base.Verify;
import com.thoughtworks.selenium.webdriven.commands.Check;


public class test1 {
	
	@Test
	public void test1() throws InterruptedException
	{
		String srchcntorgnl = "Jobs 1 to 10 of 14";
		
			// Initiate webdriver & firefox driver
			WebDriver drive = new FirefoxDriver();
		  
			// Launch any URL
			Thread.sleep(2000);
			drive.get("http://www.indeed.co.in/?r=us");  
		  
			// Locate web element by id and type text in to the text box.
			Thread.sleep(2000);
			drive.findElement(By.id("what")).sendKeys("lnt");
		  
			// Locate web eloement by id for where field and clear text.
			Thread.sleep(2000);
			drive.findElement(By.id("where")).clear();
			
			// Locate web eloement by id for where field and enter text.
			Thread.sleep(2000);
			drive.findElement(By.id("where")).sendKeys("india");
			
			// Click on find jobs button.
			Thread.sleep(2000);
			drive.findElement(By.id("fj")).click();
			
			// Get search count result.
			Thread.sleep(2000);
			String searchcount = drive.findElement(By.id("searchCount")).getText();
			
			// Validation point by using Assert.
			Thread.sleep(2000);
			Assert.assertEquals(srchcntorgnl, searchcount);
						
			System.out.println(searchcount);
		  	  
			drive.close();
		  
	}

}
