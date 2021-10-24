package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LengthPage extends BasePage{

	@FindBy(css="#popLinks > ol > li:nth-child(1) > a")
	WebElement MetersAndFeetBtn;
	
	//Constructor
	public LengthPage(WebDriver driver) {
		super(driver);
	}
	
	//Methods
	public void goToMetersToFeet() {
		click(MetersAndFeetBtn);
	}
}
