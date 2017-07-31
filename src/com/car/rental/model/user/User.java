package com.car.rental.model.user;

/**
 * Created by sindhya on 7/30/17.
 */
public abstract class User {


    private int userId;
    private String userName;
//    private String userType;
    private String contactNumber;
    private String emailId;
    private String password;
    private Address address;

    public User(int user_id,String user_name,String user_email,String user_password,Address user_address,String contact_num){

        this.userId=user_id;
        this.userName=user_name;
        this.emailId=user_email;
        this.password=user_password;
        this.address=user_address;
        this.contactNumber=contact_num;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContantNumber(String contantNumber) {
        this.contactNumber = contantNumber;
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
