package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCSSValue {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mci\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("dest")).sendKeys("test");
		
		System.out.println(driver.findElement(By.xpath("//span[@id='togglebtn']//following-sibling::div")).getCssValue("border-color"));
		
		System.out.println(driver.findElement(By.id("dest")).getAttribute("value"));
	}

}
