package com.teralco.training.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterSectionPage extends PageObject {

    public static final Target USERFORM_FIELD = Target.the("Field to set the firstname").locatedBy("#userform");

    public static final Target FIRSTNAME_FIELD = Target.the("Field to set the firstname").locatedBy("#firstname");

    public static final Target LASTNAME_FIELD = Target.the("Field to set the lastname").locatedBy("#lastname");

    public static final Target USERNAME_FIELD = Target.the("Field to set the username").locatedBy("#userName");

    public static final Target PASSWORD_FIELD = Target.the("Field to set the password").locatedBy("#password");

    public static final Target CAPTCHA_CHECK = Target.the("Check box to confirm the captcha").locatedBy("#recaptcha-anchor > div.recaptcha-checkbox-border");

    public static final Target REGISTER_BTN = Target.the("Button to send the register data").locatedBy("#register");

    public static final Target BACKTOLOGIN_BTN = Target.the("Button to go to login page").locatedBy("#gotologin");

}
