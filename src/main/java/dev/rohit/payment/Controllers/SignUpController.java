package dev.rohit.payment.Controllers;

import dev.rohit.payment.Models.User;
import dev.rohit.payment.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SignUpController {

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.POST , value="/signup")
    public String checkUser(@RequestBody User user){
        System.out.println(user.getCity());
        System.out.println(user.getFirstName());
        System.out.println(user.getEmail());
        boolean userNotPresent=userService.checkUser(user.getEmail());
        if(userNotPresent) {
            userService.insertUser(user);
            return "/items";
        }
        return "user found";
    }
}


