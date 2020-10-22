package Selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeparateWindow {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mci\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://accounts.google.com/login");
		
		driver.manage().window().maximize();
		
		String MainPage = driver.getTitle();
		
		WebElement W = driver.findElement(By.xpath("//a[text()='Privacy']"));
		
		WebElement W1 = driver.findElement(By.xpath("//a[text()='Help']"));
		
		WebElement W2 = driver.findElement(By.xpath("//a[text()='Terms']"));
		
		WebElement W4 = driver.findElement(By.xpath("//a[text()='Help']"));
		
		Actions A = new Actions(driver);
		
		A.moveToElement(W).keyDown(Keys.LEFT_CONTROL).click().build().perform();
		
		A.keyUp(Keys.LEFT_CONTROL);
		
		A.moveToElement(W1).keyDown(Keys.LEFT_CONTROL).click().build().perform();
		
		A.keyUp(Keys.LEFT_CONTROL);
		
		A.moveToElement(W2).keyDown(Keys.LEFT_CONTROL).click().build().perform();
		
		A.keyUp(Keys.LEFT_CONTROL);
		
		A.moveToElement(W4).keyDown(Keys.LEFT_CONTROL).click().build().perform();
		
		A.keyUp(Keys.LEFT_CONTROL);
		
		Set Handles = driver.getWindowHandles();
		
		System.out.println(Handles);
		
		Iterator itr = Handles.iterator();
		
		while(itr.hasNext()) {
			
			String CurrHandle = (String) itr.next();
			driver.switchTo().window(CurrHandle);
			System.out.println(driver.getTitle()+" Handle : "+ CurrHandle);
			Thread.sleep(5000);
			
			String CurrPage = driver.getTitle();
			if(CurrPage.equals("Google Account Help"))
			{
				driver.close();
			}
			
		}
		
		Handles = driver.getWindowHandles();
		System.out.println(Handles.size());
		
		
		
		
	}

}
