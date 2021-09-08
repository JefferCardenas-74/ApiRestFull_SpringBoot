/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.apirest.utils.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Exception personalizada de status 404
 * @author Jeffer Cardenas <jecgdevp@gmail.com'>
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ApiNotFound extends Exception{
    
    public ApiNotFound(String message){
        super(message);
    }
}
