package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class withpagefactorypage {
    WebDriver driver;


    //1.Create constructor
     withpagefactorypage(WebDriver d) {
        this.driver = d;
        PageFactory.initElements(driver,this);
    }

    //2.Webelements
    @FindBy(id="user-name")
    WebElement txtusername;

    @FindBy(id="password")
    WebElement txtpassword;

    @FindBy(id="login-button")
    WebElement loginbtn;

    @FindBy(xpath = "//button[text()='Open Menu']")
    WebElement openmenu;

    @FindBy(id="logout_sidebar_link")
    WebElement logoutbtn;

    //Page action Mthod

    public void Username(String uname){
        txtusername.sendKeys(uname);
    }
    public void Password(String pwd){
        txtpassword.sendKeys(pwd);
    }

    public void Loginbtn(){
        loginbtn.click();
    }

    public void Openmenu(){
        openmenu.click();
    }

    public void Logoutbtn(){
        logoutbtn.click();
    }
    public void closebrowser(){
        driver.quit();
    }


    public void clickLogin() {
        loginbtn.click();
    }

    public void clicklogout() {
        logoutbtn.click();
    }
}