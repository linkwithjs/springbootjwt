package com.rj.jwt.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rj.jwt.Models.Role;
import com.rj.jwt.Models.ERole;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
