package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TemperaturePage extends BasePage{
	
	@FindBy(css="#popLinks > ol > li:nth-child(1) > a")
	WebElement CelAndFahrBtn;

	//Constructor
	public TemperaturePage(WebDriver driver) {
		super(driver);
	}
	
	//Methods
	public void goToCelsiusAndFahrenheit () {
		click(CelAndFahrBtn);
	}
}
