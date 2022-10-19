package WorkingWithWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GettingTooltipText {

    @Test
    public void gettingTextFromTooltip() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://jqueryui.com/tooltip/");
        String expectedTooltip = "We ask for your age only for statistical purposes.";
        /*int numberOfIFrames = driver.findElements(By.tagName("iframe")).size();
        for (int i = 0; i < numberOfIFrames; i++) {
            driver.switchTo().frame(i);
            int total = driver.findElements(By.id("age")).size();
            System.out.println(total);
            driver.switchTo().defaultContent();
        }*/
        driver.switchTo().frame(0);
        WebElement ageField = driver.findElement(By.id("age"));
        String actualTooltip = ageField.getAttribute("title");
        Assert.assertEquals(actualTooltip, expectedTooltip);
        driver.quit();
    }
}
