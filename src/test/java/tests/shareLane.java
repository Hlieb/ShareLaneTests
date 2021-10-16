package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.sql.Driver;

public class shareLane {
    //1.Open browser URL - https://www.sharelane.com/cgi-bin/register.py
    //2. Enter value in ZIP code field
    //3. Click Continue Button

    @Test
    public void fillInZipCodeFieldTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("18000");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        driver.findElement(By.xpath("//*[@value='Register']")).click();



    }

    // 1.Open browser URL - https://www.sharelane.com/cgi-bin/register.py
    // 2. Enter value in ZIP code field
    // 3. Click Continue Button
    // 4. Fill all required Fields
    // 5. Click register

    @Test
    public void fillInOnlyRequiredFieldsTest(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("18000");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        driver.findElement(By.name("first_name")).sendKeys("Hlieb");
        driver.findElement(By.name("email")).sendKeys("Hlieb@gdsgds.com");
        driver.findElement(By.name("first_name")).sendKeys("Hlieb");
        driver.findElement(By.name("password1")).sendKeys("1111");
        driver.findElement(By.name("password2")).sendKeys("1111");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.close();
    }

    // 1.Open browser URL - https://www.sharelane.com/cgi-bin/register.py
    // 2. Enter value in ZIP code field
    // 3. Click Continue Button
    // 4. Fill only unrequired Field
    // 5. Click register

    @Test
    public void fillInOnlyUnrequiredFieldTest(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("18000");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        driver.findElement(By.name("last_name")).sendKeys("Boiechko");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.close();

    }

    // 1.Open browser URL - https://www.sharelane.com/cgi-bin/register.py
    // 2. Enter value in ZIP code field
    // 3. Click Continue Button
    // 4. Fill all required Fields (fields "password" and "confirm password" should be different)
    // 5. Click register

    @Test
    public void differentPasswordsTest(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("18000");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        driver.findElement(By.name("first_name")).sendKeys("Hlieb");
        driver.findElement(By.name("email")).sendKeys("Hlieb@gdsgds.com");
        driver.findElement(By.name("last_name")).sendKeys("Hlieb");
        driver.findElement(By.name("password1")).sendKeys("1111");
        driver.findElement(By.name("password2")).sendKeys("2222");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.close();

    }


    // 1.Open browser URL - https://www.sharelane.com/cgi-bin/register.py
    // 2. Enter value in ZIP code field
    // 3. Click Continue Button
    // 4. Fill all required Fields except field "First Name"
    // 5. Click register

    @Test
    public void noFirstNameTest(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("18000");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        driver.findElement(By.name("email")).sendKeys("Hlieb@gdsgds.com");
        driver.findElement(By.name("password1")).sendKeys("1111");
        driver.findElement(By.name("password2")).sendKeys("1111");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.close();
    }

    // 1.Open browser URL - https://www.sharelane.com/cgi-bin/register.py
    // 2. Enter value in ZIP code field
    // 3. Click Continue Button
    // 4. Fill all required Fields (field email should be filled incorrect: without part "@mail.com")
    // 5. Click register

    @Test
    public void incorrectMailTest(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("18000");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        driver.findElement(By.name("first_name")).sendKeys("Hlieb");
        driver.findElement(By.name("email")).sendKeys("Hlieb");
        driver.findElement(By.name("password1")).sendKeys("1111");
        driver.findElement(By.name("password2")).sendKeys("1111");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.close();

    }

}

