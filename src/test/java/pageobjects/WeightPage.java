package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WeightPage extends BasePage{
	
	@FindBy(css="#popLinks > ol > li:nth-child(5) > a")
	WebElement ouncesToGramsBtn;

	//Constructor
	public WeightPage(WebDriver driver) {
		super(driver);
	}
	
	//Methods
		public void goToOuncesToGrams() {
			click(ouncesToGramsBtn);
		}

}
