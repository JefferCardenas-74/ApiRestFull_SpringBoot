/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.apirest.repository;

import com.jc.apirest.entities.Users;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jeffer Cardenas <jecgdevp@gmail.com>
 */

@Repository
public interface UsersRepository extends CrudRepository<Users, Integer> {
    
    @Transactional()
    Optional<Users> findByUsername(String username);
    
}
