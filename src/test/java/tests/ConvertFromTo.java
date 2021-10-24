package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.CelsiusToFahrenheitPage;
import pageobjects.HomePage;
import pageobjects.LengthPage;
import pageobjects.MetersToFeetPage;
import pageobjects.OuncesToGramsPage;
import pageobjects.TemperaturePage;
import pageobjects.WeightPage;


//All convention tested in decimal
public class ConvertFromTo extends BaseTest {

	// Test for converting Celsius to Fahrenheit temperature
	@Test
	public void tc_01_Convert_Value_From_Celsius_To_Fahrenhite() {
		HomePage homePage = new HomePage(driver);
		homePage.goToTemperature();
		TemperaturePage tempPage = new TemperaturePage(driver);
		tempPage.goToCelsiusAndFahrenheit();
		CelsiusToFahrenheitPage celtoFahrPage = new CelsiusToFahrenheitPage(driver);
		// Value can be changed by the tester (e.gread from file with different values)
		double celsiusValue = 10;
		celtoFahrPage.fillValue(celsiusValue);

		// Validate
		String expected = celtoFahrPage.validAnswear(celsiusValue);
		Assert.assertEquals(celtoFahrPage.validateActual(), expected,
				"Convertion of Celsius to Fahrenhite is wrong, check formula parameters");
	}

	// Test for converting meters to feet
	@Test
	public void tc_02_Convert_Value_From_Meters_To_Feet() {
		HomePage homePage = new HomePage(driver);
		homePage.goToLength();
		LengthPage lengthPage = new LengthPage(driver);
		lengthPage.goToMetersToFeet();
		MetersToFeetPage metersToFeet = new MetersToFeetPage(driver);
		double metersValue = 10;
		metersToFeet.fillValue(metersValue);

		// Validate
		boolean equals = false;
		String expected = metersToFeet.validateExpectedMetersToFeet(metersValue);
		String actual = metersToFeet.validateActual();
		String[] arrOfStr = expected.split("/");
		for (String a : arrOfStr) {
			equals = actual.contains(a);
			if (!equals) {
				break;
			}
		}

		if (!equals) {
			Assert.assertEquals(metersToFeet.validateActual(), expected, "Convertion of Meters to Feet is wrong");
		}

//		Comparing the string return from the web and the String expected is not do-able since the web add 0 in the fifth decimal place in the result as default (Strings will never be equal)
//		e.g 32.8084 != 32.80840
//		String actual = metersToFeet.validateActual();
//		Assert.assertEquals(actual, expected, "Convertion of Meters to Feet is wrong");

	}

	// Test for converting ounces to gram
	@Test
	public void tc_03_Convert_Value_From_Ounces_To_Gram() {
		HomePage homePage = new HomePage(driver);
		homePage.goToWeight();
		WeightPage weightPage = new WeightPage(driver);
		weightPage.goToOuncesToGrams();
		OuncesToGramsPage ouncesToGrams = new OuncesToGramsPage(driver);
		double ouncesValue = 20;
		ouncesToGrams.fillValue(ouncesValue);

		// Validate
		String expected = ouncesToGrams.validateExpectedOncesToGrams(ouncesValue);
		Assert.assertEquals(ouncesToGrams.validateActual(), expected, "Convertion of Onces to Grams is wrong");
	}

}