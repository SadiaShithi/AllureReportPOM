package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import base.Base;

public class Landing_Page extends Base {

	static By popUp = By.xpath("/html/body/div[2]/div/div/button");
	static By searchBox = By.xpath("//input[@name='q']");
	static By hitIcon = By.xpath("//button[@type='submit']");
	static By slider = By.xpath("//div[2]/div[@class='_3FdLqY']");
	static By items = By.xpath("//div[@class='_3pLy-c row']/div[1]/div[1]");
	static By itemPrice = By.xpath("//div[@class='_3pLy-c row']/div[2]/div[1]/div[1]/div[1]");

	public void closePopUp() {
		driver.findElement(popUp).click();
	}

	public void searchItem(String s) {
		driver.findElement(searchBox).sendKeys(s);
	}

	public void hitSearch() {
		driver.findElement(hitIcon).click();
	}

	public void slideMe() {
		WebElement slideMe = driver.findElement(slider);

		Actions action = new Actions(driver);
		action.dragAndDropBy(slideMe, -75, 0).perform();
	}

	public void makeList() {
		List<WebElement> elements = driver.findElements(items);

		for (WebElement item : elements) {
			System.out.println(item.getText());
		}
	}

	public void expensiveItem() {
		 
	}

}
