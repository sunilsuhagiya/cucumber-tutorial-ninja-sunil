package demo.tutorialninja.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demo.tutorialninja.pages.MyAccountPage;
import org.junit.Assert;

public class MyAccountSteps {
    @When("^User click on my account link$")
    public void userClickOnMyAccountLink() {
        new MyAccountPage().clickOnMyAccountLink();
    }


    @And("^User select my account option \"([^\"]*)\"$")
    public void userSelectMyAccountOption(String optionRegister) {
        new MyAccountPage().selectMyAccountOptions(optionRegister);
    }

    @Then("^verify the message \"([^\"]*)\"$")
    public void verifyTheMessage(String expected) {
        Assert.assertEquals("Text not Displayed",expected,new MyAccountPage().getRegisterAccountMessage());
    }

    @And("^User click on my account option \"([^\"]*)\"$")
    public void userClickOnMyAccountOption(String option)  {
        new MyAccountPage().selectMyAccountOptions(option);
    }


    @Then("^Verify the message returning customer \"([^\"]*)\"$")
    public void verifyTheMessageReturningCustomer(String expectedMessage){
       Assert.assertEquals("Text not found",expectedMessage,new MyAccountPage().getReturningCustomerMessage());
    }


    @And("^User enter first name \"([^\"]*)\"$")
    public void userEnterFirstName(String fName)  {
        new MyAccountPage().enterFirstName(fName);
    }

    @And("^User enter email id \"([^\"]*)\"$")
    public void userEnterEmailId(String email)  {
        new MyAccountPage().enterEmailId(email);
    }

    @And("^User enter phone number \"([^\"]*)\"$")
    public void userEnterPhoneNumber(String phone)  {
        new MyAccountPage().enterPhoneNumber(phone);
    }

    @And("^User enter password \"([^\"]*)\"$")
    public void userEnterPassword(String password)  {
        new MyAccountPage().enterPassword(password);
    }

    @And("^User enter confirm password \"([^\"]*)\"$")
    public void userEnterConfirmPassword(String confirmPassword)  {
        new MyAccountPage().enterConfirmPassword(confirmPassword);
    }

    @And("^User click on subscribe button$")
    public void userClickOnSubscribeButton() {
        new MyAccountPage().clickSubscribeOnYesRadioButton();
    }

    @And("^User click on checkbox button$")
    public void userClickOnCheckboxButton() {
        new MyAccountPage().clickOnPrivacyPolicyCheckBox();
    }

    @And("^User click on continue$")
    public void userClickOnContinue() {
        new MyAccountPage().clickOnContinue1();
    }

    @Then("^Verify text account created \"([^\"]*)\"$")
    public void verifyTextAccountCreated(String textAccountCreated)  {
        Assert.assertEquals("Text not found",textAccountCreated,new MyAccountPage().getAccountCreatedMessage());
    }

    @And("^User click on second continue button$")
    public void userClickOnSecondContinueButton() {
        new MyAccountPage().clickOnContinueButton2();
    }

    @And("^User click on my account tab$")
    public void userClickOnMyAccountTab() {
        new MyAccountPage().clickOnMyAccountTab();
    }

    @And("^User select account option \"([^\"]*)\"$")
    public void userSelectAccountOption(String accountOption)  {
        new MyAccountPage().selectMyAccountOptions(accountOption);
    }

    @Then("^verify account logout text \"([^\"]*)\"$")
    public void verifyAccountLogoutText(String textAccountLogout)  {
        Assert.assertEquals("Text not found",textAccountLogout, new MyAccountPage().getAccountLogoutMessage());
    }

    @And("^User click on final continue$")
    public void userClickOnFinalContinue() {
        new MyAccountPage().clickOnContinueButton3();
    }
}
