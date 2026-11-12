package com.sk.cuello.mapper;

import com.sk.cuello.entity.CuelloTask;
import org.springframework.stereotype.Service;

@Service
public class CuelloTaskMapper {

    public CuelloTask updateTaskMapper(CuelloTask cuelloTask,CuelloTask cuelloTaskReq){
        cuelloTask.setTaskAssignedToUser(cuelloTaskReq.getTaskAssignedToUser());
        cuelloTask.setTaskName(cuelloTaskReq.getTaskName());
        cuelloTask.setTaskDescription(cuelloTaskReq.getTaskDescription());
        cuelloTask.setTaskStatus(cuelloTaskReq.getTaskStatus());
        return cuelloTask;
    }
}
