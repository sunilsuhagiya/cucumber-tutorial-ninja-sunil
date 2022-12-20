package demo.tutorialninja.pages;

import demo.tutorialninja.browserfactory.ManageBrowser;
import demo.tutorialninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());
    public DesktopPage() {
        PageFactory.initElements(ManageBrowser.driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Currency')]")
    WebElement currencyLink;

    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopsTab;

    @CacheLookup
    @FindBy(linkText = "Show All Desktops")
    WebElement showAllDesktop;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-sort']")
    WebElement sortByNameZtoA;

    @CacheLookup
    @FindBy(xpath = "//h4/a")
    WebElement productsInDescendingOrderText;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-sort']")
    WebElement sortByNameAtoZ;

    @CacheLookup
    @FindBy(linkText = "HP LP3065")
    WebElement productHpLP3065;


    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'HP LP3065')]")
    WebElement getHPLP3065Text;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'input-group date']//button")
    WebElement deliveryDate;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-quantity']")
    WebElement enterQuantity;

    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCart;


    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement getProductAddedToShoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping Cart')]")
    WebElement shoppingCart;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']//h1")
    WebElement getShoppingCartText;

    @CacheLookup
    @FindBy(linkText = "HP LP3065")
    WebElement getHPLP3065Message;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]")
    WebElement getDeliveryDateText;

    @CacheLookup
    @FindBy(xpath = "//td[contains(text(),'Product 21')]")
    WebElement getProduct21Text;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[6]")
    WebElement getTotalPriceText;

    public void clickOnCurrencyLink(){
        log.info("click on currency link" +currencyLink.toString());
        clickOnElement(currencyLink);
        List<WebElement> currencyList = ManageBrowser.driver.findElements(By.xpath("//ul[@class = 'dropdown-menu']/li"));
        for (WebElement e : currencyList) {
            if (e.getText().equalsIgnoreCase("£ Pound Sterling")) {
                e.click();
                break;
            }
        }
    }
    public void mouseHoverOnDesktop(){
        log.info("Mouse Hover On Desktop" + desktopsTab.toString());
        mouseHoverToElementAndClick(desktopsTab);
    }
    public void clickOnShowAllDesktop(){
        log.info("click On Show All Desktop" + showAllDesktop.toString());
        clickOnElement(showAllDesktop);
    }
    public void sortByPositionNameZtoA(String text){
        log.info("Sort " + text + " By Position NameZtoA" + sortByNameZtoA.toString());
        selectByVisibleTextFromDropDown(sortByNameZtoA,text);
    }
    public void getProductsArrangeInDescendingOrderText(){
        // Get all the products name and stored into array list
        List<WebElement> products = ManageBrowser.driver.findElements(By.xpath("//h4/a"));
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        // Sort By Reverse order
        Collections.reverse(originalProductsName);
        System.out.println(originalProductsName);
        // Select sort by Name Z - A
        selectByVisibleTextFromDropDown(By.id("input-sort"), "Name (Z - A)");
        // After filter Z -A Get all the products name and stored into array list
        products = ManageBrowser.driver.findElements(By.xpath("//h4/a"));
        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());
        }
        System.out.println(afterSortByZToAProductsName);
        //Assert.assertEquals("Product not sorted into Z to A order",
        //  originalProductsName, afterSortByZToAProductsName);

    }
    public void sortByPositionNameAtoZ(String text){
        log.info("Sort " + text + " By Position NameAtoZ" + sortByNameAtoZ.toString());
        selectByVisibleTextFromDropDown(sortByNameAtoZ,text);
    }
    public void clickOnProductHPLP3065(){
        log.info("Click On Product HPLP3065" + productHpLP3065.toString());
        clickOnElement(productHpLP3065);
    }
    public String getHPLP3065TextFromList(){
        log.info("Get HPLP3065Text From List" + getHPLP3065Text.getText());
        return getTextFromElement(getHPLP3065Text);
    }
    public void clickOnDeliveryDate(){
        log.info("Select Delivery Date" );
        String year = "2023";
        String month = "November";
        String date = "30";
        clickOnElement(By.xpath("//div[@class = 'input-group date']//button"));
        //desktops.selectDeliveryDate();
        //clickOnElement(By.xpath("//div[@class = 'input-group date']//button"));
        while (true) {
            String monthAndYear = ManageBrowser.driver.findElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")).getText();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']"));
            }
        }
        List<WebElement> allDates = ManageBrowser.driver.findElements(By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']"));
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }

    }
    public void enterQuantity1(String  num){
        log.info("enter Quantity1" + enterQuantity.toString());
        ManageBrowser.driver.findElement(By.xpath("//input[@id='input-quantity']")).clear();
        sendTextToElement(enterQuantity,num);

    }
    public void clickOnAdToCart() {
        log.info("Click On Add To Cart" + addToCart.toString());
        clickOnElement(addToCart);

    }
    public String verifyProductAddedToShoppingCartText(){
        log.info("verifyProductAddedToShoppingCartText" + getProductAddedToShoppingCartText.getText());
        return getTextFromElement(getProductAddedToShoppingCartText);
    }
    public void clickOnShoppingCart(){
        log.info("clickOnShoppingCart" + shoppingCart.toString());
        clickOnElement(shoppingCart);
    }
    public String verifyTextShoppingCart(){
        log.info("Verify Text ShoppingCart" + getShoppingCartText.getText());
        return getTextFromElement(getShoppingCartText);
    }
    public String verifyTextProductNameHPLP3065(){
        log.info("VerifyTextProductNameHPLP3065" + getHPLP3065Message.getText());
        return getTextFromElement(getHPLP3065Message);
    }
    public String verifyDeliveryDate(){
        log.info("verifyDeliveryDate" + getDeliveryDateText.getText());
        return getTextFromElement(getDeliveryDateText);
    }
    public String verifyTheModelProduct21Text(){
        log.info("Verify TheModelProduct21 Text" + getProduct21Text.getText());
        return getTextFromElement(getProduct21Text);
    }
    public String verifyTheTotalPriceText(){
        log.info("verifyTheTotalPriceText" + getTotalPriceText.getText());
        return getTextFromElement(getTotalPriceText);
    }
}


