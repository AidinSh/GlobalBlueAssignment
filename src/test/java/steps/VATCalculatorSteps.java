package steps;

import base.BaseStep;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.VATCalculatorPage;

public class VATCalculatorSteps extends BaseStep {

    WebDriver driver;
    VATCalculatorPage page;

    public VATCalculatorSteps(WebDriver driver){
        super(driver);
        page = PageFactory.initElements(driver, VATCalculatorPage.class);
        this.driver = driver;
    }

    public void chooseCountry(String country){
        Select countryBox = new Select(page.countryChooser);
        countryBox.selectByValue(country);
    }

    public void inputNetPrice(String input){
        inputField(input, page.netPriceField);
    }
    public void inputVAT(String input){
        inputField(input, page.VATField);
    }
    public void inputGrossPrice(String input){
        inputField(input, page.grossPriceField);
    }

    public void checkNetPriceValue(String value){
        checkFieldValue(value, page.netPriceField);
    }
    public void checkVATValue(String value){
        checkFieldValue(value, page.VATField);
    }
    public void checkGrossPriceValue(String value){
        checkFieldValue(value, page.grossPriceField);
    }

    public void clickOnReset(){
        page.resetButton.click();
    }
}
