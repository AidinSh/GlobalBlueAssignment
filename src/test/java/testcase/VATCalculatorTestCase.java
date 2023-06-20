package testcase;

import base.BaseTestCase;
import data.VATCalculatorData;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import steps.VATCalculatorSteps;

public class VATCalculatorTestCase extends BaseTestCase {

    VATCalculatorSteps steps;

    public VATCalculatorTestCase(){
        steps = new VATCalculatorSteps(driver);
    }

    @BeforeTest
    public void openCalculatorPage(){
        driver.get("https://www.calkoo.com/en/vat-calculator");
        driver.manage().window().maximize();
        scrollDownPage("400");
    }

    /**
     * This Test Takes the net price and calculates the vat and gross price.
     * @param country
     * @param vatCode
     * @param netPrice
     * @param vatValue
     * @param grossPrice
     */
    @Test(
            dataProvider = "inputNetPrice",
            dataProviderClass = VATCalculatorData.class
    )
    public void inputNetAndCheckGrossAndVAT(String country, String vatCode, String netPrice, String vatValue, String grossPrice){
        steps.chooseCountry(country);
        scrollDownPage("220");
        steps.chooseVAT(vatCode);
        steps.inputNetPrice(netPrice);
        steps.checkVATValue(vatValue);
        steps.checkGrossPriceValue(grossPrice);
    }

    /**
     * This test will calculate all 3 fields with different input types to make sure calculations are correct.
     * @param country
     * @param netPrice
     * @param VATValue
     * @param grossPrice
     */
    @Test(
            dataProvider = "differentInputSameResult",
            dataProviderClass = VATCalculatorData.class
    )
    public void getSameResultWithDifferentInput(String country, String netPrice, String VATValue, String grossPrice){
        steps.chooseCountry(country);
        scrollDownPage("220");
        steps.inputNetPrice(netPrice);
        steps.checkVATValue(VATValue);
        steps.checkGrossPriceValue(grossPrice);
        steps.clickOnReset();
        scrollDownPage("220");
        steps.inputVAT(VATValue);
        steps.checkNetPriceValue(netPrice);
        steps.checkGrossPriceValue(grossPrice);
        steps.clickOnReset();
        scrollDownPage("220");
        steps.inputGrossPrice(grossPrice);
        steps.checkNetPriceValue(netPrice);
        steps.checkVATValue(VATValue);
    }
}
