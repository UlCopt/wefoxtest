package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProductDetailPage;
import utilities.Constants;
import utilities.Hooks;

import static org.junit.Assert.assertEquals;

public class ProductDetailSteps extends BaseSteps {

    private ProductDetailPage productDetailPage;

    public ProductDetailSteps(Hooks hooks) {
        super(hooks);
        productDetailPage = new ProductDetailPage(hooks.getDriver());
    }

    @When("the user is able to see the product detail")
    public void theUserIsAbleToSeeTheProductDetail() {
        productDetailPage.productTitleIsVisible();
        assertEquals(productDetailPage.getProductTitle(), Constants.EXPECTED_PRODUCT_TITLE);
    }

    @Then("add the product in the bag")
    public void addTheProductInTheBag() {
        productDetailPage.clickBagButton();
        productDetailPage.modalBagIsVisible();
        assertEquals(productDetailPage.getTextItemProduct(), Constants.EXPECTED_PRODUCT_TITLE);
        productDetailPage.clickContinueShoppingButton();
    }
}
