package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	//Local variables
	@FindBy(css = ".typeConv.temperature.bluebg")
	WebElement temperatureBtn;
	@FindBy(css = ".typeConv.length.bluebg")
	WebElement lengthBtn;
	@FindBy(css = ".typeConv.weight.bluebg")
	WebElement weightBtn;
//	@FindBy(css = "#queryFrom")
//	WebElement fromField;
//	@FindBy(css = "#queryTo")
//	WebElement toField;
	@FindBy(css = ".argument")
	WebElement field;

	// Constructor
	public HomePage(WebDriver driver) {
		super(driver);
	}

	// Methods
	public void goToTemperature() {
		click(temperatureBtn);
	}

	public void goToLength() {
		click(lengthBtn);
	}

	public void goToWeight() {
		click(weightBtn);
	}

	public void searchValue(String userCelValue) {
		fillText(field, userCelValue);
	}

}
