package com.project.Project;

import com.project.Project.entity.Role;
import com.project.Project.entity.User;
import com.project.Project.entity.UserRole;
import com.project.Project.userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ProjectApplication implements CommandLineRunner{

	@Autowired
	private UserService userService;



	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Starting code");
//
//		User user = new User();
//
//
//		user.setFirstname("Shubham");
//		user.setLastname("Yadav");
//		user.setUsername("shubhamy736");
//		user.setEmail("shubham@gmail.com");
//		user.setPassword("shubham20");
//
//		Role role1 = new Role();
//		role1.setR_id(01);
//		role1.setRolename("Admin");
//
//		Set<UserRole> userRolesSet = new  HashSet<>();
//		UserRole userRole = new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//		userRolesSet.add(userRole);
//
//		User user1 = this.userService.createUser(user,userRolesSet);
//		System.out.println(user1.getUsername());
	}
}
