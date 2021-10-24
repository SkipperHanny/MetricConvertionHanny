package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MetersToFeetPage extends BasePage{
	
	@FindBy(css="#argumentConv")
	WebElement celsiusField;
	

	//Constructor
	public MetersToFeetPage(WebDriver driver) {
		super(driver);
	}
	
	//Methods
	public void fillValue(double metersValue) {
		String meters = String.valueOf(metersValue);
		fillText(celsiusField, meters);
	}
	

	//Validations
	public String validateExpectedMetersToFeet (double metersValue) {
		double result = (metersValue * 3.28084);
		Select dropdown = new Select(driver.findElement(By.cssSelector("#format")));
		dropdown.selectByVisibleText("Decimal");
		
		String doubleAsString = String.valueOf(result);
		int indexOfDecimal = doubleAsString.indexOf(".");
		//Split the string received in the result so it each part will be validate due to to the extra 0 in the decimal
		String expexted = metersValue + "m= " +  doubleAsString.substring(0, indexOfDecimal) + "/" +  doubleAsString.substring(indexOfDecimal) + "/" + "ft";
		return expexted;
	}
}