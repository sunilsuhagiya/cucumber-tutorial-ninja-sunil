package demo.tutorialninja.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import demo.tutorialninja.pages.MyAccountPage;
import org.junit.Assert;

public class AccountLoginSteps {
    @And("^User click on login$")
    public void userClickOnLogin() {
        new MyAccountPage().clickOnLogin();
    }

    @Then("^Verify text my account \"([^\"]*)\"$")
    public void verifyTextMyAccount(String textMyAccount){
        Assert.assertEquals("Text not found", textMyAccount, new MyAccountPage().getMyAccountText());
    }
}
