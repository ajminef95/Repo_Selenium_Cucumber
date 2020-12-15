package Pages.Facebook;

import Pages.BasePage;
import org.openqa.selenium.By;

public class WrongPassword extends BasePage {


    By incorrectPasswordError = By.xpath("//div[text()='You can\'t use this feature at the moment']");
    By incorrectEmailError = By.xpath("//div[text()='The email you’ve entered doesn’t match any account. ']");


    public boolean isIncorrectPasswordErrorDisplayed() {
        return isElementDisplayed(incorrectPasswordError);
    }

    public boolean isIncorrectEmailErrorDisplayed() {
        return isElementDisplayed(incorrectEmailError);


    }



}
