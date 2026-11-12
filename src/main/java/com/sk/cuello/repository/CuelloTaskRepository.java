package com.sk.cuello.repository;

import com.sk.cuello.entity.CuelloTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuelloTaskRepository extends JpaRepository<CuelloTask,Long> {
    CuelloTask findByTaskId(long id);
}
