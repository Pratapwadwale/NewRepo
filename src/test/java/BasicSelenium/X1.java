package BasicSelenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class X1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https:/www.google.com");
		Thread.sleep(5000);

		driver.get("https:/www.facebook.com");
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(6000);
		driver.navigate().refresh();
//		String title = driver.getTitle();
//		System.out.println(title);
//		if(title.contains("Google"))
//		{
//			System.out.println("Title:"+title);
//		}
		
		
	}

}
