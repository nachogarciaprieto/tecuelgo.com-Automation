package com.teralco.training.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AdministratorMenuSectionPage extends PageObject {


    public static final Target USER_ADMIN_BUTTON = Target.the("Button to admin the users").locatedBy("#editarUsuarios");
    public static final Target CLOSE_SESSION_BTN = Target.the("Button to close the session").locatedBy("#cerrarSesion");



}
