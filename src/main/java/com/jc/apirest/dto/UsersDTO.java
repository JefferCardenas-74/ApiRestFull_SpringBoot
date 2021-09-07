package com.jc.apirest.dto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 *
 * @author Jeffer Cardenas <jecgdevp@gmail.com>
 */
/* la interfaz serializazble se usa para poder convertir el obejeto a byte para poder enviarlo a traves de la red*/

@Data
public class UsersDTO implements Serializable {
    
    private String id;
    private String firstname;
    private String lastname;
    private String username;
    private Date createdAt;
    private String updatedAt;
    
}
