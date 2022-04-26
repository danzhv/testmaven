package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Executions extends BasePage {
    public Executions(WebDriver driver) {
        super(driver);
    }
    public void clickExecutionsTab(){
        BasePage.waitVisibility(By.xpath("//a[contains(text(),'Executions')]"));
        driver.findElement(By.xpath("//a[contains(text(),'Executions')]")).click();
    }
    public void isExecutionListDisplayed() {
        BasePage.waitVisibility(By.xpath("//a[contains(text(),'Execution list')]"));
    }
}


