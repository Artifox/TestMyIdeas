package WorkingWithWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GettingText {

    @Test
    public void gettingTextFromElement() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        String text = driver.findElement(By.xpath("//a[text()='Click Here']")).getText();
        System.out.println(text);
    }
}
