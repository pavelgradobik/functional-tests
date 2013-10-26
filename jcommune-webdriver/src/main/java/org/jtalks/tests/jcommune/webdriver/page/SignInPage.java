package org.jtalks.tests.jcommune.webdriver.page;


import net.thucydides.core.pages.PageObject;
import org.jtalks.tests.jcommune.webdriver.JCommuneSeleniumConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SignInPage extends PageObject {

    public static final String usernameFieldSel = "j_username";

    public static final String passwordFieldSel = "j_password";

    public static final String submitButtonSel = "signin-submit-button";

    public static final String submitButtonAfterRegistrationSel = "//input[@type='submit']";

    public static final String rememberMeCheckBoxSel = "//input[@name='_spring_security_remember_me']";

    public static final String restorePasswordLinkSel = "//div[@class='form_controls']/a[@href='" + JCommuneSeleniumConfig.JCOMMUNE_CONTEXT_PATH + "/password/restore']";

    public static final String signInDialogFormSel = "signin-modal-dialog";

    public static final String signInPageFormSel = "login-form";

    public static final String errorMessageSel = "//span[@class='help-inline']";

    public static final String emailFieldToRestoreSel = "userEmail";

    public static final String sendButtonToRestoreSel = "//button[@type='submit']";

    public static final String notValidEmailErrorMessageSel = "userEmail.errors";

    public static final String closeSignInWindowButtonSel = "//div[@class='jqiclose']";

    public static final String errorFormElementsSel = "div.control-group.error";

    public static final String LOGIN_ERROR = "Имя пользователя: \n" +
            "Пароль: Попытка выполнить вход не удалась, попробуйте еще раз\n";


    @FindBy(id = usernameFieldSel)
    WebElement usernameField;

    @FindBy(id = passwordFieldSel)
    WebElement passwordField;

    @FindBy(id = submitButtonSel)
    WebElement submitButton;

    @FindBy(xpath = submitButtonAfterRegistrationSel)
    WebElement submitButtonAfterRegistration;

    @FindBy(xpath = rememberMeCheckBoxSel)
    WebElement rememberMeCheckBox;

    @FindBy(xpath = restorePasswordLinkSel)
    WebElement restorePasswordLink;

    @FindBy(id = signInDialogFormSel)
    WebElement signInDialogForm;

    @FindBy(id = signInPageFormSel)
    WebElement signInPageForm;

    @FindBy(xpath = errorMessageSel)
    WebElement errorMessage;

    @FindBy(id = emailFieldToRestoreSel)
    WebElement emailFieldToRestore;

    @FindBy(xpath = sendButtonToRestoreSel)
    WebElement sendButtonToRestore;

    @FindBy(id = notValidEmailErrorMessageSel)
    WebElement notValidEmailErrorMessage;

    @FindBy(xpath = closeSignInWindowButtonSel)
    WebElement closeSignInWindowButton;

    @FindBy(css = errorFormElementsSel)
    List<WebElement> errorFormElements;

    public SignInPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getUsernameField() {
        return usernameField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public WebElement getSubmitButtonAfterRegistration() {
        return submitButtonAfterRegistration;
    }

    public WebElement getRememberMeCheckBox() {
        return rememberMeCheckBox;
    }

    public WebElement getRestorePasswordLink() {
        return restorePasswordLink;
    }

    public WebElement getSignInDialogForm() {
        return signInDialogForm;
    }

    public WebElement getErrorMessage() {
        return errorMessage;
    }

    public WebElement getEmailFieldToRestore() {
        return emailFieldToRestore;
    }

    public WebElement getSendButtonToRestore() {
        return sendButtonToRestore;
    }

    public WebElement getNotValidEmailErrorMessage() {
        return notValidEmailErrorMessage;
    }

    public WebElement getCloseSignInWindowButton() {
        return closeSignInWindowButton;
    }

    public WebElement getSignInPageForm() {
        return signInPageForm;
    }

    public List<WebElement> getErrorFormElements() {
        return errorFormElements;
    }
}
