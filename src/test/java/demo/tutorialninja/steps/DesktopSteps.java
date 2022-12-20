package demo.tutorialninja.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demo.tutorialninja.pages.DesktopPage;
import org.junit.Assert;

public class DesktopSteps {

    @Given("^I am on home page$")
    public void iAmOnHomePage() {

    }

    @And("^I click on currency link$")
    public void iClickOnCurrencyLink() {
        new DesktopPage().clickOnCurrencyLink();

    }

    @When("^I mouse hover on Desktops tab and click on it$")
    public void iMouseHoverOnDesktopsTabAndClickOnIt() {
        new DesktopPage().mouseHoverOnDesktop();
    }

    @And("^I click on show all desktops$")
    public void iClickOnShowAllDesktops() {
        new DesktopPage().clickOnShowAllDesktop();
    }

    @Then("^I select sort by position name z to a$")
    public void iSelectSortByPositionNameZToA() {
        new DesktopPage().sortByPositionNameZtoA("Name (Z - A)");
    }

    @And("^I should see the products are arranged in Descending order$")
    public void iShouldSeeTheProductsAreArrangedInDescendingOrder() {
        new DesktopPage().getProductsArrangeInDescendingOrderText();
    }

    @And("^I select sort by position name A to Z$")
    public void iSelectSortByPositionNameAToZ() {
        new DesktopPage().sortByPositionNameAtoZ("Name (A - Z)");
    }


    @And("^I click on Product HPLP$")
    public void iClickOnProductHPLP3065() {
        new DesktopPage().clickOnProductHPLP3065();
    }

    @Then("^I verify the text HP LP(\\d+)$")
    public void iVerifyTheTextHPLP3065() {
        Assert.assertEquals("Text not displayed","HP LP3065",new DesktopPage().getHPLP3065TextFromList());
    }

    @And("^I select delivery date (\\d+)-(\\d+)-(\\d+)$")
    public void iSelectDeliveryDate() {
        new DesktopPage().clickOnDeliveryDate();
    }

    @And("^I enter quantity (\\d+)$")
    public void iEnterQuantity() {
        new DesktopPage().enterQuantity1("1");
    }

    @And("^I click on add to cart button$")
    public void iClickOnAdToCartButton() {
        new DesktopPage().clickOnAdToCart();
    }

    @Then("^I verify the message Success: You have added HP LP(\\d+) to your shopping cart!$")
    public void iVerifyTheMessageSuccessYouHaveAddedHPLPToYourShoppingCart(int arg0) {

    }


    @And("^I click on shopping cart display in to success message$")
    public void iClickOnShoppingCartDisplayInToSuccessMessage() {
        new DesktopPage().clickOnShoppingCart();
    }


    @And("^I verify text shopping cart$")
    public void iVerifyTextShoppingCart() {
        Assert.assertEquals("Text does not match", new DesktopPage().verifyTextShoppingCart(),"Shopping Cart  (1.00kg)");
    }

    @And("^I verify the product name$")
    public void iVerifyTheProductName() {
        Assert.assertEquals("Text does not match", new DesktopPage().verifyTextProductNameHPLP3065(),"HP LP3065");
    }

    @And("^I verify delivery date$")
    public void iVerifyDeliveryDate() {
        Assert.assertEquals("Text does not match", new DesktopPage().verifyDeliveryDate(),"Delivery Date: 2023-11-30");
    }

    @And("^I verify the model$")
    public void iVerifyTheModel() {
        Assert.assertEquals("Text not displayed", new DesktopPage().verifyTheModelProduct21Text(),"Product 21");
    }

    @And("^I verify Total amount$")
    public void iVerifyTotalAmount() {
        Assert.assertEquals("Total does not match", new DesktopPage().verifyTheTotalPriceText(),"£74.73");
    }


}
