package com.sk.cuello.repository;

import com.sk.cuello.entity.CuelloUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuelloUserRepository extends JpaRepository<CuelloUser,Long> {
}
