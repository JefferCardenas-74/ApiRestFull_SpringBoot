/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.apirest.controllers;

import com.jc.apirest.services.interfaces.IUsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    
    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> index(){
        
        return ResponseEntity.ok(this.userServices.findAll());
    }
    
    @GetMapping(value = "/by/{username}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> findByUsername(@PathVariable("username") String username){
        
        return ResponseEntity.ok(this.userServices.findByUsername(username));
    }
    
    
    
}
