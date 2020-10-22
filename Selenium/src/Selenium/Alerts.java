package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts{

public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\mci\\Desktop\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("https://demoqa.com/alerts");

driver.manage().window().maximize();

driver.findElement(By.id("alertButton")).click();

Thread.sleep(3000);

System.out.println(driver.switchTo().alert().getText());

driver.switchTo().alert().accept();

driver.findElement(By.id("confirmButton")).click();

driver.switchTo().alert().dismiss();



}

}
