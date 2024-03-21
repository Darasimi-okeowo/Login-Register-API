package com.darasimi.LoginRegisterAPI.repository;
import java.util.Optional;

import com.darasimi.LoginRegisterAPI.models.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.darasimi.LoginRegisterAPI.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
    Optional<Role> findByName(ERole name);
}
