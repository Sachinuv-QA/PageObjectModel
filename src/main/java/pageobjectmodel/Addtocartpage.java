package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Addtocartpage {
    WebDriver driver;
    public Addtocartpage(WebDriver d){
        this.driver= d;

    }
    By addtocartBtn =By.xpath("//button[text()='Add to cart']");
    By removeBtn=By.xpath("//button[text()='Remove']");

    // Actions
    public void addItemToCart() {
        driver.findElement(addtocartBtn).click();
    }

    public void removeItemFromCart() {
        driver.findElement(removeBtn).click();
    }

    public void clickoncheckoutbtn(){
        driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]")).click();
    }
    public void clickoncheckoutbtn1(){
        driver.findElement(By.xpath("//button[@id=\"checkout\"]")).click();
    }
    public void sendinformation(){
        driver.findElement(By.id("first-name")).sendKeys("Sachin");
        driver.findElement(By.id("last-name")).sendKeys("Kore");
        driver.findElement(By.id("postal-code")).sendKeys("411028");
    }

    public void clickoncontinuebtn(){
        driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
    }

    public void clickonfinishbtn(){
        driver.findElement(By.xpath("//button[@id=\"finish\"]")).click();
    }

}