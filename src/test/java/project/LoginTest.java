package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
  @Test
  public void LoginTest() {
	  System.out.println("login test");
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Project purpose\\\\Reskilling in Test Automation -Selenium training\\\\chromedriver_win32\\\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://www.google.com");
	  System.out.println("Current title is "+driver.getTitle());
  }
}
