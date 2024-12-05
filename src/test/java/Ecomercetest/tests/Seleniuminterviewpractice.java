package Ecomercetest.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

/*
public static String getpassword(WebDriver driver) throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    WebDriver driver1 = new ChromeDriver();
    driver.get("https://rahulshettyacademy.com/locatorspractice/");
    driver.findElement(By.linkText("Forgot your password?")).click();
    Thread.sleep(2000);
    String passwordtext = driver.findElement(By.cssSelector(".infoMsg")).getText();
    String[] passwordarray = passwordtext.split("'");
    String password = passwordarray[1].split("'")[0];
    return password;
} */

public class Seleniuminterviewpractice {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("input[value*=rmbr]")).click();
        driver.findElement(By.cssSelector("#chkboxTwo")).click();
        driver.findElement(By.cssSelector(".submit.signInBtn")).click();
        Thread.sleep(2000);
        String loginmsg = driver.findElement(By.tagName("p")).getText();
        Assert.assertEquals(loginmsg,"You are successfully logged in.");
        driver.findElement(By.xpath("//button[text()='Log Out']")).click();
    }
}
