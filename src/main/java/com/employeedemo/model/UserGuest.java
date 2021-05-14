package com.employeedemo.model;

/* AUTHOR: LILI MP
 * NC TRAINEE PROGRAM
 * PROJECT: CAR RENTAL SYSTEM TBW
 */

import com.sun.istack.internal.NotNull;

import javax.persistence.*;


@Entity
@Table(name = "users_guest")
public class UserGuest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUserGuest;

    @NotNull
    @Column(name = "FIRST_NAME")
    private String firstName;

    @NotNull
    @Column(name = "LAST_NAME")
    private String lastName;

    @NotNull
    @Column(name = "AGE")
    private String age;

    @Column(name = "RESIDENCE")
    private String residence;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @NotNull
    @Column(name = "EMAIL")
    private String eMail;

    public int getIdUserGuest() {
        return idUserGuest;
    }

    public void setIdUserGuest(int idUserGuest) {
        this.idUserGuest = idUserGuest;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}
