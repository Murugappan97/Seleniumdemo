package Ecomercetest.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.AssertJUnit.assertEquals;

public class Seleniuminterview {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
        driver.findElement(By.cssSelector("//input[contains(@type,'pass')]")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("input[value*=rmbr]")).click();
        driver.findElement(By.cssSelector("#chkboxTwo")).click();
        driver.findElement(By.cssSelector(".submit.signInBtn")).click();
        String loginmsg = driver.findElement(By.tagName("p")).getText();
        assert.assertEquals(loginmsg,"You are successfully logged in.");

    }


}
