
    import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;  
      
    public class First {  
      
        public static void main(String[] args) {  
            
        // declaration and instantiation of objects/variables  
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");  
        WebDriver driver=new ChromeDriver();  
          
    // Launch website  
        driver.navigate().to("http://www.hauskey.com/");  
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);  
        // Click on the search text box and send value  
      /*  WebElement searchfield= driver.findElement(By.linkText("LOGIN"));
       // searchfield.sendKeys("pluralsight");
        searchfield.click();
        
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);  
        WebElement countryfield= driver.findElement(By.className("iti-arrow"));
        countryfield.click();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);  
        WebElement countrysearchfield= driver.findElement(By.id("country-search-box"));
        countrysearchfield.sendKeys("India");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);  
      //  WebElement countryfind=driver.findElement(By.className("country-name"));
        WebElement selectcountry=driver.findElement(By.xpath("//li[@id='in']"));
        selectcountry.click();
        WebElement phonefield= driver.findElement(By.id("phone"));
        
        
        phonefield.sendKeys("7569389226");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);  
        
        WebElement passwordfield=driver.findElement(By.xpath("//input[@type='password']"));
        passwordfield.sendKeys("#Ac12345");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);  
        WebElement loginbuttonfield= driver.findElement(By.className("btn_primary_sq"));
        loginbuttonfield.click();
        WebElement logoutfield= driver.findElement(By.linkText("LOGOUT"));
        
         logoutfield.click();
         WebElement signupfield= driver.findElement(By.linkText("SIGN UP"));
         
         signupfield.click();
         WebElement namefield= driver.findElement(By.xpath("(//input[@type='text'])[2]"));
         namefield.sendKeys("Anshuman Chauhan");
         WebElement emailfield= driver.findElement(By.xpath("(//input[@type='text'])[3]"));
         emailfield.sendKeys("anshu8559096633@gmail.com");
         WebElement countryfield1= driver.findElement(By.className("iti-arrow"));
         countryfield1.click();
         WebElement countrysearchfield1= driver.findElement(By.id("country-search-box"));
         countrysearchfield1.sendKeys("India");
         driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);  
       //WebElement countryfind=driver.findElement(By.className("country-name"));
         WebElement selectcountry1=driver.findElement(By.xpath("//li[@id='in']"));
         selectcountry1.click();
         WebElement phonefield1= driver.findElement(By.id("phone"));
         phonefield1.sendKeys("7569389226");
         WebElement passwordfield1=driver.findElement(By.xpath("//input[@type='password']"));
         passwordfield1.sendKeys("#Ac12345");
         WebElement checkmarkfield= driver.findElement(By.className("checkmark"));
         checkmarkfield.click();
         WebElement loginbuttonfield1= driver.findElement(By.className("btn_primary_sq"));
         loginbuttonfield1.click();
         WebElement iconfield=driver.findElement(By.xpath("//img[@alt='logo_hauskey']"));
         iconfield.click();*/
         WebElement search1= driver.findElement(By.name("search"));
         search1.sendKeys("toronto");
         search1.submit();
         WebElement selectfield= driver.findElement(By.linkText("Toronto"));
    //     WebElement selectfield=driver.findElement(By.cssSelector("//div[@id='searchInputWithSuggestions']/div/div[2]/ul/li/p)"));
         selectfield.click();
         
       
        }  
      
    }  