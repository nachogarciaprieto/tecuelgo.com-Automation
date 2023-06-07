package com.teralco.training.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://tecuelgo.com")
public class HomePage extends PageObject {






    public static final Target FORM_SECTION_BTN = Target.the("Go to forms section component").locatedBy("#app > div > div > div.home-body > div > div:nth-child(2)");
   // public static final Target BOOK_STORE_APLICATION_BTN = Target.the("Go to forms section component").locatedBy("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[6]/span/div/div[1]");
    public static final Target LOGIN_LEFT_MENU_BTN = Target.the("Go to login section component").locatedBy("//*[@id=\"item-0\"]");
    public static final Target LOGIN_BTN = Target.the("Go to forms section component").locatedBy("//*[@id=\"item-0\"]");
    public static final Target NEW_USER_BTN = Target.the("Go to register section component").locatedBy("#newUser");

    public static final Target CHECKBOX_SECTION_BTN = Target.the("Go to check box section component").locatedBy("#item-1 > span");

    public static final Target ELEMENTS_BTN = Target.the("Drop down the elements menu").locatedBy("#app > div > div > div.home-body > div > div:nth-child(1)");


    public static final Target WEB_TABLES_BTN = Target.the("Drop down the elements menu").locatedBy("#item-3");

    public static final Target ALERTS_FRAMES_WINDOWS_BTN = Target.the("Drop down the alerts, frame and windows menu").locatedBy("#app > div > div > div.home-body > div > div:nth-child(3)");

    public static final Target ALERTS_BTN = Target.the("Go to alerts section component").locatedBy("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[2]");

    public static final Target ELEMENTS_BTN_2 = Target.the("Go to alerts section component").locatedBy("#app > div > div > div.row > div:nth-child(1) > div > div > div:nth-child(1) > span > div > div.header-text");

}
