package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	WebDriver driver;
	@FindBy(css="#answer")
	WebElement resultField;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void fillText(WebElement el, String text) {
		el.clear();
		el.sendKeys(text);
	}

	public void click(WebElement el) {
		el.click();
	}

	public String getText(WebElement el) {
		return el.getText();
	}

	public void sleep(long mills) {
		try {
			Thread.sleep(mills);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void alertOK(String text) {
		driver.switchTo().alert().sendKeys(text);
		driver.switchTo().alert().accept();
	}
	
	public String validateActual() {
		String actual = resultField.getText();
		return actual;
	}
}
