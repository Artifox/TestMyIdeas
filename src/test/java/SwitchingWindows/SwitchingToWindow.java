package SwitchingWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SwitchingToWindow {

    @Test
    public void switchingToAnotherWindow() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();

        String parentWindowHandle = driver.getWindowHandle();
        Set<String> winHandles = driver.getWindowHandles();

        Iterator<String> handlesIterator = winHandles.iterator();
        while (handlesIterator.hasNext()) {
            String childWindowHandle = handlesIterator.next();
            if (!parentWindowHandle.equals(childWindowHandle)){
                driver.switchTo().window(childWindowHandle);
                System.out.println(driver.switchTo().window(childWindowHandle).getTitle());
                driver.close();
            }
        }
        //driver.quit();
    }
}
