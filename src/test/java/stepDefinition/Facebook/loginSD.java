package stepDefinition.Facebook;

import Pages.Facebook.LandingPage;
import Pages.Facebook.WrongPassword;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class loginSD {

    LandingPage lpage = new LandingPage();


    @When("^I enter '(.*)' in username box$")
    public void enterUsername (String email) {
        lpage.enterLoginEmail(email);


    }
    @And("^I enter '(.+)' in password box$")
    public void enterWrongPassword (String password) {
        lpage.enterPasswordEmail(password);


    }

    @And("^I click on the Login Button$")
    public void clickLoginButton () {
        lpage.clickLoginButton();

    }





}
