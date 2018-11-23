package orangehrmlogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login {
	@Test
	public void loginPage()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin ");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	}
	

}
