package com.jc.apirest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author Jeffer Cardenas <jecgdevp@gmail.com'>
 */

@Data
public class UserRequest implements Serializable {
       
    @JsonProperty("firstname")
    private String firstname;
    
    @JsonProperty("lastname")
    private String lastname;
    
    @JsonProperty("username")
    private String username;
    
    @JsonProperty("password")
    private String password;
}
