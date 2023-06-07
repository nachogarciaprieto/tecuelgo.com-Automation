package com.teralco.training.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://10.40.99.85/masters/map/")
public class DropDownOptionsMenuPage extends PageObject {

    public static final Target LOG_OUT_BTN = Target.the("Log out the user").locatedBy("#settings__logout-button");
    //public static final Target LOGIN_LEFT_MENU_BTN = Target.the("Go to login section component").locatedBy("//*[@id=\"item-0\"]");

}
