package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import java.time.Duration;

public class BaseTestCase {
    public static WebDriver driver;

    public BaseTestCase(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5L));
    }

    public void scrollDownPage(String offset){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript(String.format("window.scrollBy(0,%s)", offset));
    }

    @AfterTest
    public void tearDown(){
        //driver.quit();
    }
}
