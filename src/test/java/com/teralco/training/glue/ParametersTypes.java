package com.teralco.training.glue;

import com.teralco.training.model.LoginRolesDataTypes;
import io.cucumber.java.ParameterType;
import org.junit.runners.Parameterized;

public class ParametersTypes {

    @ParameterType("ADMINISTRATOR|VENDOR|CLIENT")
    public LoginRolesDataTypes loginRolesDataTypes(String loginRolesDataTypes) {
        return LoginRolesDataTypes.valueOf(loginRolesDataTypes);
    }






}
