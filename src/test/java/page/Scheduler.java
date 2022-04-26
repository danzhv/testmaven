package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Scheduler extends BasePage {
    public Scheduler(WebDriver driver) {
        super(driver);
    }
    public void clickSchedulerTab(){
        BasePage.waitVisibility(By.cssSelector("[ng-click=\"setView('scheduler')\"]"));
        driver.findElement(By.cssSelector("[ng-click=\"setView('scheduler')\"]")).click();
    }
    public void isNewTaskButtonDisplayed() {
        BasePage.waitVisibility(By.cssSelector("button[class='btn btn-success']"));
    }
}


