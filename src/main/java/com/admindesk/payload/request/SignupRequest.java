package com.admindesk.payload.request;

import java.util.Date;
import java.util.Set;

import javax.validation.constraints.*;

public class SignupRequest {

  private String firstname;

  private  String lastname;

  private String username;
  private String password;

  private String email;

  private Set<String> role;
  private String designation;
  private String state;

  private String city;

  private String contact;
  private String gender;
  private String address;

  private String employeeId;

  private Date dateOfJoining;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String  getState(){ return state ;}

  public  void setState(String state){ this.state=state;}


  public String getDesignation() {
    return designation;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }
  public String  getGender(){ return gender ;}

  public  void setGender(String gender){ this.gender=gender;}

  public String  getAddress(){ return address ;}

  public  void setAddress(String address){ this.address=address;}

  public String  getEmployeeId(){ return employeeId ;}

  public  void setEmployeeId(String employeeId){ this.employeeId=employeeId;}

  public Date getDateOfJoining(){ return dateOfJoining ;}

  public  void setDateOfJoining(Date dateOfJoining){ this.dateOfJoining=dateOfJoining;}

  public String  getFirstname(){ return firstname ;}

  public  void setFirstname(String firstname){ this.firstname=firstname;}

  public String  getLastname(){ return lastname;}

  public  void setLastname(String lastname){ this.lastname=lastname;}

  public Set<String> getRole() {
    return this.role;
  }

  public void setRole(Set<String> role) {
    this.role = role;
  }
}
