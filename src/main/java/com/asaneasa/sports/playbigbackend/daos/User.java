package com.asaneasa.sports.playbigbackend.daos;

import com.asaneasa.sports.playbigbackend.daos.enums.UserStatus;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by adi2ky on 3/13/16.
 */
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    private UserStatus status;
    private String firstName;
    private String lastName;
    private String note;
    private BigDecimal virtualBalance;

    public int getUserId() {
        return userId;
    }

    public User setUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public UserStatus getStatus() {
        return status;
    }

    public User setStatus(UserStatus status) {
        this.status = status;
        return this;
    }

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

    public String getNote() {
        return note;
    }

    public User setNote(String note) {
        this.note = note;
        return this;
    }

    public BigDecimal getVirtualBalance() {
        return virtualBalance;
    }

    public User setVirtualBalance(BigDecimal virtualBalance) {
        this.virtualBalance = virtualBalance;
        return this;
    }
}
