package fun.test;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    static WebDriver driver = new ChromeDriver();

    @BeforeClass
    public void before() {
        System.setProperty("webdriver.chrome.driver", "/chromedriver");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public void after() {
        driver.quit();
    }

}
