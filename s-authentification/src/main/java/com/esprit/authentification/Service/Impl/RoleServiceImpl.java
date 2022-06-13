package com.esprit.authentification.Service.Impl;
import com.esprit.authentification.Entity.Role;
import com.esprit.authentification.Repository.RoleRepository;
import com.esprit.authentification.Service.RoleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class RoleServiceImpl  implements RoleService{
    private final RoleRepository roleRepository ;


    @Override
    public Role saveRole(Role role) {
        log.info("saving rule   : {} " , role.getName());
        return roleRepository.save( role );
    }
}
