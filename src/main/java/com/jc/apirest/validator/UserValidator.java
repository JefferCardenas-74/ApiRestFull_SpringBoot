
package com.jc.apirest.validator;

import com.jc.apirest.dto.UserRequest;
import com.jc.apirest.utils.exceptions.ApiUnprocessableEntity;
import org.springframework.stereotype.Service;

/**
 * Interface de la validacion de datos recibidos para
 * la creacion de ususarios
 * @author Jeffer Cardenas <jecgdevp@gmail.com'>
 */

@Service
public interface UserValidator{
    
    void validator(UserRequest request) throws ApiUnprocessableEntity;
    
}
