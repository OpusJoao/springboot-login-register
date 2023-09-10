package com.joaofdev.springboot.registrationlogindemo.repository;

import com.joaofdev.springboot.registrationlogindemo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName (String name);
}
