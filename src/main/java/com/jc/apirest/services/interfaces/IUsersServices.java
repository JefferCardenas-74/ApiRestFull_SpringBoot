
package com.jc.apirest.services.interfaces;

import com.jc.apirest.dto.UserRequest;
import com.jc.apirest.dto.UsersDTO;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jeffer Cardenas <jecgdevp@gmail.com>
 */

@Service
public interface IUsersServices {
    
    List<UsersDTO> findAll();
    
    UsersDTO findByUsername(String username);
    
    UsersDTO findById(int user_id);
    
    void save(UserRequest user);
    
    void update(UserRequest request, int userId);
    
    void saveAll(List<UserRequest> users);
    
    void deleteById(int user_id);
    
}
