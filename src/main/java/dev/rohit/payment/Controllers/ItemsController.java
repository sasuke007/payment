package dev.rohit.payment.Controllers;

import dev.rohit.payment.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ItemsController {
    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET, value="/items/{email}")
    public String itemsPage(@PathVariable String email){
        System.out.println(email);
        return "hi";
    }
}
