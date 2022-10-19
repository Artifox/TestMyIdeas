package WorkingWithWebElements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GettingAttribute {

    @Test
    public void gettingAttributeFromElement() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com/Artifox/SalesForceDemo/blob/master/src/test/resources/locators.txt");
        String text = driver.findElement(By.xpath("//span[text()='Projects']")).getAttribute("data-content");
        System.out.println(text);
        Assert.assertEquals(text, "Projects");
        driver.quit();
    }
}
