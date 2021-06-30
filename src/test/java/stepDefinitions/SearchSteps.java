package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;
import utilities.Constants;
import utilities.Hooks;

import static org.junit.Assert.*;

public class SearchSteps extends BaseSteps {

    private HomePage homePage;

    public SearchSteps(Hooks hooks) {
        super(hooks);
        homePage = new HomePage(hooks.getDriver());
    }

    @Given("the user is on the {string}")
    public void theUserIsOnTheWebSite(String website) {
        driver.get(Constants.BASE_URL);
        homePage.clickOnPopup();
        homePage.clickOnPopupCookies();
        assertTrue(driver.getCurrentUrl().contains(website));
    }

    @When("enter the {string} name in the search field")
    public void enterTheProductNameInTheSearchField(String product) {
        homePage.enterProduct(product);
    }

    @When("select on the {string}")
    public void select_on_the(String item) {
        homePage.selectSuggestedItem(item);
    }
}
