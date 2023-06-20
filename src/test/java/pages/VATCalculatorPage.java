package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VATCalculatorPage {

    @FindBy(tagName = "select")
    public WebElement countryChooser;

    @FindBy(xpath = "//input[@id='NetPrice']")
    public WebElement netPriceField;

    @FindBy(id = "VATsum")
    public WebElement VATField;

    @FindBy(id = "Price")
    public WebElement grossPriceField;

    @FindBy(xpath = "//*[@text='Reset']")
    public WebElement resetButton;
}
