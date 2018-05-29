package com.epam.example.stepdefs;

import static com.epam.example.stepdefs.Hooks.driver;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import com.epam.example.pageobject.RegisterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPageStepDefs {
	
    private RegisterPage regPage = PageFactory.initElements(driver, RegisterPage.class);
    
    @When("^I fill in the (.+) and (.+) and (.+) and (.+) and (.+) and (.+) and (.+) and (.+) fields on the register page$")
    public void I_fill_in_the_reg_field(String firstName, String lastName, String pwd, String addr, String city, String zip, String mobile, String alias) {
        regPage.firstNameField.sendKeys(firstName);
        regPage.lastNameField.sendKeys(lastName);
        regPage.pwdField.sendKeys(pwd);
        regPage.addressField.sendKeys(addr);
        regPage.cityField.sendKeys(city);
        regPage.zipField.sendKeys(zip);
        regPage.mobileField.sendKeys(mobile);
        regPage.aliasField.clear();
        regPage.aliasField.sendKeys(alias);
    }
    
    @And("^I select the (.+) option from the state select field on the register page$")
    public void I_select_the_option(String option) {
        Select dropDown = new Select(regPage.idState);
        dropDown.selectByVisibleText(option);
    }
    
    @Then("^I redirect to the register page$")
    public void I_redirect_to_the_register_page() {
        regPage.submitButton.isDisplayed();
    }

}
