package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Plans extends BasePage {
    public Plans(WebDriver driver) {
        super(driver);
    }
    public void isNewPlanDisplayed(){
        BasePage.waitVisibility(By.xpath("//button[contains(text(),'New plan')]"));
    }
}


