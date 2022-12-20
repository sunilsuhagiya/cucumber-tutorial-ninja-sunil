package demo.tutorialninja.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demo.tutorialninja.pages.LaptopsAndNotebooksPage;
import org.junit.Assert;

public class LaptopAndNotebookSteps {
    @Given("^User is on homepage$")
    public void userIsOnHomepage() {

    }

    @When("^user click on laptop and note book tab$")
    public void userClickOnLaptopAndNoteBookTab() {
        new LaptopsAndNotebooksPage().mouseHoverOnLaptopsAndDesktopTab();
    }

    @And("^user click on show all laptop and note book$")
    public void userClickOnShowAllLaptopAndNoteBook() {
        new LaptopsAndNotebooksPage().clickOnShowAllLaptopsAndNotebooks();
    }

    @And("^User click on sort by price high to low$")
    public void userClickOnSortByPriceHighToLow() {
        new LaptopsAndNotebooksPage().sortByPriceHighToLow();
    }

    @Then("^verify products are sorted by high to low price$")
    public void verifyProductsAreSortedByHighToLowPrice() {
        Assert.assertEquals("","",new LaptopsAndNotebooksPage().GetSortByHighToLowOrder());
    }

    @And("^User click on currency link$")
    public void userClickOnCurrencyLink() {
        new LaptopsAndNotebooksPage().clickOnCurrencyLink();
    }

    @When("^user mouse hover on laptop and desktop tab$")
    public void userMouseHoverOnLaptopAndDesktopTab() {
        new LaptopsAndNotebooksPage().mouseHoverOnLaptopsAndDesktopTab();
    }

    @And("^User click on Macbook tab$")
    public void userClickOnMacbookTab() {
        new LaptopsAndNotebooksPage().clickOnMacBookTab();
    }

    @And("^User click on add to cart$")
    public void userClickOnAddToCart() {
        new LaptopsAndNotebooksPage().clickOnAddToCartButton();
    }

    @Then("^verify message Success You have added MacBook to your shopping cart!$")
    public void verifyMessageSuccessYouHaveAddedMacBookToYourShoppingCart() {
        Assert.assertEquals("Text does not match","Success: You have added MacBook to your shopping cart!\n"+"×",new LaptopsAndNotebooksPage().getSuccessTextFromLink() );
    }

    @And("^User click on shopping cart$")
    public void userClickOnShoppingCart() {
        new LaptopsAndNotebooksPage().clickOnShoppingCart();
    }

    @Then("^verify text Shopping Cart$")
    public void verifyTextShoppingCart() {
        Assert.assertEquals("Text not match","Shopping Cart", new LaptopsAndNotebooksPage().getShoppingCartMessage());
    }

    @And("^verify the Product name MacBook$")
    public void verifyTheProductNameMacBook() {
        Assert.assertEquals("Text not match","MacBook",new LaptopsAndNotebooksPage().getVerifyProductMacbook());
    }

    @And("^User Change Quantity$")
    public void userChangeQuantity() {
        new LaptopsAndNotebooksPage().changeQuantityTo2();

    }

    @And("^User click on update cart$")
    public void userClickOnUpdateCart() {
        new LaptopsAndNotebooksPage().clickOnUpdateCart();
    }

    @Then("^Verify the message Success You have modified your shopping cart!$")
    public void verifyTheMessageSuccessYouHaveModifiedYourShoppingCart() {
        Assert.assertEquals("Text not match","Success: You have modified your shopping cart!\n"+"×", new LaptopsAndNotebooksPage().getSuccessModifiedCartMessage());
    }
    @And("^Verify the Total$")
    public void verifyTheTotal() {
        Assert.assertEquals("Text not matched", "£737.45",new LaptopsAndNotebooksPage().getVerifyTotal());

    }

    @And("^User click on checkout button$")
    public void userClickOnCheckoutButton() {
        new LaptopsAndNotebooksPage().clickOnCheckoutButton();
    }

    @Then("^Verify the text Checkout$")
    public void verifyTheTextCheckout() {
        Assert.assertEquals("Text not matched","Checkout",new LaptopsAndNotebooksPage().getCheckoutText());
    }

    @And("^Verify the Text New Customer$")
    public void verifyTheTextNewCustomer() {
        Assert.assertEquals("Text not matched","New Customer",new LaptopsAndNotebooksPage().getNewCustomerText());
    }

    @And("^User Click on Guest Checkout radio button$")
    public void userClickOnGuestCheckoutRadioButton() {
        new LaptopsAndNotebooksPage().clickOnGuestCheckoutRadioButton();
    }

    @And("^User Click on Continue tab$")
    public void userClickOnContinueTab() {
        new LaptopsAndNotebooksPage().clickOnContinueTab();
    }

    @And("^User enter name \"([^\"]*)\"$")
    public void userEnterName(String name)  {
        new LaptopsAndNotebooksPage().enterName(name);
    }

    @And("^User enter last name \"([^\"]*)\"$")
    public void userEnterLastName(String lastName)  {
        new LaptopsAndNotebooksPage().enterLastName(lastName);
    }

    @And("^User enter email \"([^\"]*)\"$")
    public void userEnterEmail(String email)  {
        new LaptopsAndNotebooksPage().enterEmail(email);
    }

    @And("^User enter telephone number \"([^\"]*)\"$")
    public void userEnterTelephoneNumber(String telephone)  {
        new LaptopsAndNotebooksPage().enterTelephone(telephone);
    }

    @And("^user enter address \"([^\"]*)\"$")
    public void userEnterAddress(String address)  {
        new LaptopsAndNotebooksPage().enterAddress(address);
    }

    @And("^User enter city \"([^\"]*)\"$")
    public void userEnterCity(String city)  {
        new LaptopsAndNotebooksPage().enterCity(city);
    }

    @And("^User enter post code \"([^\"]*)\"$")
    public void userEnterPostCode(String postcode)  {
        new LaptopsAndNotebooksPage().enterPostcode(postcode);
    }

    @And("^User enter country \"([^\"]*)\"$")
    public void userEnterCountry(String country)  {
        new LaptopsAndNotebooksPage().enterCountry(country);
    }

    @And("^User enter zone \"([^\"]*)\"$")
    public void userEnterZone(String zone)  {
        new LaptopsAndNotebooksPage().enterZone(zone);
    }

    @And("^User click on continue button$")
    public void userClickOnContinueButton() {
        new LaptopsAndNotebooksPage().clickOnContinueButton();
    }

    @And("^User enter comments to their order in to text area$")
    public void userEnterCommentsToTheirOrderInToTextArea() {
        new LaptopsAndNotebooksPage().enterTextToTextArea("Please confirm delivery date");
    }

    @And("^User click on check box of terms and conditions$")
    public void userClickOnCheckBoxOfTermsAndConditions() {
        new LaptopsAndNotebooksPage().clickOnTermsAndConditionsCheckbox();
    }

    @And("^user click on continue button$")
    public void userClickOnContinueButton1() {
        new LaptopsAndNotebooksPage().clickOnFinalContinueButton();
    }

    @Then("^verify the message Warning: Payment method required!$")
    public void verifyTheMessageWarningPaymentMethodRequired() {
        Assert.assertEquals("Text not matched","Warning: Payment method required!\n"+"×", new LaptopsAndNotebooksPage().getWarningPaymentMethodRequiredText());
    }

}
