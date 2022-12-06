package com.ultimateqa.courses.testsuite;


import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.pages.SignInPage;
import com.ultimateqa.courses.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    HomePage homePage = new HomePage();
    SignInPage signInPage = new SignInPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        homePage.clickOnSignInLink();
        String expectedMessage = "Welcome Back!";
        String actualMessage = signInPage.getWelcomeBackText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login Page not displayed");
    }

    @Test
    public void verifyTheErrorMessage() {
        homePage.clickOnSignInLink();
        String expectedMessage = "Welcome Back!";
        String actualMessage = signInPage.getWelcomeBackText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login Page not displayed");
        signInPage.enterEmailID("Primer123");
        signInPage.enterPassword("Clock123");
        signInPage.clickLoginInButton();
        String expectedMessage1 = "Invalid email or password.";
        String actualMessage1 = signInPage.getErrorMessage();
        Assert.assertEquals(expectedMessage1, actualMessage1, "User has not logged in successfully");
    }

}