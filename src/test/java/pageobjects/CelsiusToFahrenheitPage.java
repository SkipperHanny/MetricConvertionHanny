package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CelsiusToFahrenheitPage extends BasePage{
	
	@FindBy(css="#argumentConv")
	WebElement celsiusField;
	
	//Constructor
	public CelsiusToFahrenheitPage(WebDriver driver) {
		super(driver);
	}
	
	//Methods
	public void fillValue(double celsiusValue) {
		String celvalu = String.valueOf(celsiusValue);
		fillText(celsiusField, celvalu);
	}
	
	//Validations
	public String validAnswear (double userValue) {
		double result = ((userValue * 9/5) + 32);
		String ex = userValue + "°C= " + String.format("%.5f", result) + "°F";
		return ex;
	}
}
