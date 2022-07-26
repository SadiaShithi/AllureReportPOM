package base;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
	
//	@Before
//	public void setup() {
//
//		try {
//			ChromeOptions option = new ChromeOptions();
//			option.setHeadless(false);
//			WebDriverManager.chromedriver().setup();
//
//			driver = new ChromeDriver(option);
//			driver.manage().window().maximize();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("Driver error occured.");
//			System.exit(0);
//		}
//	}

	public static WebDriverWait wait = new WebDriverWait(driver, 100);

	public static void getURL(String s) {
		driver.get(s);
	}

	public static void click(By by) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		driver.findElement(by).click();
	}

	public static void sendKeys(By by, String s) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		driver.findElement(by).sendKeys(s);
	}

	public static String getText(By by) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		return driver.findElement(by).getText();
	}

	public static boolean isDisplayed(By by) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		return driver.findElement(by).isDisplayed();
	}

	public static boolean isEnabled(By by) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		return driver.findElement(by).isEnabled();
	}

}
