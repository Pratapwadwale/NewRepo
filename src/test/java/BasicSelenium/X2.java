package BasicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class X2 {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https:/www.facebook.com");
		WebElement element = driver.findElement(By.tagName("input"));
		//WebElement element = driver.findElement(By.id("email"));
		System.out.println(element);
		element.sendKeys("Mayure");
		
		
	}

}
