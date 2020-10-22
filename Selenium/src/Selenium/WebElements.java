package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mci\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.manage().window().maximize();
		
		boolean selected = driver.findElement(By.id("hobbies-checkbox-1")).isSelected();
		
		System.out.println("On page launch selected = "+selected);
		
		driver.findElement(By.id("hobbies-checkbox-1")).click();
		
        selected = driver.findElement(By.id("hobbies-checkbox-1")).isSelected();
		
		System.out.println("After click action selected = "+selected);
		
		driver.switchTo().alert().getText();
		
	 

	}

}
