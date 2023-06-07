package com.teralco.training.model;

import java.util.Random;

public class AlertTextDataBuilder {

    public static AlertTextDto build(AlertTextDataTypes alertTextDataTypes) {

        AlertTextDto alertTextDto;

        switch (alertTextDataTypes) {

            case VALID:
                alertTextDto = new AlertTextDto("sampleText");
                break;

            case WITHOUT_MANDATORY:
                alertTextDto = new AlertTextDto("");
                break;

            case SYMBOLS:
                alertTextDto = new AlertTextDto("*******");
                break;

            default:
                alertTextDto = new AlertTextDto("default");
        }


        return alertTextDto;
    }

    private static String getRandomNumber() {
        Random r = new Random();
        int low = 0;
        int high = 999999;
        return String.valueOf(r.nextInt(high - low) + low);
    }

}
