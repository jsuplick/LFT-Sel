package com.orasi;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.hp.leanft.selenium.By;
import com.hp.leanft.selenium.ByEach;

import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import java.net.URI;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.pagefactory.ByChained;

public class LFT_Sel {

    public static WebDriver driver = null;
    public static WebDriverWait waitVar = null;

    public static String baseURL = "http://orasi.com/";

    public LFT_Sel() {
    //Change this constructor to private if you supply your own public constructor
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {

        //Initialize the LeanFT SDK and the LeanFT Reporter
        ModifiableSDKConfiguration config = new ModifiableSDKConfiguration();
        config.setServerAddress(new URI("ws://localhost:5095"));
        SDK.init(config);
        ModifiableReportConfiguration rconfig = new ModifiableReportConfiguration();
        Reporter.init (rconfig);

        //Get WebDriver going
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jean\\DevTestStuff\\Selenium_Chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();

    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws Exception {

    }
}