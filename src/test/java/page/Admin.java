package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Admin extends BasePage {
    public Admin(WebDriver driver) {
        super(driver);
    }
    public void clickAdminTab(){
        BasePage.waitVisibility(By.cssSelector("[ng-click=\"setView('admin')\"]"));
        driver.findElement(By.cssSelector("[ng-click=\"setView('admin')\"]")).click();
    }
    public void isAddUserButtonDisplayed() {
        BasePage.waitVisibility(By.cssSelector("button[class=\"btn btn-success\"]"));
    }
}


