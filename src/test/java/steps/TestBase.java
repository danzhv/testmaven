package steps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import page.*;

public class TestBase {
    private static WebDriver driver;
    public BasePage BasePage;
    public Login Login;
    public Plans Plans;
    public Keywords Keywords;
    public Executions Executions;
    public Parameters Parameters;
    public Scheduler Scheduler;
    public Grid Grid;
    public Admin Admin;

    @BeforeEach
    public void start(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Login = PageFactory.initElements(driver, Login.class);
        BasePage = PageFactory.initElements(driver, BasePage.class);
        Plans = PageFactory.initElements(driver, Plans.class);
        Keywords = PageFactory.initElements(driver, Keywords.class);
        Executions = PageFactory.initElements(driver, Executions.class);
        Parameters = PageFactory.initElements(driver, Parameters.class);
        Scheduler = PageFactory.initElements(driver, Scheduler.class);
        Grid = PageFactory.initElements(driver, Grid.class);
        Admin = PageFactory.initElements(driver, Admin.class);
        Login.goTo();
        Login.waitLoginButtonDisplayed();
        Login.clickLoginButton();
    }

    @AfterEach
    public void finish(){
        driver.quit();
    }



}
