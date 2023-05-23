package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class search_hotel {
   
static WebDriver driver;
	
	@FindBy(xpath = "(//select[@class='search_combobox'])[1]") 
	private static WebElement data13;
	
	@FindBy(id = "hotels")
	private static WebElement data14;
	
	@FindBy(name="room_type")
	private static WebElement data15;
	
	@FindBy(xpath = "(//select[@class='search_combobox'])[4]")
	private static WebElement data16;
	
	@FindBy(name="datepick_in")
	private static WebElement data17;
	
	@FindBy(id = "datepick_out")
	private static WebElement data18;
	
	@FindBy(xpath = "(//select[@class='search_combobox'])[5]")
	private static WebElement data19;
	
	@FindBy(name = "child_room")
	private static WebElement data20;
	
	@FindBy(xpath = "//input[@type='submit']")
	private static WebElement data21;

	public static WebDriver getDriver() {
		return driver;
	}

	public static WebElement getData13() {
		return data13;
	}

	public static WebElement getData14() {
		return data14;
	}

	public static WebElement getData15() {
		return data15;
	}

	public static WebElement getData16() {
		return data16;
	}

	public static WebElement getData17() {
		return data17;
	}

	public static WebElement getData18() {
		return data18;
	}

	public static WebElement getData19() {
		return data19;
	}

	public static WebElement getData20() {
		return data20;
	}

	public static WebElement getData21() {
		return data21;
	}
	
	public search_hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
	
	
}
	
}
