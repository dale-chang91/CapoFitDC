package com.app.capofitdc;

/**
 * Created by Dale on 4/22/2017.
 */

public class Student {

    private boolean isAdult;
    private String firstName;
    private String middleName;
    private char middleInitial;
    private String lastName;
    private String capoeiristaName;
    private String streetAddress;
    private String city;
    private String stateOrProvince;
    private String zipCode;
    private String[] phoneNumber;
    private String emailAddress;

    public Student(boolean isAdult) {
        this.isAdult = isAdult;
    }
    public boolean isAdult() {
        return isAdult;
    }
    public void setAdult(boolean adult) {
        isAdult = adult;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public char getMiddleInitial() {
        return middleInitial;
    }
    public void setMiddleInitial(char middleInitial) {
        this.middleInitial = middleInitial;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getCapoeiristaName() {
        return capoeiristaName;
    }
    public void setCapoeiristaName(String capoeiristaName) {
        this.capoeiristaName = capoeiristaName;
    }
    public String getStreetAddress() {
        return streetAddress;
    }
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getStateOrProvince() {
        return stateOrProvince;
    }
    public void setStateOrProvince(String stateOrProvince) {
        this.stateOrProvince = stateOrProvince;
    }
    public String getZipCode() {
        return zipCode;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    public String[] getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String[] phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


}
