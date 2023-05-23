package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class paythe_bill {
static WebDriver driver;
	
	@FindBy(name="first_name")
	private static WebElement data24;
	
	@FindBy(id="last_name")
	private static WebElement data25;
	
	@FindBy(name="address")
	private static WebElement data26;
	
	@FindBy(id="cc_num")
	private static WebElement data27;
	
	@FindBy(name="cc_type")
	private static WebElement data28;
	
	@FindBy(name="cc_exp_month")
	private static WebElement data29;
	
	@FindBy(id="cc_exp_year")
	private static WebElement data30;
	
	@FindBy(name="cc_cvv")
	private static WebElement data31;
	
	

	public static WebDriver getDriver() {
		return driver;
	}

	public static WebElement getData24() {
		return data24;
	}

	public static WebElement getData25() {
		return data25;
	}

	public static WebElement getData26() {
		return data26;
	}

	public static WebElement getData27() {
		return data27;
	}

	public static WebElement getData28() {
		return data28;
	}

	public static WebElement getData29() {
		return data29;
	}

	public static WebElement getData30() {
		return data30;
	}

	public static WebElement getData31() {
		return data31;
	}

	
	

	public paythe_bill(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
		
	
	
	}
	
}
