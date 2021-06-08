package com.project.Project.controller;

import com.project.Project.entity.Role;
import com.project.Project.entity.User;
import com.project.Project.entity.UserRole;
import com.project.Project.userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserService userService;

    //Creating User
    @PostMapping("/")
    public User createUser(@RequestBody User user) throws Exception {

        Set<UserRole> roles = new HashSet<>();
        Role role = new Role();
        role.setR_id(02);
        role.setRolename("User");

        UserRole userRole = new UserRole();
        userRole.setUser(user);
        userRole.setRole(role);
        roles.add(userRole);

        return this.userService.createUser(user, roles);
    }

    //getting user by username
    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username){
        return this.userService.getUser(username);
    }

    //delete user by user_id
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        this.userService.deleteUser(id);
    }

    //update user
    @PutMapping("/")
    public ResponseEntity<?> updateUser(@RequestBody User user){
        return ResponseEntity.ok(this.userService.updateUser(user));
    }

    //getting user List
    @GetMapping("/getUser")
    public List<User> getAllUser(User u){
        return this.userService.getAllUser();
    }

//    //get user by id
//    @GetMapping("/{u_id}")
//    public User getUserById(@PathVariable("u_id") Integer u_id){
//        return this.userService.getUserById(u_id);
//    }
}
