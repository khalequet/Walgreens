package pageObject;

import base.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class register_page extends Config {

    public register_page(WebDriver driver){
        PageFactory.initElements(driver, this);
        Config.driver = driver;
    }


    // Locators

    @FindBy(how= How.XPATH, using = "//span[@class='inner-focus hide-on-mobile truncate']")
    public WebElement accountLocator;

    @FindBy (how = How.ID,using = "pf-dropdown-register")
    public WebElement registerLocator;

    @FindBy (how = How.XPATH,using = "//input[@name='firstName']")
    public WebElement firstNameLocator;





    // List of test functions

    public void verifyHomePageTitle(){
        String act = driver.getTitle();
        String exp = "Walgreens: Pharmacy, Health & Wellness, Photo & More for You";
        Assert.assertEquals(exp, act);
        System.out.println("I am in walgreens home page ");
    }


    public void clickAccount (){
        accountLocator.click();
    }
    public void clickRegister (){
        registerLocator.click();
    }
    public void enterfirstName (String firstname){
        firstNameLocator.sendKeys("Jenny");
    }
























}
