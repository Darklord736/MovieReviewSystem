package com.project.Project.userservice;

import com.project.Project.entity.User;
import com.project.Project.entity.UserRole;

import java.util.List;
import java.util.Set;

public interface UserService {

    //create user
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;

    //get user by username
    public User getUser(String username);

    //delete user by id
    public void deleteUser(Integer id);

    //update user
    public User updateUser(User user);

    //get all user
    public List<User> getAllUser();

    //get user by id
    public User getUserById(Integer u_id);

}
