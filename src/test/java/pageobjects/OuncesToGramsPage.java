package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OuncesToGramsPage extends BasePage {

	@FindBy(css = "#argumentConv")
	WebElement ouncesField;

	// Constructor
	public OuncesToGramsPage(WebDriver driver) {
		super(driver);
	}

	// Methods
	public void fillValue(double ouncesValue) {
		String ounces = String.valueOf(ouncesValue);
		fillText(ouncesField, ounces);
	}

	// Validations
	public String validateExpectedOncesToGrams(double ouncesValue) {
		double grams = (ouncesValue / 28.349523);
		System.out.println(grams);
		System.out.println(ouncesValue);

		String expected = ouncesValue + "oz= " + String.format("%.4f", grams) + "g";
		return expected;
	}
}
