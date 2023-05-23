package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class select_hotel {

	
static WebDriver driver;
	
	
    @FindBy(xpath = "//input[@type='radio']")
	private static WebElement data22;
	
	@FindBy(name = "continue")
	private static WebElement data23;

	public static WebDriver getDriver() {
		return driver;
	}

	public static WebElement getData22() {
		return data22;
	}

	public static WebElement getData23() {
		return data23;
	}
	
	public select_hotel (WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
}
}
