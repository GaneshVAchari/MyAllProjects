package steps;

import java.util.List;

import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.CarsSearchPageActions;
import pages.locators.CarsGuideHomePageLocators;
import utilities.SeleniumDriver;

public class SearchCarSteps {
	
	CarsGuideHomePageActions carsGuideHomePageActions=new CarsGuideHomePageActions();
	CarsSearchPageActions carsSearchPageActions=new CarsSearchPageActions();
	
	@Given("^I am on the home page \"([^\"]*)\" of cars website$")
	public void i_am_on_the_home_page_of_cars_website(String websiteURL) throws Throwable {
		SeleniumDriver.openPage(websiteURL);
	}

	@And("^I move to Menu$")
	public void i_move_to_Menu(List<String> list) throws Throwable {
		String menu= list.get(1);
		System.out.println("Menu selected is : "+menu);
		carsGuideHomePageActions.moveTobuyPlusSellMenu();
	}

	@And("^click on \"([^\"]*)\" link$")
	public void click_on_link(String arg1) throws Throwable {
		carsGuideHomePageActions.clickOnSearchCarsMenu();
	}

	@And("^select car brand as \"([^\"]*)\" from Anymake$")
	public void select_car_brand_as_from_Anymake(String carBrand) throws Throwable {
	    carsSearchPageActions.selectCarMake(carBrand);
	}

	@And("^select car model as \"([^\"]*)\" from Cars model$")
	public void select_car_model_as_from_Cars_model(String carmodel) throws Throwable {
	    carsSearchPageActions.selectCarModel(carmodel);
	}

	@And("^select \"([^\"]*)\" from Select Location dropdown$")
	public void select_from_Select_Location_dropdown(String location) throws Throwable {
		carsSearchPageActions.selectLocation(location);
	}

	@And("^select \"([^\"]*)\" from Price dropdown$")
	public void select_from_Price_dropdown(String price) throws Throwable {
	    carsSearchPageActions.selectPrice(price);
	}

	@And("^click on Find My Next Car button$")
	public void click_on_Find_My_Next_Car_button() throws Throwable {
		carsSearchPageActions.clickOnFindMyNextCarSelect();
	}

	@Then("^I should see list of searched cars$")
	public void i_should_see_list_of_searched_cars() throws Throwable {
		System.out.println("Cars list found");
	}

	@And("^the page title should be \"([^\"]*)\"$")
	public void the_page_title_should_be(String expectedTitle) throws Throwable {
		String actualTitle=SeleniumDriver.getDriver().getTitle();
		System.out.println("Actual title is: "+actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);
	}



}
