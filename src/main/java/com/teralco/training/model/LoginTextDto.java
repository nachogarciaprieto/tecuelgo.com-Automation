package com.teralco.training.model;

public class LoginTextDto {


    private  String username;
    private  String password;

    public LoginTextDto(String username, String password) {

        this.username = username;
        this.password = password;
    }

    public LoginTextDto() {

    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }



}
