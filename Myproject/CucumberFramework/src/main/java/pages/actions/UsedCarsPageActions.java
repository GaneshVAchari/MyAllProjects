package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.SearchCarPageLocators;
import pages.locators.UsedCarsPageLocators;
import utilities.SeleniumDriver;

public class UsedCarsPageActions {
	
	UsedCarsPageLocators usedCarsPageLocators=null;
	
	public UsedCarsPageActions()
	{
		this.usedCarsPageLocators=new UsedCarsPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), usedCarsPageLocators);
	}
	
	public void selectCarMake(String carBrand)
	{
		Select selectCarMaker=new Select(usedCarsPageLocators.carsMakeAnyDropdown);
		selectCarMaker.selectByVisibleText(carBrand);
	}
	
	public void selectCarModel(String carmodel)
	{
		Select selectCarMaker=new Select(usedCarsPageLocators.selectModelDropdown);
		selectCarMaker.selectByVisibleText(carmodel);
	}
	
	public void selectLocation(String location)
	{
		Select selectCarMaker=new Select(usedCarsPageLocators.selectLocationDropdown);
		selectCarMaker.selectByVisibleText(location);
	}
	
	public void selectPrice(String price)
	{
		Select selectCarMaker=new Select(usedCarsPageLocators.priceDropdown);
		selectCarMaker.selectByVisibleText(price);
	}
	
	public void clickOnFindMyNextCarSelect()
	{
		usedCarsPageLocators.findMyNextCarButton.click();
	}

	

}
