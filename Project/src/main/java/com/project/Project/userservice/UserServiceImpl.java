package com.project.Project.userservice;

import com.project.Project.entity.User;
import com.project.Project.entity.UserRole;
import com.project.Project.repositroy.UserRepository;
import com.project.Project.rolerepository.RoleRepository;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    //creating user
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {

        User local = this.userRepository.findByUsername(user.getUsername());
        if (local!=null)
        {
             System.out.println(("User is Already Existed !"));
             throw new Exception("User Already present!");
        }
        else {
                for (UserRole ur: userRoles)
                {
                    roleRepository.save(ur.getRole());
                }
                user.getUserRoles().addAll(userRoles);
                local = this.userRepository.save(user);
        }

        return local;
    }

    //getting user user by username
    @Override
    public User getUser(String username) {
        return this.userRepository.findByUsername(username);
    }

    //delete user by id
    @Override
    public void deleteUser(Integer id) {
        this.userRepository.deleteById(id);
    }

    @Override
    public User updateUser(User user) {
        return this.userRepository.save(user);
    }

    //get all user list
    @Override
    public List<User> getAllUser() {
        return this.userRepository.findAll();
    }

    @Override
    public User getUserById(Integer u_id) {
        return this.userRepository.findById(u_id).get();
    }


}
