package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage {

    private WebDriver driver;

    public ProductDetailPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css="[data-test='product-overview-name']") WebElement productTitle;
    @FindBy(css="[data-test='add-to-bag']") WebElement addToBagButton;
    @FindBy(css="[data-test='add-to-bag-modal']") WebElement modalBag;
    @FindBy(css="[data-test='continue-shopping-button']") WebElement continueShoppingButton;
    @FindBy(css="[class='Text__BaseText-aa2o0i-0 ciifUl AddToBagModalstyles__StyledText-thtx66-11 bokQzA']") WebElement productBagTitle;


    public String getProductTitle(){
        return productTitle.getText();
    }

    public void clickBagButton(){
        addToBagButton.click();
    }

    public boolean productTitleIsVisible(){
        return  productTitle.isDisplayed();
    }
    public boolean modalBagIsVisible(){
        return modalBag.isDisplayed();
    }

    public void clickContinueShoppingButton(){
        continueShoppingButton.click();
    }

    public String getTextItemProduct(){
        return productTitle.getText();
    }


}
