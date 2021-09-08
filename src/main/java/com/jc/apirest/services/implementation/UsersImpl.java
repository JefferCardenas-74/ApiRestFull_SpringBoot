/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.apirest.services.implementation;

import com.jc.apirest.utils.hash.BCrypt;
import com.jc.apirest.dto.UserRequest;
import com.jc.apirest.dto.UsersDTO;
import com.jc.apirest.entities.Users;
import com.jc.apirest.repository.UsersRepository;
import com.jc.apirest.services.interfaces.IUsersServices;
import com.jc.apirest.utils.helpers.MHelpers;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 *
 * @author Jeffer Cardenas <jecgdevp@gmail.com>
 */

@Component
public class UsersImpl implements IUsersServices{
    
    @Autowired
    private UsersRepository userRespRepository;

    @Override
    public List<UsersDTO> findAll() {
        
        List<UsersDTO> dto = new ArrayList<>();
        
        Iterable<Users> users = this.userRespRepository.findAll();
        
        for(Users user : users){
            
            UsersDTO usersDTO = MHelpers.modelMapper().map(user, UsersDTO.class);
            
            dto.add(usersDTO);
        }
        
        return dto;
        
    }

    @Override
    public UsersDTO findByUsername(String username) {
        
        Optional<Users> users = this.userRespRepository.findByUsername(username);
        
        if(!users.isPresent()){
            return null;
        }
        
        return MHelpers.modelMapper().map(users.get(), UsersDTO.class);
    }

    @Override
    public UsersDTO findById(int user_id) {
        Optional<Users> users = this.userRespRepository.findById(user_id);
        
        if(!users.isPresent()){
            return null;
        }
        
        return MHelpers.modelMapper().map(users.get(), UsersDTO.class);
    }

    @Override
    public void save(UserRequest user) {
        
        Users users = MHelpers.modelMapper().map(user, Users.class);
        
        users.setPassword(BCrypt.hashpw(users.getPassword(), BCrypt.gensalt()));
        
        this.userRespRepository.save(users);
    }

    @Override
    public void saveAll(List<UserRequest> users) {
        
        List<Users> u = new ArrayList<>();
        
        for(UserRequest user : users){
            
            Users us = MHelpers.modelMapper().map(user, Users.class);
            
            u.add(us);
        }
        
        this.userRespRepository.saveAll(u);
    }

    @Override
    public void deleteById(int user_id) {
        
        this.userRespRepository.deleteById(user_id);
    }
    
    
    private UsersDTO convertToUsersDTO(final Users users){
        
        return MHelpers.modelMapper().map(users, UsersDTO.class);
    }
    
}
