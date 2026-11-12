package com.sk.cuello.service;

import com.sk.cuello.entity.CuelloTask;
import com.sk.cuello.mapper.CuelloTaskMapper;
import com.sk.cuello.repository.CuelloTaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuelloTaskService {
    public final CuelloTaskRepository cuelloTaskRepository;
    public final CuelloTaskMapper cuelloTaskMapper;

    public CuelloTaskService(CuelloTaskRepository cuelloTaskRepository, CuelloTaskMapper cuelloTaskMapper) {
        this.cuelloTaskRepository = cuelloTaskRepository;
        this.cuelloTaskMapper = cuelloTaskMapper;
    }

    public void createTasks(CuelloTask cuelloTask) {
        cuelloTaskRepository.save(cuelloTask);
    }

    public CuelloTask getTaskById(Long taskId) {
        return cuelloTaskRepository.findByTaskId(taskId);
    }

    public void deleteTaskById(Long taskId) {
        CuelloTask cuelloTask = cuelloTaskRepository.findByTaskId(taskId);
        cuelloTaskRepository.delete(cuelloTask);
    }

    public List<CuelloTask> getAllTasks() {
        return cuelloTaskRepository.findAll();
    }

    public CuelloTask updateTask(CuelloTask cuelloTaskReq) {
        CuelloTask cuelloTask = cuelloTaskMapper.updateTaskMapper(cuelloTaskRepository.findByTaskId(cuelloTaskReq.getTaskId()), cuelloTaskReq);
        return cuelloTaskRepository.save(cuelloTask);
    }
}
