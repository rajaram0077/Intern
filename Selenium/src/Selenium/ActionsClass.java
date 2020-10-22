package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mci\\Desktop\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demoqa.com/buttons");
	
	driver.manage().window().maximize();
	
	Actions A = new Actions(driver);
	
	WebElement W = driver.findElement(By.id("doubleClickBtn"));
	
	WebElement W2 = driver.findElement(By.id("rightClickBtn"));
	
	WebElement W3 = driver.findElement(By.xpath("//button[text()='Click Me']"));
	
	A.moveToElement(W).doubleClick().build().perform();
	
	A.moveToElement(W2).contextClick().build().perform();
	
	A.moveToElement(W3).click().build().perform();
	
	
	
	
	
	
	
	
	}

}
