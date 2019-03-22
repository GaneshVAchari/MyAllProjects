package steps;

import java.util.List;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.UsedCarsPageActions;

public class UsedCarsSteps {
	CarsGuideHomePageActions carsGuideHomePageActions=new CarsGuideHomePageActions();
	UsedCarsPageActions usedCarsPageActions =new UsedCarsPageActions();
	
	@And("^click on \"([^\"]*)\" link on Used Car Page$")
	public void click_on_link_on_Used_Car_Page(String arg1) throws Throwable {
		carsGuideHomePageActions.used();
	}

	@And("^select car brand as \"([^\"]*)\" from Anymake dropdown on Used Seach Car Page$")
	public void select_car_brand_as_from_Anymake_dropdown_on_Used_Seach_Car_Page(String carBrand) throws Throwable {
		usedCarsPageActions.selectCarMake(carBrand);
	}

	@And("^select car model on Used Saech Car Page$")
	public void select_car_model_on_Used_Saech_Car_Page(List<String> list) throws Throwable {
		String menu= list.get(1);
		usedCarsPageActions.selectCarModel(menu);
	}

	@And("^select \"([^\"]*)\" from Select Location dropdown on Used Search Car Page$")
	public void select_from_Select_Location_dropdown_on_Used_Search_Car_Page(String location) throws Throwable {
		usedCarsPageActions.selectLocation(location);
	}

	@And("^select \"([^\"]*)\" from Price dropdown on Used Search Car Page$")
	public void select_from_Price_dropdown_on_Used_Search_Car_Page(String price) throws Throwable {
		usedCarsPageActions.selectPrice(price);
	}

	@And("^click on Find My Next Car button on Used Search Car Page$")
	public void click_on_Find_My_Next_Car_button_on_Used_Search_Car_Page() throws Throwable {
		usedCarsPageActions.clickOnFindMyNextCarSelect();
	}

	@Then("^I should see list of Used searched cars$")
	public void i_should_see_list_of_Used_searched_cars() throws Throwable {
		System.out.println("Used car list found");
	}

}