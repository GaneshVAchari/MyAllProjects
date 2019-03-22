$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SearchCars.feature");
formatter.feature({
  "line": 2,
  "name": "Acceptance testing to validate search cars options",
  "description": "In order to validate that \r\nthe search car page is working fine\r\nwe will do the acceptance testing",
  "id": "acceptance-testing-to-validate-search-cars-options",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Search-Cars"
    }
  ]
});
formatter.before({
  "duration": 10392143518,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Validate search cars page",
  "description": "",
  "id": "acceptance-testing-to-validate-search-cars-options;validate-search-cars-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Search-Cars-Positive"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I am on the home page \"https://www.carsguide.com.au\" of cars website",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I move to Menu",
  "rows": [
    {
      "cells": [
        "Menu"
      ],
      "line": 11
    },
    {
      "cells": [
        "buy + sell"
      ],
      "line": 12
    },
    {
      "cells": [
        "reviews"
      ],
      "line": 13
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "click on \"Search Cars\" link",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "select car brand as \"BMW\" from Anymake",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "select car model as \"1 SERIES\" from Cars model",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "select \"Australia\" from Select Location dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "select \"$1,000\" from Price dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "click on Find My Next Car button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I should see list of searched cars",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "the page title should be \"Bmw 1 Series Under 1000 for sale | carsguide\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.carsguide.com.au",
      "offset": 23
    }
  ],
  "location": "SearchCarSteps.i_am_on_the_home_page_of_cars_website(String)"
});
formatter.result({
  "duration": 13742081958,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarSteps.i_move_to_Menu(String\u003e)"
});
formatter.result({
  "duration": 435621618,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Search Cars",
      "offset": 10
    }
  ],
  "location": "SearchCarSteps.click_on_link(String)"
});
formatter.result({
  "duration": 8029408374,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BMW",
      "offset": 21
    }
  ],
  "location": "SearchCarSteps.select_car_brand_as_from_Anymake(String)"
});
formatter.result({
  "duration": 841809836,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1 SERIES",
      "offset": 21
    }
  ],
  "location": "SearchCarSteps.select_car_model_as_from_Cars_model(String)"
});
formatter.result({
  "duration": 705039953,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Australia",
      "offset": 8
    }
  ],
  "location": "SearchCarSteps.select_from_Select_Location_dropdown(String)"
});
formatter.result({
  "duration": 448321910,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$1,000",
      "offset": 8
    }
  ],
  "location": "SearchCarSteps.select_from_Price_dropdown(String)"
});
formatter.result({
  "duration": 431857930,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarSteps.click_on_Find_My_Next_Car_button()"
});
formatter.result({
  "duration": 11400954583,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarSteps.i_should_see_list_of_searched_cars()"
});
formatter.result({
  "duration": 108717,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bmw 1 Series Under 1000 for sale | carsguide",
      "offset": 26
    }
  ],
  "location": "SearchCarSteps.the_page_title_should_be(String)"
});
formatter.result({
  "duration": 26062327,
  "error_message": "java.lang.AssertionError: expected [Bmw 1 Series Under 1000 for sale | carsguide] but found [Bmw 1 Series Under 1000 for Sale | carsguide]\r\n\tat org.testng.Assert.fail(Assert.java:94)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:513)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:135)\r\n\tat org.testng.Assert.assertEquals(Assert.java:116)\r\n\tat org.testng.Assert.assertEquals(Assert.java:190)\r\n\tat org.testng.Assert.assertEquals(Assert.java:200)\r\n\tat steps.SearchCarSteps.the_page_title_should_be(SearchCarSteps.java:73)\r\n\tat ✽.And the page title should be \"Bmw 1 Series Under 1000 for sale | carsguide\"(SearchCars.feature:21)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 9229767512,
  "status": "passed"
});
formatter.uri("UsedCarsSearch.feature");
formatter.feature({
  "line": 2,
  "name": "Acceptance testing to validate Used search cars options",
  "description": "In order to validate that \r\nthe used search car page is working fine\r\nwe will do the acceptance testing",
  "id": "acceptance-testing-to-validate-used-search-cars-options",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Used-Search-Cars"
    }
  ]
});
formatter.before({
  "duration": 7990852524,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Validate used search cars page",
  "description": "",
  "id": "acceptance-testing-to-validate-used-search-cars-options;validate-used-search-cars-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Used-Search-Cars-Positive"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I am on the home page \"https://www.carsguide.com.au\" of cars website",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I move to Menu",
  "rows": [
    {
      "cells": [
        "Menu"
      ],
      "line": 11
    },
    {
      "cells": [
        "buy + sell"
      ],
      "line": 12
    },
    {
      "cells": [
        "reviews"
      ],
      "line": 13
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "click on \"Used\" link on Used Car Page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "select car brand as \"AUDI\" from Anymake dropdown on Used Seach Car Page",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "select car model on Used Saech Car Page",
  "rows": [
    {
      "cells": [
        "Car model"
      ],
      "line": 17
    },
    {
      "cells": [
        "A4"
      ],
      "line": 18
    },
    {
      "cells": [
        "A3"
      ],
      "line": 19
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "select \"SA - All\" from Select Location dropdown on Used Search Car Page",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "select \"$2,000\" from Price dropdown on Used Search Car Page",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "click on Find My Next Car button on Used Search Car Page",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I should see list of Used searched cars",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "the page title should be \"Used Audi A4 Under 2000 for Sale SA | carsguide\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.carsguide.com.au",
      "offset": 23
    }
  ],
  "location": "SearchCarSteps.i_am_on_the_home_page_of_cars_website(String)"
});
formatter.result({
  "duration": 9669456818,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarSteps.i_move_to_Menu(String\u003e)"
});
formatter.result({
  "duration": 457254822,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Used",
      "offset": 10
    }
  ],
  "location": "UsedCarsSteps.click_on_link_on_Used_Car_Page(String)"
});
formatter.result({
  "duration": 8924000094,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AUDI",
      "offset": 21
    }
  ],
  "location": "UsedCarsSteps.select_car_brand_as_from_Anymake_dropdown_on_Used_Seach_Car_Page(String)"
});
formatter.result({
  "duration": 856693100,
  "status": "passed"
});
formatter.match({
  "location": "UsedCarsSteps.select_car_model_on_Used_Saech_Car_Page(String\u003e)"
});
formatter.result({
  "duration": 1796374814,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SA - All",
      "offset": 8
    }
  ],
  "location": "UsedCarsSteps.select_from_Select_Location_dropdown_on_Used_Search_Car_Page(String)"
});
formatter.result({
  "duration": 377611022,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$2,000",
      "offset": 8
    }
  ],
  "location": "UsedCarsSteps.select_from_Price_dropdown_on_Used_Search_Car_Page(String)"
});
formatter.result({
  "duration": 403467401,
  "status": "passed"
});
formatter.match({
  "location": "UsedCarsSteps.click_on_Find_My_Next_Car_button_on_Used_Search_Car_Page()"
});
formatter.result({
  "duration": 7471587112,
  "status": "passed"
});
formatter.match({
  "location": "UsedCarsSteps.i_should_see_list_of_Used_searched_cars()"
});
formatter.result({
  "duration": 141538,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Used Audi A4 Under 2000 for Sale SA | carsguide",
      "offset": 26
    }
  ],
  "location": "SearchCarSteps.the_page_title_should_be(String)"
});
formatter.result({
  "duration": 22042639,
  "status": "passed"
});
formatter.after({
  "duration": 8447848475,
  "status": "passed"
});
});