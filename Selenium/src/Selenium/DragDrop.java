package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class DragDrop {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mci\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		WebElement W = driver.findElement(By.tagName("iframe"));
		
		driver.switchTo().frame(W);
		
		Actions A = new Actions(driver);
		
		WebElement Drag = driver.findElement(By.id("draggable"));
		
		WebElement Drop = driver.findElement(By.id("droppable"));
		
		A.dragAndDrop(Drag, Drop).build().perform();
		
		
		//Fluent wait
		
			/*	Wait wait = new FluentWait(driver)
						.withTimeout(30,TimeUnit.SECONDS)
						.pollingEvery(5,TimeUnit.SECONDS)
						.ignoring(NoSuchElementException.class);
*/
				

	}

}
