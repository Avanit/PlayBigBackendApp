package com.asaneasa.sports.playbigbackend.daos;

import com.asaneasa.sports.playbigbackend.daos.enums.UserStatus;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by adi2ky on 3/13/16.
 */
@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    @Enumerated(EnumType.STRING)
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
