package ru.stqa.training.selenium;


/**
 * Created by Ksenia on 22.04.2017.
 */

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class test2 {

    private WebDriver driver;

    @Before
    public void Start() {
        driver = new ChromeDriver();
    }


    @Test
    public void test2() {
        driver.get("http://localhost/litecart/admin/login.php");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }



}

