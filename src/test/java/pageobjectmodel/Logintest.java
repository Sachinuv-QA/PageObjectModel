package pageobjectmodel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.chrome.ChromeOptions;

public class Logintest {

    @Test(priority = 1)
    public void testWithPageFactory() {




// setup driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

// disable password popups
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("profile.password_manager_leak_detection", false);
        options.setExperimentalOption("prefs", prefs);

// create driver
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/v1/index.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



        withpagefactorypage pf = new withpagefactorypage(driver);

        pf.Username("standard_user");
        pf.Password("secret_sauce");
        pf.clickLogin();
        System.out.println("Login successfully");

        Addtocartpage cart  = new Addtocartpage(driver);
        cart.addItemToCart();
        System.out.println("Item added to cart");

        cart.removeItemFromCart();
        System.out.println("Item removed from cart");

        cart.clickoncheckoutbtn();
        System.out.println("Checkout button clicked");

        cart.clickoncheckoutbtn1();
        cart.sendinformation();
        System.out.println("Information entered");

        cart.clickoncontinuebtn();
        System.out.println("Continue button clicked");

        cart.clickonfinishbtn();
        System.out.println("Thank you for ordering");

        pf.Openmenu();
        System.out.println("Open menu");

        pf.clicklogout();
        System.out.println("Logout successfully");

        pf.closebrowser();
    }

    @Test(priority = 2)
    public void testWithoutPageFactory() {

        // setup driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

// disable password popups
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("profile.password_manager_leak_detection", false);
        options.setExperimentalOption("prefs", prefs);

// create driver
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/v1/index.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        withoutpagefactorypage wpf = new withoutpagefactorypage(driver);

        wpf.Username("standard_user");
        wpf.Password("secret_sauce");
        wpf.Loginbtn();
        System.out.println("Login successfully");

        Addtocartpage cart = new Addtocartpage(driver);
        cart.addItemToCart();
        System.out.println("Item added to cart");

        cart.removeItemFromCart();
        System.out.println("Item removed from cart");

        cart.clickoncheckoutbtn();
        System.out.println("Checkout button clicked");

        cart.clickoncheckoutbtn1();
        cart.sendinformation();
        System.out.println("Information entered");

        cart.clickoncontinuebtn();
        System.out.println("Continue button clicked");

        cart.clickonfinishbtn();
        System.out.println("Thank you for ordering");

        wpf.Openmenu();
        System.out.println("Open menu");
        wpf.Logoutbtn();
        System.out.println("Logout successfully");

        wpf.closebrowser();
    }
}