package com.ana;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Root\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.manage().window().maximize();

        driver.get("https://facebook.com/");

        driver.findElement(By.id("email")).sendKeys("email");
        Thread.sleep(1000);
        driver.findElement(By.id("pass")).sendKeys("password");
        Thread.sleep(1000);
        driver.findElement(By.id("loginbutton")).click();
        Thread.sleep(1000);

        Thread.sleep(5000);
        driver.quit();

    }
}
