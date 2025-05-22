package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import pages.Base_PO;
import pages.LoginPage;

public class LoginSteps extends Base_PO {
    private LoginPage loginPage;
    public LoginSteps (LoginPage loginPage){
        this.loginPage = loginPage;
    }

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        loginPage.navigateTo_practiceTestAutomation_LoginPage();
    }

    @When("User enters username {word}")
    public void userEntersValidUsername(String username) {
        loginPage.setUsername(username);
    }

    @And("User enters password {word}")
    public void userEntersValidPassword(String password) {
        loginPage.setPassword(password);
    }

    @And("clicks the login button")
    public void clicks_the_login_button() {
        loginPage.clickOn_SubmitButton();
    }

    @And("User should be presented with a Header1 Login Success Message")
    public void user_should_be_presented_with_a_header1_login_success_message() {
        loginPage.verifyText_loginSuccessMessage1();
    }

    @And("User should be presented with a Header2 Login Success Message")
    public void user_should_be_presented_with_a_header2_login_success_message() {
        loginPage.verifyText_loginSuccessMessage2();
    }

    @And("User is able to Logout")
    public void user_is_able_to_logout() {
        loginPage.clickOn_logoutButton();
    }

    @Then("User is returned to the login page")
    public void user_is_returned_to_the_login_page() {
        loginPage.verifyText_HomeLoginPage();
    }

    @Then("User should be presented with an Invalid Username Error Message")
    public void user_should_be_presented_with_an_invalid_username_error_message() {
        loginPage.verifyText_loginUsernameErrorMessage();
    }

    @Then("User should be presented with an Invalid Password Error Message")
    public void user_should_be_presented_with_an_invalid_password_error_message() {
        loginPage.verifyText_loginPasswordErrorMessage();
    }
}


