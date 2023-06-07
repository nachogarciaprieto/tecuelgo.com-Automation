package com.teralco.training.model;

public class RegisterTextDto {

    private final String firstname;
    private final String lastname;
    private final String username;
    private final String password;

    public RegisterTextDto(String firstname, String lastname, String username, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
    }

    public String getfirstname() {
        return firstname;
    }

    public String getlastname() {
        return lastname;
    }

    public String getusername() {
        return username;
    }

    public String getpassword() {
        return password;
    }



}
