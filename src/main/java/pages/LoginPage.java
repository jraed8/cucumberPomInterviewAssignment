package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.Global_Vars;

public class LoginPage extends Base_PO{

    //**TEXT_FIELDS**//
    private @FindBy(id = "username") WebElement username_TextField;
    private @FindBy(xpath = "//input[@id='password']") WebElement password_TextField;

    //**TEXT_MESSAGES**//
    private @FindBy(xpath = "//section[@id='login']/h2") WebElement homePageLogin_Message;
    private @FindBy(className = "post-title") WebElement loggedInSuccessfully_Message1;
    private @FindBy(xpath = "//p[@class='has-text-align-center']/strong") WebElement loggedInSuccessfully_Message2;
    private @FindBy(id = "error") WebElement loginError_Message;

    //**BUTTONS**//
    private @FindBy(id = "submit") WebElement submit_Button;
    private @FindBy(linkText= "Log out")WebElement logout_Button;

    public LoginPage(){
        super();
    }

    public void navigateTo_practiceTestAutomation_LoginPage() {
        navigateTo_URL(Global_Vars.PracticeTestAutomation_HOMEPAGE + "/practice-test-login/");
    }

    public void setUsername(String username) {
        sendKeys(username_TextField, username);
    }
    public void setPassword(String password){
        sendKeys(password_TextField, password);
    }

    public void clickOn_SubmitButton(){
        waitForWebElementAndClick(submit_Button);
    }

    public void verifyText_loginSuccessMessage1(){
        waitFor(loggedInSuccessfully_Message1);
        Assert.assertEquals(loggedInSuccessfully_Message1.getText(), "Logged In Successfully");
    }

    public void verifyText_loginSuccessMessage2(){
        waitFor(loggedInSuccessfully_Message2);
        Assert.assertEquals(loggedInSuccessfully_Message2.getText(), "Congratulations student. You successfully logged in!");
    }

    public void clickOn_logoutButton(){
        waitForWebElementAndClick(logout_Button);
    }

    public void verifyText_HomeLoginPage(){
        waitFor(homePageLogin_Message);
        Assert.assertEquals(homePageLogin_Message.getText(), "Test login");
    }

    public void verifyText_loginUsernameErrorMessage(){
        waitFor(loginError_Message);
        Assert.assertEquals(loginError_Message.getText(), "Your username is invalid!");
    }

    public void verifyText_loginPasswordErrorMessage(){
        waitFor(loginError_Message);
        Assert.assertEquals(loginError_Message.getText(), "Your password is invalid!");
    }
}
