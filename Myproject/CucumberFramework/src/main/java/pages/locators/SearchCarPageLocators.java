package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchCarPageLocators {
	
	@FindBy(how=How.XPATH, using="//*[@id='makes']")
	public WebElement carsMakeAnyDropdown;
	
	@FindBy(how=How.XPATH, using="//*[@id='models']")
	public WebElement selectModelDropdown;
	
	@FindBy(how=How.XPATH, using="//*[@id='locations']")
	public WebElement selectLocationDropdown;
	
	@FindBy(how=How.XPATH, using="//*[@id='price-max']")
	public WebElement priceDropdown;
	
	@FindBy(how=How.XPATH, using="//*[@id='search-submit']")
	public WebElement findMyNextCarButton;
	
	
	

}
