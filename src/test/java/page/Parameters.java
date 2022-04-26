package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Parameters extends BasePage {
    public Parameters(WebDriver driver) {
        super(driver);
    }
    public void clickParametersTab(){
        BasePage.waitVisibility(By.cssSelector("[ng-click=\"setView('parameters')\"]"));
        driver.findElement(By.cssSelector("[ng-click=\"setView('parameters')\"]")).click();
    }
    public void isNewParameterButtonDisplayed() {
        BasePage.waitVisibility(By.cssSelector("button[class='btn btn-success']"));
    }
}


