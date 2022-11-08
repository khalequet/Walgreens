package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.register_page;

public class register_stepDef extends Config {

    register_page RP = new register_page(driver);
    @Given("I am at the walgreens homepage")
    public void iAmAtTheWalgreensHomepage() {
        RP.verifyHomePageTitle();
    }

    @And("I click on Account")
    public void iClickOnAccount() {
        RP.clickAccount();
    }

    @And("I click on Register")
    public void iClickOnRegister() {
        RP.clickRegister();
    }

    @And("I enter valid First Name")
    public void iEnterValidFirstName(String firstname) {
       RP.enterfirstName(firstname);
    }


    @And("I enter valid Last Name")
    public void iEnterValidLastName() {
    }

    @And("I enter valid Email Address")
    public void iEnterValidEmailAddress() {
    }

    @And("I enter valid Password")
    public void iEnterValidPassword() {
    }

    @And("I click on I read and agree to the Walgreens terms of use")
    public void iClickOnIReadAndAgreeToTheWalgreensTermsOfUse() {
    }

    @When("I click on continue button")
    public void iClickOnContinueButton() {
    }

    @Then("I should be able to create an account")
    public void iShouldBeAbleToCreateAnAccount() {
    }
}
