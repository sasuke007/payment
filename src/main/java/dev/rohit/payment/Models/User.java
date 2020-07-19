package dev.rohit.payment.Models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "user_account")
@Entity
public class User {

  //  @Column(name="_firstName")
    private String firstName;
 //   @Column(name="_lastName")
    private String lastName;
    @Id
  //  @Column(name = "_email")
    private String email;
  //  @Column(name="_phone")
    private String phone;
 //   @Column(name="_day")
    private String day;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getColony() {
        return colony;
    }

    public void setColony(String colony) {
        this.colony = colony;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //@Column(name="_month")
    private String month;
    @Column(name="year_")
    private String year;
   // @Column(name="_street")
    private String street;
   // @Column(name="_colony")
    private String colony;
   // @Column(name="_city")
    private String city ;
   // @Column(name="_zip")
    private String zip;
  //  @Column(name="_country")
    private String country;
   // @Column(name="_state")
    private String state;


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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
