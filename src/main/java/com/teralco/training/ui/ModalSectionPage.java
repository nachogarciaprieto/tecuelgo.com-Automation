package com.teralco.training.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ModalSectionPage extends PageObject {

    public static final Target MODAL_DIALOGS_BTN = Target.the("Button to display the Modal Section").locatedBy("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[5]");

    public static final Target SMALL_MODAL_BTN = Target.the("Button to display the small modal button").locatedBy("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/button[1]");

    public static final Target CLOSE_MODAL_BTN = Target.the("Text to confirm that the alert is closed").locatedBy("/html/body/div[4]/div/div/div[3]/button");

    public static final Target SMALL_MODAL_TXT = Target.the("Text in the modal window").locatedBy("/html/body/div[4]/div/div/div[2]");

}
