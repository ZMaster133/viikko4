package ohtu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tester {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        login(driver);
        incorrectPassword(driver);
        incorrectUsername(driver);
        newUser(driver);
        logout(driver);
    }
    
    private static void login(WebDriver driver) {
        driver.get("http://localhost:8090");
        System.out.println( driver.getPageSource() );
        WebElement element = driver.findElement(By.linkText("login"));       
        element.click(); 
        
        System.out.println("==");
        
        System.out.println( driver.getPageSource() );
        element = driver.findElement(By.name("username"));
        element.sendKeys("pekka");
        element = driver.findElement(By.name("password"));
        element.sendKeys("akkep");
        element = driver.findElement(By.name("login"));
        element.submit();
        
        System.out.println("==");
        System.out.println( driver.getPageSource() );
    }
    
    private static void incorrectPassword(WebDriver driver) {
        driver.get("http://localhost:8090");
        System.out.println( driver.getPageSource() );
        WebElement element = driver.findElement(By.linkText("login"));       
        element.click(); 
        
        System.out.println("==");
        
        System.out.println( driver.getPageSource() );
        element = driver.findElement(By.name("username"));
        element.sendKeys("pekka");
        element = driver.findElement(By.name("password"));
        element.sendKeys("asdf");
        element = driver.findElement(By.name("login"));
        element.submit();
        
        System.out.println("==");
        System.out.println( driver.getPageSource() );
    }
    
    private static void incorrectUsername(WebDriver driver) {
        driver.get("http://localhost:8090");
        System.out.println( driver.getPageSource() );
        WebElement element = driver.findElement(By.linkText("login"));       
        element.click(); 
        
        System.out.println("==");
        
        System.out.println( driver.getPageSource() );
        element = driver.findElement(By.name("username"));
        element.sendKeys("asdf");
        element = driver.findElement(By.name("password"));
        element.sendKeys("akkep");
        element = driver.findElement(By.name("login"));
        element.submit();
        
        System.out.println("==");
        System.out.println( driver.getPageSource() );
    }
    
    private static void newUser(WebDriver driver) {
        driver.get("http://localhost:8090");
        System.out.println( driver.getPageSource() );
        WebElement element = driver.findElement(By.linkText("register new user"));       
        element.click(); 
        
        System.out.println("==");
        
        System.out.println( driver.getPageSource() );
        element = driver.findElement(By.name("username"));
        element.sendKeys("mattimeikalainen");
        element = driver.findElement(By.name("password"));
        element.sendKeys("JippiiMatti123");
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys("JippiiMatti123");
        element = driver.findElement(By.name("add"));
        element.submit();
        
        System.out.println("==");
        System.out.println( driver.getPageSource() );
    }
    
    private static void logout(WebDriver driver) {
        driver.get("http://localhost:8090/newUser");
        System.out.println( driver.getPageSource() );
        WebElement element = driver.findElement(By.linkText("continue to application mainpage"));
        element.click(); 
        
        WebElement element2 = driver.findElement(By.linkText("logout"));
        element2.click(); 
        
        System.out.println("==");
        System.out.println( driver.getPageSource() );
    }
}
