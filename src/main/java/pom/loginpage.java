package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
static WebDriver driver;
	
	@FindBy(xpath = "//input[@type='text']")
	private static WebElement data10;
	
	@FindBy(xpath ="(//input[@class='login_input'])[2]")
	private static WebElement data11;
	
	@FindBy(xpath = "//input[@type='Submit']")
	private static WebElement data12;

	
	public static WebElement getData10() {
		return data10;
	}

	public static WebElement getData11() {
		return data11;
	}

	public static WebElement getData12() {
		return data12;
	}
	
	public loginpage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
		
	}
}
