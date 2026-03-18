package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class withoutpagefactorypage {

    WebDriver driver;


    withoutpagefactorypage(WebDriver d){
        this.driver = d;


    }

    By Username= By.id("user-name");
    By Password= By.id("password");
    By Loginbtn= By.id("login-button");
    By Openmenu= By.xpath("//button[text()='Open Menu']");
    By Logoutbtn= By.id("logout_sidebar_link");

    public void Username(String uname){
        driver.findElement(Username).sendKeys(uname);
    }
    public void Password(String pwd){
        driver.findElement(Password).sendKeys(pwd);
    }

    public void Loginbtn(){
        driver.findElement(Loginbtn).click();
    }

    public void Openmenu(){
        driver.findElement(Openmenu).click();
    }

    public void Logoutbtn(){
        driver.findElement(Logoutbtn).click();
    }
    public void closebrowser(){
        driver.quit();
    }

}
