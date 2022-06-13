package com.esprit.authentification.Service;


import com.esprit.authentification.Entity.Role;
import org.springframework.stereotype.Service;

@Service
public interface RoleService {

    Role saveRole(Role role) ;

}
