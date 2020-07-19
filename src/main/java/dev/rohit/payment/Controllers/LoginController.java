package dev.rohit.payment.Controllers;

import dev.rohit.payment.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    UserService userService;

    @RequestMapping(method= RequestMethod.POST , value="/login")
    public String checkUser(@RequestBody String email){
        System.out.println(email);
        boolean userNotPresent=userService.checkUser(email);
        if(userNotPresent)
            return "/home.html";
       return "/items/"+email;
    }

}
