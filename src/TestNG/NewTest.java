package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  
	  
	  WebDriver drive = new FirefoxDriver();
	  
	  drive.get("http://google.com");  
	  
	  System.out.println(drive.getTitle());
	  
	  
  }
}
