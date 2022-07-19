package pages;

import java.util.ArrayList;
import java.util.Collections;
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
		List<WebElement> products = driver.findElements(items);
		List<WebElement> productPrices = driver.findElements(itemPrice);

		try {
			if (products.size() == productPrices.size()) {
				System.out.println("Making A List of Products Below...");
			}
		} catch (ArithmeticException e) {
			System.out.println("Please check the xpaths again.");
		}
		System.out.println("\nS/N			Product Names				Product's Price");
		for (int i = 0; i < products.size(); i++) {
			System.out.println(i + 1 + ". " + products.get(i).getText() + "	-	" + productPrices.get(i).getText());
		}
	}

	public void expensiveItem() {
		List<WebElement> productPrices = driver.findElements(itemPrice);
		int f = 0;

		for (WebElement price : productPrices) {
			String s = price.getText();
			char r = s.charAt(0);
			String S = s.replace(r, ' ').trim();
			String num = S.replace(",", "").trim();
			int n = Integer.parseInt(num);

			// System.out.println(n);

			List<Integer> numbers = new ArrayList<Integer>(n);
			Collections.sort(numbers);

			// System.out.println(numbers);

			f = numbers.get(numbers.size()- 1);

		}
		System.out.print("The most expensive product in the list costs $" + f);

		 
	}

}
