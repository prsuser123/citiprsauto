

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class browsertest {
	
  @Test
  public void f() throws InterruptedException {
	  
//    FirefoxProfile firefoxProfile = new FirefoxProfile();
//    System.setProperty("webdriver.gecko.driver", "D:\\Nitesh\\Workspace\\SeleniumTest\\Drivers\\geckodriver.exe");
//    System.setProperty("webdriver.firefox.bin", "C:\\Users\\10637028\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
//    WebDriver driver = new FirefoxDriver(new FirefoxBinary(new File("C:\\Users\\10637028\\AppData\\Local\\Mozilla Firefox\\firefox.exe")),firefoxProfile);
//    System.setProperty("webdriver.chrome.driver", "D:\\atiwari\\workspace\\chromedriver.exe");
//    WebDriver driver = new ChromeDriver();
//    System.setProperty("webdriver.ie.driver", "D:\\atiwari\\workspace\\IEDriverServer.exe");
//    WebDriver driver = new InternetExplorerDriver();
	  
	  WebDriver driver = new FirefoxDriver();
      driver.get("https://empower.lntinfotech.com/irj/portal?spnego=disabled");
      
      Thread.sleep(2000);
      driver.findElement(By.id("logonuidfield")).sendKeys("10637029");
      
      Thread.sleep(2000);
      driver.findElement(By.id("logonpassfield")).sendKeys("M@nish00");
      
      Thread.sleep(2000);
      driver.findElement(By.className("urBtnStdNew")).click();
      
      Thread.sleep(2000);
      driver.switchTo().frame(driver.findElement(By.id("contentAreaFrame")));
      
      System.out.println(driver.findElement(By.id("contentAreaDiv")).getAttribute("title"));
      
      driver.switchTo().frame(driver.findElement(By.id("isolatedWorkArea")));
      
      driver.findElement(By.linkText("Leave & Attendance")).click();
      
      Thread.sleep(2000);
      driver.quit();
	  
  }
}
