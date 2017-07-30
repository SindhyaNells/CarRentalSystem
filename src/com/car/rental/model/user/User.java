package com.car.rental.model.user;

/**
 * Created by sindhya on 7/30/17.
 */
public abstract class User {


    private String userId;
    private String userName;
    private String userType;
    private String contantNumber;
    private String emailId;
    private String password;
    private Address address;

    public User(String user_id,String user_name,String user_email,String user_password,Address user_address){

        this.userId=user_id;
        this.userName=user_name;
        this.emailId=user_email;
        this.password=user_password;
        this.address=user_address;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getContantNumber() {
        return contantNumber;
    }

    public void setContantNumber(String contantNumber) {
        this.contantNumber = contantNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
