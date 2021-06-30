package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css="[data-test='search-input']") WebElement searchField;
    @FindBy(css="[data-test='age-gate-grown-up-cta']") WebElement popUp;
    @FindBy(css="[data-test='cookie-accept-all']") WebElement popupCookies;
    @FindBy(css= "#desktop-search-search-suggestions li") List<WebElement> listSuggestItems;

    public void clickOnPopup(){
        waitForElementIsVisible(popUp);
        popUp.click();

    }

    public void clickOnPopupCookies(){
        waitForElementIsVisible(popupCookies);
        popupCookies.click();
    }

    public void enterProduct(String product){
        waitForElementIsVisible(searchField);
        searchField.sendKeys(product);
    }

    public void selectSuggestedItem(String suggestedItem){
        waitForListElementIsVisible(listSuggestItems);
        for (int i=0; i<listSuggestItems.size(); i++){
            String SUGGESTED_ITEM = listSuggestItems.get(i).getText();
            if (SUGGESTED_ITEM.contains(suggestedItem)){
                listSuggestItems.get(i).click();
                break;
            }
        }
    }

    private void waitForElementIsVisible(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    private void waitForListElementIsVisible(List<WebElement> list){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElements(list));
    }


}
