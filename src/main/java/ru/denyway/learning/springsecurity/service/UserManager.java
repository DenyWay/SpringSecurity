/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.denyway.learning.springsecurity.service;

/**
 *
 * @author DenyWay
 */

import java.io.File;
import java.io.IOException;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.List;
import java.util.logging.Level;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.denyway.learning.springsecurity.controller.HomeController;
import ru.denyway.learning.springsecurity.dao.UserDAO;

import ru.denyway.learning.springsecurity.domain.User;
import ru.denyway.springsecurity.entity.SecurityUsers;

@Service
public class UserManager {
      
        private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    
        //private final static String fileName = "/Users/denyway/Google Диск/Разработка/last/last/SpringSecurity/src/main/java/ru/denyway/springsecurity/entity/passwords.dat";
                      
        private final static String fileName = new File("passwords.dat").getAbsoluteFile().toString();
                 
        
	public UserManager() {
		
	}
	
	public UserDetails getUser(String login) throws UsernameNotFoundException{
                          
            UserDAO userdao = new UserDAO();
                         
            try {
		logger.info("loadUserByUsername("+login+");");
		
		SecurityUsers user = userdao.getUser(login);
		if (user == null)
                    throw new UsernameNotFoundException("Login " + login + " doesn't exist!");
                
                String password = null;
                
                List<String> lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
             
                for(String line:lines){
                    String[] ar = line.split("   ");                   
                    if(ar[0].trim().equals(user.getId().toString())){
                        //System.out.println(ar[0]+" : "+ar[1]);
                        password = ar[1];
                        break;
                    }
                }
               
		UserDetails details = new User(user.getLogin(), password, user.getName(), "ROLE_USER");
		return details;
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            } finally {
		//
            }
	}
}

