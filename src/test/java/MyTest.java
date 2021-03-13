import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class MyTest {
    @Test
    public void ForTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-position=2000,0");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://phptravels.net/home");




        WebElement what = driver.findElementByCssSelector("a[data-name='flights']");
        what.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);




//

////
        WebElement adult = driver.findElementByCssSelector("body.with-waypoint-sticky:nth-child(2) div.body-inner:nth-child(1) div.main-wrapper.scrollspy-action:nth-child(2) div.slick-hero-slider-wrapper.bg-light:nth-child(2) div.hero-form-absolute div.container-fluid div.row.gap-40.gap-lg-60.align-items-center.fe div.col-lg-12.col-xs-12.col-md-12 div.hero-form-inner.text-white div.menu-horizontal-wrapper-02 div.tab-content div.tab-pane.active:nth-child(2) div.tab-inner.menu-horizontal-content:nth-child(2) div.form-search-main-01 div.form-inner div.row.gap-10.mb-5.row-reverse div.row.no-gutters.row-reverse.align-items-end:nth-child(3) div.col-lg-4.col-sm-12.col-xs-12:nth-child(3) div.col-inner div.row.no-gutters div.col-lg-4.col-sm-12.col-xs-12.col-4:nth-child(1) div.form-group.form-spin-group div.form-icon-left:nth-child(3) div.input-group.bootstrap-touchspin.bootstrap-touchspin-injected span.input-group-btn-vertical > button.btn.btn-white.bootstrap-touchspin-up:nth-child(1)");
        adult.click();

        WebElement child = driver.findElementByCssSelector("body.with-waypoint-sticky:nth-child(2) div.body-inner:nth-child(1) div.main-wrapper.scrollspy-action:nth-child(2) div.slick-hero-slider-wrapper.bg-light:nth-child(2) div.hero-form-absolute div.container-fluid div.row.gap-40.gap-lg-60.align-items-center.fe div.col-lg-12.col-xs-12.col-md-12 div.hero-form-inner.text-white div.menu-horizontal-wrapper-02 div.tab-content div.tab-pane.active:nth-child(2) div.tab-inner.menu-horizontal-content:nth-child(2) div.form-search-main-01 div.form-inner div.row.gap-10.mb-5.row-reverse div.row.no-gutters.row-reverse.align-items-end:nth-child(3) div.col-lg-4.col-sm-12.col-xs-12:nth-child(3) div.col-inner div.row.no-gutters div.col-lg-4.col-sm-12.col-xs-12.col-4:nth-child(2) div.form-group.form-spin-group div.form-icon-left:nth-child(3) div.input-group.bootstrap-touchspin.bootstrap-touchspin-injected span.input-group-btn-vertical > button.btn.btn-white.bootstrap-touchspin-up:nth-child(1)");
        child.click();
//

        WebElement search = driver.findElementByCssSelector("div[class='col-lg-1 col-sm-12 col-xs-12'] button[type='submit']");
        search.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//
//
        WebElement book = driver.findElementByXPath("//li[1]//div[1]//div[1]//div[2]//form[1]//div[2]//div[1]//button[1]");
        book.click();

        WebElement confirm = driver.findElementByName("guest");
        confirm.click();

        WebElement home = driver.findElementByCssSelector("a[title='home']");
        home.click();






//        Select state = new Select(driver.findElementById("signup:state"));
//        state.selectByValue("CO");
//        WebElement code = driver.findElementById("signup:zip");
//        code.click();
//        code.sendKeys("00000");
//        WebElement pass = driver.findElementById("signup:password");
//        pass.click();
//        pass.sendKeys("11111");
//
//        WebElement register = driver.findElementById("signup:signup");
////            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        register.click();


    }
}



