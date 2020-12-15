package stepDefinition.Hotels;

import Pages.Hotels.AfterSearchPage;
import Pages.Hotels.LandingPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class searchSD {

    LandingPage lPage = new LandingPage();
    AfterSearchPage afPage = new AfterSearchPage();

@Given("^I am on hotels landing page closing the pop window$")
    public void closingOverlayTest () {
    lPage.sleep();
    lPage.closeOverlay();



    }

@When("^I enter '(.+)' in search$")
public void sendingKeysInSearch (String data) {
    lPage.sleep();
    lPage.enterKeysSearchBox(data);


}

@And("^I select '.+' from autosuggestion$")
public void selectingLocation () {
    lPage.sleep();
    lPage.selectLocation();

}

@And("^I click Search button$")
public void clickingSearch () {
        lPage.SearchClick();

}

@Then("^I verify search header contains text selected from auto suggestion$")
public void verifySearchHeaderContains () {
    lPage.sleep();
    Assert.assertTrue(afPage.searchHeaderTextContains("Lake George, New York, United States of America"));


}
@And("^I verify text under 'Destination, property, or landmark' is same as text selected from auto suggestion$")
public void verifyTextUnderDestination () {
        Assert.assertTrue(afPage.IsDesLMEqual("Lake George, New York, United States of America"));


}

@And("^I select (.+) in children dropdown$")
public void SelectingChildNo (String data) {
     lPage.sleep();
    lPage.selectChild(data);


}



@And("^I enter Child 1 age as '(.+)'")
public void SelectingChildAge (String data) {
    lPage.sleep();
    lPage.selectChildAge(data);
}

@And("I enter child 2 age as '(.+)'$")
public void SelectingChildTwoAge (String data) {
    lPage.sleep();
    lPage.SelectChildTwoAge(data);
}

@And("^I sort the result by 'Price low to high'$")
public void sortResultsByPrice () {
    lPage.sleep();
    afPage.HoverToPriceMenuToggleAndClick();


}

@Then("^I print the lowest price and hotel name in the console$")
public  void PrintingTheLowestPriceAndHotel () {
    lPage.sleep();
    afPage.PrintTheLowestPriceAndHotel();
}

@And("^I verify the lowest price id less than 100$")
public void VerifyLowestPriceLessThan100 () {
    lPage.sleep();
    Assert.assertTrue(afPage.isLowestPriceLessThan100());

}


}
