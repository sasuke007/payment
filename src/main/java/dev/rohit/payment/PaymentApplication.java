package dev.rohit.payment;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import java.util.*;

class DateOfBirth{

    private String day;
    private String month;
    private String year;

    public DateOfBirth(String day, String month, String year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

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
}
class Customer{
    private String merchantCustomerId;
    private String locale;

    public String getMerchantCustomerId() {
        return merchantCustomerId;
    }

    public void setMerchantCustomerId(String merchantCustomerId) {
        this.merchantCustomerId = merchantCustomerId;
    }

    private String firstName;
    private String lastName;
    private DateOfBirth dateOfBirth;
    private String email;
    private String phone;
    private String gender;
    private String nationality;

    public Customer(String merchantCustomerId, String locale, String firstName, String lastName, DateOfBirth dateOfBirth, String email, String phone, String gender, String nationality) {
        this.merchantCustomerId = merchantCustomerId;
        this.locale = locale;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.nationality = nationality;
    }

    public DateOfBirth getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(DateOfBirth dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
@SpringBootApplication
public class PaymentApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(PaymentApplication.class, args);
//        ObjectMapper objectMapper = new ObjectMapper();
//        StringWriter stringWriter=new StringWriter();
//        RestTemplate restTemplate = new RestTemplate();
//        String base64="Basic cHJpdmF0ZS03NzUxOkItcWEyLTAtNWYwMzFjZGQtMC0zMDJkMDIxNDQ5NmJlODQ3MzJhMDFmNjkwMjY4ZDNiOGViNzJlNWI4Y2NmOTRlMjIwMjE1MDA4NTkxMzExN2YyZTFhODUzMTUwNWVlOGNjZmM4ZTk4ZGYzY2YxNzQ4";
//        String url="https://api.test.paysafe.com/paymenthub/v1/customers";
//        HttpHeaders headers = new HttpHeaders();
//        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        headers.set("Authorization", base64);
//        headers.set("Simulator","EXTERNAL");
//        Map<String,DateOfBirth> dob=new HashMap<>();
//        DateOfBirth x=new DateOfBirth("26","06","1997");
//        dob.put("dateOfBirth",x);
//        Customer c=new Customer("101","en_US","Rohit","Pandit",x,"pandit.rohit0007@gmail.com","8878942625","M","Canadian");
//        objectMapper.writeValue(stringWriter,c);
//        HttpEntity<String> entity = new HttpEntity<>(stringWriter.toString(),headers);
//        System.out.println(stringWriter);
//        ResponseEntity<String> respEntity = restTemplate.exchange(url,HttpMethod.POST,entity,String.class);
//        if(respEntity.getStatusCode()==HttpStatus.CREATED){
//            System.out.println("success mf");
//            System.out.println(respEntity.getBody());
//        }
//        else{
//            System.out.println("failed");
//            System.out.println(respEntity.getStatusCode());
//            System.out.println(respEntity.getBody()
//            );
//        }
   }

}
