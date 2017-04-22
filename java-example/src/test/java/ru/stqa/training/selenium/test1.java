package ru.stqa.training.selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class test1 {

     private WebDriver driver;

    @Before
    public void Start() {
        driver = new ChromeDriver();
    }


    @Test
    public void test1() {
        driver.get("http://www.google.com");
        driver.quit();
    }



}
