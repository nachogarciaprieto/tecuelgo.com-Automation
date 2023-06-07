package com.teralco.training.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class TextBoxSectionPage extends PageObject {

    public static final Target ELEMENTS_BTN = Target.the("Button to display all sections").locatedBy("#app > div > div > div.row > div:nth-child(1) > div > div > div:nth-child(1) > span");

    public static final Target TEXT_BOX_BTN = Target.the("Button to open the text box section").locatedBy("#item-0");

    public static final Target USERNAME_FIELD = Target.the("Field to set the username").locatedBy("#userName");

    public static final Target EMAIL_FIELD = Target.the("Field to set the userEmail").locatedBy("#userEmail");

    public static final Target CURRENT_ADDRESS_FIELD = Target.the("Field to set the current address").locatedBy("#currentAddress");
    public static final Target PERMANENT_ADDRESS_FIELD = Target.the("Field to set the current address").locatedBy("#permanentAddress");

    public static final Target SUBMIT_BTN = Target.the("Button to send the form data").locatedBy("#submit");

    public static final Target OUTPUT_FIELD = Target.the("Output with de inserted data").locatedBy("#output");


}
