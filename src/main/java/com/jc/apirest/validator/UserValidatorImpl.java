/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.apirest.validator;

import com.jc.apirest.dto.UserRequest;
import com.jc.apirest.utils.exceptions.ApiUnprocessableEntity;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jeffer Cardenas <jecgdevp@gmail.com'>
 */
@Component
public class UserValidatorImpl implements UserValidator{

    @Override
    public void validator(UserRequest request) throws ApiUnprocessableEntity {
        
        if(request.getFirstname() == null || request.getFirstname().isEmpty()){
            this.message("El nombre es obligatorio");
        }
        
        if(request.getFirstname().length() < 3){
            this.message("El nombre es muy corto, debe tener por lo menos 3 caracteres");
        }
        
        if(request.getLastname()== null || request.getLastname().isEmpty()){
            this.message("El apellido es obligratorio");
        }
        
        if(request.getLastname().length() < 6){
            this.message("El apellido es muy corto, debe tener por lo menos 6 caracteres");
        }
        
        if(request.getUsername()== null || request.getUsername().isEmpty()){
            this.message("El username es obligratorio");
        }
        
        if(request.getUsername().length() < 6){
            this.message("El username es muy corto, debe tener por lo menos 6 caracteres");
        }
        
        if(request.getPassword()== null || request.getPassword().isEmpty()){
            this.message("La contraseña es obligratorio");
        }
        
        if(request.getPassword().length() < 6){
            this.message("La contraseña es muy corta, debe tener por lo menos 6 caracteres");
        }
    }
    
    private void message(String message) throws ApiUnprocessableEntity{
        
        throw new ApiUnprocessableEntity(message);
    }
    
}
