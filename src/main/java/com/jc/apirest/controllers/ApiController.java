/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.apirest.controllers;

import com.jc.apirest.dto.UserRequest;
import com.jc.apirest.services.interfaces.IUsersServices;
import com.jc.apirest.utils.exceptions.ApiUnprocessableEntity;
import com.jc.apirest.validator.UserValidatorImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jeffer Cardenas <jecgdevp@gmail.com>
 */
@CrossOrigin("*")
@RestController
@RequestMapping("/users")
public class ApiController {
    
    @Autowired
    private IUsersServices userServices;
    
    @Autowired
    private UserValidatorImpl userValidator;
    
    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> index(){
        
        return ResponseEntity.ok(this.userServices.findAll());
    }
    
    @GetMapping(value = "/by/{username}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> findByUsername(@PathVariable("username") String username){
        
        return ResponseEntity.ok(this.userServices.findByUsername(username));
    }
    
    @GetMapping(value = "/id/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> findById(@PathVariable("userId") int userId){
        
        return ResponseEntity.ok(this.userServices.findById(userId));
    }
    
    @PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> saveUser(@RequestBody UserRequest request) throws ApiUnprocessableEntity {
        
        this.userValidator.validator(request);
        
        //this.userServices.save(request);
        
        return ResponseEntity.ok(Boolean.TRUE);
    }
   
}
