package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsGuideHomePageLocators {
	
	@FindBy(how=How.XPATH, using="//*[@id=\"u_H\"]/div/div[1]/ul/li[1]/a")
	public WebElement buyplussellLink;
	
	@FindBy(how=How.LINK_TEXT, using="reviews")
	public WebElement reviewsLink;
	
	@FindBy(how=How.LINK_TEXT, using="news")
	public WebElement newsLink;
	
	@FindBy(how=How.LINK_TEXT, using="advice")
	public WebElement adviceLink;
	
	@FindBy(how=How.LINK_TEXT, using="Search Cars")
	public WebElement searchCarsLink;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"u_H\"]/div/div[1]/ul/li[1]/div/div/div[1]/ul/li[2]/a")
	public WebElement usedLink;
	
}
