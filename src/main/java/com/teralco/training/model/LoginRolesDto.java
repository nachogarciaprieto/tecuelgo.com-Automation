package com.teralco.training.model;

public class LoginRolesDto {


    private final String username;
    private final String password;

    public LoginRolesDto(String username, String password) {

        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }



}
