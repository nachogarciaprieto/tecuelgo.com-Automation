package com.teralco.training.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginSectionPage extends PageObject {


    public static final Target USERNAME_FIELD = Target.the("Field to set the username").locatedBy("#login_email");

    public static final Target PASSWORD_FIELD = Target.the("Field to set the password").locatedBy("#login_password");

    public static final Target LOGIN_BTN = Target.the("Button to login in the system").locatedBy("#login_submit");


}
