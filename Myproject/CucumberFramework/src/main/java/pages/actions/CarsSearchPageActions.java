package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.SearchCarPageLocators;
import utilities.SeleniumDriver;

public class CarsSearchPageActions {
	
	SearchCarPageLocators searchCarPageLocators=null;
	
	public CarsSearchPageActions()
	{
		this.searchCarPageLocators=new SearchCarPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), searchCarPageLocators);
	}
	
	public void selectCarMake(String carBrand)
	{
		Select selectCarMaker=new Select(searchCarPageLocators.carsMakeAnyDropdown);
		selectCarMaker.selectByVisibleText(carBrand);
	}
	
	public void selectCarModel(String carmodel)
	{
		Select selectCarMaker=new Select(searchCarPageLocators.selectModelDropdown);
		selectCarMaker.selectByVisibleText(carmodel);
	}
	
	public void selectLocation(String location)
	{
		Select selectCarMaker=new Select(searchCarPageLocators.selectLocationDropdown);
		selectCarMaker.selectByVisibleText(location);
	}
	
	public void selectPrice(String price)
	{
		Select selectCarMaker=new Select(searchCarPageLocators.priceDropdown);
		selectCarMaker.selectByVisibleText(price);
	}
	
	public void clickOnFindMyNextCarSelect()
	{
		searchCarPageLocators.findMyNextCarButton.click();
	}

}
