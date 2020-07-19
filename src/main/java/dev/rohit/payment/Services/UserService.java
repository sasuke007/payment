package dev.rohit.payment.Services;

import dev.rohit.payment.Models.User;
import dev.rohit.payment.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public boolean checkUser(String email){
        Optional<User> optional =  userRepository.findById(email);
        System.out.println(optional.isEmpty());
        return optional.isEmpty();
    }

    public void insertUser(User user){
        userRepository.save(user);
    }
}
