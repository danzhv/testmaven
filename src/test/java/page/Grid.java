package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Grid extends BasePage {
    public Grid(WebDriver driver) {
        super(driver);
    }
    public void clickGridTab(){
        BasePage.waitVisibility(By.cssSelector("[ng-click=\"setView('grid')\"]"));
        driver.findElement(By.cssSelector("[ng-click=\"setView('grid')\"]")).click();
    }
    public void isAgentsTabDisplayed() {
        BasePage.waitVisibility(By.xpath("//a[contains(text(),'Agents')]"));
    }
}


