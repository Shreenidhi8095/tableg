package Sm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Table2 {
	static
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	}
@Test
public void test1() {
		

WebDriver driver= new FirefoxDriver();
  driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_table_intro");
  
  driver.manage().window().maximize();
  driver.switchTo().frame("iframeResult");}
}
