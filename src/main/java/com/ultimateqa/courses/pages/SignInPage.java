package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class SignInPage extends Utility {

    By welcomeBackText = By.xpath("//h2[contains(text(),'Welcome Back!')]");
    By userNameField = By.xpath("//input[@id='user[email]");
    By passwordField = By.xpath("//input[@id='user[password]");
    By loginButton = By.xpath("//input[@class='button button-primary g-recaptcha']");
    By errorMessage = By.xpath("//li[contains(text(),'Invalid email or password.')]");

    public String getWelcomeBackText(){
        return getTextFromElement(welcomeBackText);
    }

    public void enterEmailID(String username){
        sendTextToElement(userNameField, username);
    }

    public void enterPassword(String password){
        sendTextToElement(passwordField, password);
    }

    public void clickLoginInButton(){
        clickOnElement(loginButton);
    }

    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }
}
