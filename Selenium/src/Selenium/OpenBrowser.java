package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//chromedriver.exe
System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		
WebDriver driver =new ChromeDriver();
driver.get("http://facebook.com"); 











}
}