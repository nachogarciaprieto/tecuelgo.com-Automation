package com.teralco.training.model;

import java.util.Random;

public class LoginRolesDataBuilder {

    public static LoginRolesDto build(LoginRolesDataTypes loginRolesDataTypes) {

        LoginRolesDto loginRolesDto;

        switch (loginRolesDataTypes) {

            case ADMINISTRATOR:
                loginRolesDto = new LoginRolesDto("admin@tecuelgo.com", "1234php");
                break;

            case VENDOR:
                loginRolesDto = new LoginRolesDto("vendedor@tecuelgo.com", "5678php");
                break;

            case CLIENT:
                loginRolesDto = new LoginRolesDto("cliente@tecuelgo.com", "9012php");
                break;



            default:
                loginRolesDto = new LoginRolesDto("default", "default");
        }


        return loginRolesDto;
    }

    private static String getRandomNumber() {
        Random r = new Random();
        int low = 0;
        int high = 999999;
        return String.valueOf(r.nextInt(high - low) + low);
    }

}
