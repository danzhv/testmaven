package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends BasePage {
    String SITE_URL = "http://localhost:8080";
    public Login(WebDriver driver){
        super(driver);
    }
    public void goTo(){
        driver.get(SITE_URL);
    }
    public void waitLoginButtonDisplayed(){
        BasePage.waitVisibility(By.xpath("//button[text()='Login']"));
    }
    public void clickLoginButton() {
        driver.findElement(By.xpath("//button[text()='Login']")).click();
    }
}
