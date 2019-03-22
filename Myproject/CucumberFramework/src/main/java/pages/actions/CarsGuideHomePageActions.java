package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CarsGuideHomePageLocators;
import utilities.SeleniumDriver;

public class CarsGuideHomePageActions {
	
	CarsGuideHomePageLocators carsGuideHomePageLocators=null;
	
	public CarsGuideHomePageActions()
	{
		this.carsGuideHomePageLocators=new CarsGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideHomePageLocators);
	}
	
	public void moveTobuyPlusSellMenu()
	{
		Actions action=new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.buyplussellLink).build().perform();
	}
	
	public void clickOnSearchCarsMenu()
	{
		carsGuideHomePageLocators.searchCarsLink.click();
	}
	
	public void used()
	{
		carsGuideHomePageLocators.usedLink.click();
	}
	
	public void reviews()
	{
		Actions action=new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.reviewsLink);
	}
	
	
}
