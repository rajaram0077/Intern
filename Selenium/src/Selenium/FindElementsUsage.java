package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsUsage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mci\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.freecrm.com/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());

	}

}
