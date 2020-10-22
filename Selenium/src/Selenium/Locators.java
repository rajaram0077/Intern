package Selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
public static void main(String[] args) {
		

		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\mci\\Desktop\\chromedriver.exe");
		
WebDriver driver =new ChromeDriver();
driver.get("http://facebook.com"); 
driver.findElement(By.className("inputtext")).sendKeys("MatrixCare");
driver.findElement(By.id("email")).sendKeys("@gmail.com");
driver.findElement(By.name("pass")).sendKeys("5555");
driver.findElement(By.linkText("Forgotten password?")).click();

driver.findElement(By.cssSelector("#email")).sendKeys("abc@gmail.com");
driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("password");
driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();

//tag[@attribute='value']
//*[@attribute='value']

//*[@id="firstName"]

//input[@id='userNumber']

//*[@id="userNumber"]
/*#userNumber

[attribute = 'value']

#id
.classname


id
name
linktext
partiallink text
classname
css
xpath
tagname

try {
	
	
}
Catch{
	
	
}

finally {
	
}*/







}
}