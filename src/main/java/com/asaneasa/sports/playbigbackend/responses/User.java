package com.asaneasa.sports.playbigbackend.responses;

/**
 * Created by adi2ky on 3/13/16.
 */
public class User {
    private String firstName;
    private String lastName;
    private String virtualBalance;

    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getVirtualBalance() {
        return virtualBalance;
    }

    public User setVirtualBalance(String virtualBalance) {
        this.virtualBalance = virtualBalance;
        return this;
    }
}
