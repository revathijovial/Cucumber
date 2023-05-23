package baseclass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
	public static WebDriver driver;
	
	 public static WebDriver browser(String name) {
		 
		 if(name.equalsIgnoreCase("chrome"))
		 {
			 WebDriverManager.chromedriver().setup();
				 driver = new ChromeDriver();
				driver.manage().window().maximize();
		 }
		 else if (name.equalsIgnoreCase("firefox")) {
			 
			 WebDriverManager.chromedriver().setup();
				 driver = new ChromeDriver();
				driver.manage().window().maximize();
		}
		return driver;
	 }
		
	 public static void url(String url1) {
			driver.get(url1);
			
		}
	 public static void input(WebElement e, String value) {
		 e.sendKeys(value);
		 
	 }
	 
	 public static void button(WebElement e) {
	 e.click();
	 
	 }

		 public static void dropdown(WebElement e, String type ,String value) {
			 Select s = new Select(e);
			 if(type.equalsIgnoreCase("value")) {
				s.selectByValue(value);
			 }
			 else if (type.equalsIgnoreCase("VisibleText")) {
				 s.selectByVisibleText(value);
				
			}
			 else if (type.equalsIgnoreCase("index")) {
				 int parse= Integer.parseInt(value);
				 s.selectByIndex(parse);
				
			}
			 
		 }
		 
		 public static void alert(String type) {
			 if (type.equalsIgnoreCase("accept")) {
				 driver.switchTo().alert().accept();
				
			}
			 else if (type.equalsIgnoreCase("dismiss")) {
				 driver.switchTo().alert().dismiss();
				}
			 else if (type.equalsIgnoreCase("gettext")) {
				 String text = driver.switchTo().alert().getText();
				 System.out.println(text);
				 
				}
			 
		 }
		 public static void alertsendkey(String value) {
			 driver.switchTo().alert().sendKeys(value);
			
		}
		 
		public static void frame(WebElement e, String type ,String value) {
			if (type.equalsIgnoreCase("index")){
				 int parse= Integer.parseInt(value);
				driver.switchTo().frame(parse);
				
			}
			else if (type.equalsIgnoreCase("name or id")) {
				driver.switchTo().frame(value);
				
				}
			
			else if (type.equalsIgnoreCase("webelement")) {
				driver.switchTo().frame(e);
			}
			}
		
		public static void screemshot(String value ) throws IOException {
			 TakesScreenshot s = (TakesScreenshot)driver;
				File f1 = s.getScreenshotAs(OutputType.FILE);
				File f = new File("C:\\Users\\greva\\eclipse-workspace\\Selenium\\img\\"+value+"");
			    FileUtils.copyFile(f1, f);
			
		}
		
		public static void navigate(WebDriver d,String url) {
			driver.navigate().to(url);
			
		}
		       public static void back() {
		    	   driver.navigate().back();
		       }
		       
		       public static void forward() {
				driver.navigate().forward();
			}
		       public static void refresh() {
		    	   driver.navigate().refresh();
				
			}
		       public static void close() {
				driver.close();
			}
		       public static void quit() {
		    	   driver.quit();
				
			}
		     public static void navto(String url) {
				driver.navigate().to(url);
			}

		      public static void checkbox(WebElement e) {
				e.click();
			}
		      
		      public static void radio(WebElement e) {
		    	  
				e.click();
			}
		      
		      public static void geturl() {
		    	  String currentUrl = driver.getCurrentUrl();
		    	  System.out.println(currentUrl);
				
			}
		      
		      public static void title() {
		    	  String title = driver.getTitle();
		    	  System.out.println(title);
				
			}
		      
		     public static void Actions(WebElement value,String type) {
		    	 Actions act = new Actions(driver);
		    	 if(type.equalsIgnoreCase("click")) {
		    		 act.contextClick(value).build().perform();
		    	 }
			}
}
