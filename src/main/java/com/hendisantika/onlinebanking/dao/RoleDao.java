package com.hendisantika.onlinebanking.dao;

import com.hendisantika.onlinebanking.security.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleDao extends CrudRepository<Role, Integer> {

    Role findByName(String name);
}