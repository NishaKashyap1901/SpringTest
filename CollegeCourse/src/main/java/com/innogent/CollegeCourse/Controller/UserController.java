package com.innogent.CollegeCourse.Controller;

import com.innogent.CollegeCourse.Entity.User;
import com.innogent.CollegeCourse.Repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/users")
public class UserController {

//    @GetMapping("/")
//    public String get()
//    {
//        return "hello";
//    }
    @Autowired
    private userRepository repository;
    @PostMapping("/")
    public  User create( @RequestBody User user)
    {
     return repository.save(user);
    }
    @GetMapping("/")
    public List<User> get()
    {
        return repository.findAll();
    }
@GetMapping("/{id}")
public User getById(@PathVariable Long id)
{
    Optional<User> user = repository.findById(id);
    return user.get();
}
//@DeleteMapping("/{id")
//    public User deleteById(@PathVariable Long id)
//{
//try{
//    repository.deleteById(id);
//}
//catch (Exception e)
//    {}
//    return user.get();
//}
@DeleteMapping("/{id}")
public ResponseEntity<User> deleteById(@PathVariable Long id) {
    try {
        Optional<User> userToDelete = repository.findById(id);
        if (userToDelete.isPresent()) {
            User deletedUser = userToDelete.get();
            repository.deleteById(id);
            return ResponseEntity.ok(deletedUser); // Return the deleted user with 200 OK
        } else {
            return ResponseEntity.notFound().build(); // Return a 404 Not Found response if the user is not found
        }
    } catch (Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); // Handle other exceptions
    }
}
}
