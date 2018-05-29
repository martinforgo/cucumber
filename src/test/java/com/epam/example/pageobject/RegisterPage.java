package com.epam.example.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {
    @FindBy(id = "submitAccount")
    public WebElement submitButton;

    @FindBy(id = "customer_firstname")
    public WebElement customerFirstNameField;

    @FindBy(id = "customer_lastname")
    public WebElement customerLastNameField;
    
    @FindBy(id = "passwd")
    public WebElement pwdField;
    
    @FindBy(id = "firstname")
    public WebElement firstNameField;
    
    @FindBy(id = "lastname")
    public WebElement lastNameField;
    
    @FindBy(id = "address1")
    public WebElement addressField;
    
    @FindBy(id = "city")
    public WebElement cityField;
    
    @FindBy(id = "postcode")
    public WebElement zipField;
    
    @FindBy(id = "phone_mobile")
    public WebElement mobileField;    
   
    @FindBy(id = "alias")
    public WebElement aliasField;

    @FindBy(id = "id_state")
    public WebElement idState;
    
    
}
