package base;

import com.fasterxml.jackson.databind.cfg.BaseSettings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class BaseStep {

    WebDriver driver;

    public BaseStep(WebDriver driver){
        this.driver = driver;
    }

    public void inputField(String input, WebElement field){
        field.sendKeys(input);
    }

    public void chooseVAT(String vatCode){
        driver.findElement(By.id(vatCode)).click();
    }

    public void checkFieldValue(String value, WebElement field){
        Assert.assertEquals(value, field.getText());
    }
}
