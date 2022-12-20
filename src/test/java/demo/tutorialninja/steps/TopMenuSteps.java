package demo.tutorialninja.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demo.tutorialninja.pages.TopMenuPage;
import org.junit.Assert;

public class TopMenuSteps {
    @When("^I click on Desktop$")
    public void iClickOnDesktop() {
        new TopMenuPage().mouseHoverToElementAndClickOnDesktop();
    }

    @And("^I select show all desktop$")
    public void iSelectShowAllDesktop() {
        new TopMenuPage().selectMenu("Show All Desktops");
    }

    @Then("^verify user is on desktop page$")
    public void verifyUserIsOnDesktopPage() {
        Assert.assertEquals("Desktops","Desktops",new TopMenuPage().getTextDesktop());
    }

    @When("^I click on Laptop and notebook$")
    public void iClickOnLaptopAndNotebook() {
        new TopMenuPage().mouseHoverOnLaptopsAndNotebooksTab();
    }

    @And("^I select show all Laptop and notebook$")
    public void iSelectShowAllLaptopAndNotebook() {
        new TopMenuPage().selectMenu("Show All Laptops & Notebooks");
    }

    @Then("^verify user is on Laptop and notebook page$")
    public void verifyUserIsOnLaptopAndNotebookPage() {
        Assert.assertEquals("Laptops & Notebooks not displayed","Laptops & Notebooks",new TopMenuPage().getLaptopsAndNotebooksText());
    }

    @When("^I click on Components$")
    public void iClickOnComponents() {
        new TopMenuPage().mouseHoverToComponentsTab();
    }

    @And("^I select show all Components$")
    public void iSelectShowAllComponents() {
        new TopMenuPage().selectMenu("Show All Components");
    }

    @Then("^verify user is on Components page$")
    public void verifyUserIsOnComponentsPage() {
        Assert.assertEquals("Components not displayed","Components",new TopMenuPage().getComponentsText());
    }
}
