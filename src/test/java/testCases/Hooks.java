package testCases;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import base.Base;
import cucumber.api.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends Base {

	@Before
	public void setup() {
		
		ChromeOptions option = new ChromeOptions();
		option.setHeadless(false);
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
	}

	@After
	public void tearDown(Scenario scenario) {
		try {
			driver.quit();
//			String screenshotName = scenario.getName().replace("", "");
//			if (scenario.isFailed()) {
//				scenario.log("The step has been failed.");
//
//				TakesScreenshot ts = (TakesScreenshot) driver;
//				byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
//				scenario.attach(screenshot, "img/png", screenshotName);
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}
}
