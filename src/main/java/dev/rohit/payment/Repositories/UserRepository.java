package dev.rohit.payment.Repositories;

import dev.rohit.payment.Models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<User,String> {

}
