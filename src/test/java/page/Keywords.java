package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Keywords extends BasePage {
    public Keywords(WebDriver driver) {
        super(driver);
    }
    public void clickKeywordsTab(){
        BasePage.waitVisibility(By.cssSelector("[ng-click=\"setView('functions')\"]"));
        driver.findElement(By.cssSelector("[ng-click=\"setView('functions')\"]")).click();
    }
    public void isNewKeywordButtonDisplayed() {
        BasePage.waitVisibility(By.xpath("//button[contains(text(),'New keyword')]"));
    }
}


