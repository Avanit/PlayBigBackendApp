package com.asaneasa.sports.playbigbackend.responses;

import java.math.BigDecimal;

/**
 * Created by adi2ky on 3/13/16.
 */
public class UserResponse {
    private String firstName;
    private String lastName;
    private BigDecimal virtualBalance;

    public String getFirstName() {
        return firstName;
    }

    public UserResponse setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserResponse setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public BigDecimal getVirtualBalance() {
        return virtualBalance;
    }

    public UserResponse setVirtualBalance(BigDecimal virtualBalance) {
        this.virtualBalance = virtualBalance;
        return this;
    }
}
