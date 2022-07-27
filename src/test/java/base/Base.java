package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Base {
	protected static WebDriver driver;
	
	
	public static void click(By by) {
		driver.findElement( by ).click();
	}
	
	public static void sendKeys(By by, String value) {
		driver.findElement( by ).sendKeys( value );
	}
	
	public static boolean isDisplayed(By by){
		//WebElement element = browser.findElement( by );
		return driver.findElement( by ).isDisplayed();
	}
	
	public static boolean isEnabled(By by){
		//WebElement element = browser.findElement( by );
		return driver.findElement( by ).isEnabled();
	}
	
	public static String getText(By by){
		return driver.findElement(by).getText();
	}

	public static void navigateURL(String url) {
		driver.get( url );
	}
	
	
	

	
}
