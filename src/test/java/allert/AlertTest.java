package allert;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class AlertTest {

    @Test
    public void alertTest(){
        Selenide.open("https://www.bodum.com/gb/en/bodum-coffee-subscription");
        $(".header .button").click();
        $(By.partialLinkText("442033187478")).click();
        //WebDriverWait wait = new WebDriverWait(WebDriverRunner.getWebDriver(), Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.alertIsPresent()).accept();
        //Selenide.confirm();
        Selenide.sleep(6000);

        /*Selenide.open("https://the-internet.herokuapp.com/javascript_alerts");
        $("button[onclick='jsConfirm()']").click();
        //Selenide.confirm();
        WebDriverRunner.getWebDriver().switchTo().alert().accept();
        Selenide.sleep(6000);
        */
    }
}
