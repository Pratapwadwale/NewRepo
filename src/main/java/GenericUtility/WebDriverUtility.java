package GenericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	
	/**
	 * This method will maximize the window
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}

	/**
	 * This method will minimize the window
	 * @param driver
	 */
	public void minimizeWindow(WebDriver driver)
	{
		driver.manage().window().minimize();
	}
	
	/**
	 * This method will wait for 20 seconds for all the elements to get loaded
	 * @param driver
	 */
	public void waitForPageLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	/**
	 * This method will wait until a particular element becomes visible
	 * @param driver
	 * @param element
	 */
	public void waitForElementToBeVisible(WebDriver driver, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	/**
	 * This element will wait until a particular element becomes clickable
	 * @param driver
	 * @param element
	 */
	public void waitForElementToBeClickable(WebDriver driver, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	

	   public void handleDropdown(WebElement element,String text)
	  {
	    Select s=new Select(element);
	    s.selectByVisibleText(text);

	  }
	   public void handleDropdown(String value,WebElement element)
	  {
	    Select s=new Select(element);
	    s.selectByValue(value);

	  }
	 public void handleDropdown(WebElement element,int index)
	  {
	    Select s=new Select(element);
	    s.selectByIndex(index);

	  }
	   public void mouseHoverAction(WebDriver driver,WebElement element)
	   {
	     Actions act=new Actions(driver);
	     act.moveToElement(element).perform();
	   }

	  public void doubleClickOnAnywhere(WebDriver driver)
	   {
	     Actions act=new Actions(driver);
	     act.doubleClick().perform();
	   }
	   
	    public void doubleClickOnElement(WebDriver driver,WebElement element)
	   {
	     Actions act=new Actions(driver);
	     act.doubleClick(element).perform();
	   }

	  public void rightClickAnywhere(WebDriver driver)
	   {
	     Actions act=new Actions(driver);
	     act.contextClick().perform();
	   }
	   
	    public void rightClickOnElement(WebDriver driver,WebElement element)
	   {
	     Actions act=new Actions(driver);
	     act.contextClick(element).perform();
	   }
	   
	   
	   public void dragAndDropAction(WebDriver driver,WebElement targetElement,WebElement dstElement)
	   {
	      Actions act=new Actions(driver);
	      act.dragAndDrop(targetElement,dstElement).perform();
	   }
	   
	   public void switchToFrame(WebDriver driver,int index)
	   {
	     driver.switchTo().frame(index);

	   }


	   public void switchToFrame(WebDriver driver,String frameId)
	   {
	     driver.switchTo().frame(frameId);

	   }
	   
	   public void switchToFrame(WebDriver driver,WebElement element)
	   {
	     driver.switchTo().frame(element);

	   }

	   public void switchToParentFrame(WebDriver driver)
	   {
	      driver.switchTo().parentFrame();
	      
	   }
	   
	   public void switchToDefaultContent(WebDriver driver)
	   {
	      driver.switchTo().defaultContent();
	   }

	   public void AcceptAlert(WebDriver driver)
	   {
	     driver.switchTo().alert().accept();

	   }
	   
	   public void dismiseAlert(WebDriver driver)
	   {
	     driver.switchTo().alert().dismiss();
	   }
	   
	   public String getAlertText(WebDriver driver)
	   {
	     return driver.switchTo().alert().getText();
	   }

	   public void switchToWindow(WebDriver driver,String partialWinTitle)
	   {
	     Set<String> winIds= driver.getWindowHandles();
	     for(String winId:winIds)
	     {
	        String currenttitle=driver.switchTo().window(winId).getTitle();
	        if(currenttitle.contains(partialWinTitle))
	          {
	             break;
	          }
	     }
	   }


	   public String takeScreenShot(WebDriver driver,String filename) throws IOException
	   {

	     TakesScreenshot ts= (TakesScreenshot)driver;
	    File src= ts.getScreenshotAs(OutputType.FILE);
	    File dst=new File(".\\ScreenShots\\"+filename+".png");
	    FileUtils.copyFile(src,dst);
	   return dst.getAbsolutePath();
	     
	   }
	   /**
	    * This Method will Scroll 
	    * @param driver
	    */

	   public void scrollActions(WebDriver driver)
	   {
	     JavascriptExecutor js=(JavascriptExecutor)driver;
	     js.executeScript("window.scrollBy(0,500)","");
	   }
	   /**
	    * this Method will Scroll till the element
	    * @param driver
	    * @param element
	    */
	   
	   public void scrollActions(WebDriver driver,WebElement element)
	   {
	      JavascriptExecutor js=(JavascriptExecutor)driver;
	      int y=element.getLocation().getY();
	       js.executeScript("window.scrollBy(0,"+y+")",element);
	   }
	   
	  






}
