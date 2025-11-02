import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class SelectorCss {
    WebDriver driver =new ChromeDriver();
    @Test
    public void phoneBookTest(){
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://telranedu.web.app/login");
        WebElement btnAbout=driver.findElement(By.cssSelector("a[href='/about']"));
        btnAbout.click();
        pause(2);
        System.out.println(btnAbout.getText());
        WebElement btnLogin=driver.findElement(By.cssSelector("div[id='root']>div>a:last-child"));
        btnLogin.click();
        WebElement inputEmail=driver.findElement(By.cssSelector("input[name='email']"));
        inputEmail.sendKeys("ilya!@braker.ru");
        WebElement inputPassword= driver.findElement(By.cssSelector("*[placeholder='Password']"));
        WebElement btnLogin1= driver.findElement(By.cssSelector("form>button[name='login']"));
        inputPassword.sendKeys("Qwerty123!");
        btnLogin1.click();
    }
    @Test
    public void ilCarro(){
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ilcarro.web.app/search ");
        WebElement btnSearch=driver.findElement(By.cssSelector("a[href='/search']"));
        WebElement btnLetTheCarWork=driver.findElement(By.cssSelector("a[href='/let-car-work']"));
        WebElement btnTermsOfUse=driver.findElement(By.cssSelector("a[href=\"/terms-of-use\"]"));
        WebElement btnSignUp=driver.findElement(By.cssSelector("a[ng-reflect-router-link='registration']"));
        WebElement btnLogin=driver.findElement(By.cssSelector("a[ng-reflect-router-link='login']"));
        btnLogin.click();
        WebElement inputEmail=driver.findElement(By.id("email"));
        WebElement inputPassword=driver.findElement(By.id("password"));
        inputEmail.sendKeys("bilbo_baggins_12345@mail.com");
        inputPassword.sendKeys("Password123!");
    }
    static void pause(int time){
        try {
            Thread.sleep(time*1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
