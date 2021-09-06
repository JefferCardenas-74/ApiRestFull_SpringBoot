
package com.jc.apirest.services.interfaces;

import com.jc.apirest.dto.UsersDTO;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
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
    
    void save(UsersDTO user);
    
    void saveAll(List<UsersDTO> users);
    
    void deleteById(int user_id);
    
}
