package com.sk.cuello.controller;

import com.sk.cuello.entity.CuelloTask;
import com.sk.cuello.service.CuelloTaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cuello/api/v1/task")
public class CuelloTaskController {

    public final CuelloTaskService cuelloTaskService;

    public CuelloTaskController(CuelloTaskService cuelloTaskService) {
        this.cuelloTaskService = cuelloTaskService;
    }

    @PostMapping
    public ResponseEntity<?> createTask(@RequestBody CuelloTask cuelloTask) {
        cuelloTaskService.createTasks(cuelloTask);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{taskId}")
    public ResponseEntity<?> fetchTaskById(@PathVariable Long taskId){
        CuelloTask cuelloTask = cuelloTaskService.getTaskById(taskId);
        if(cuelloTask == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(cuelloTask,HttpStatus.OK);
    }

    @DeleteMapping("/{taskId}")
    public ResponseEntity<?> deleteTaskById(@PathVariable Long taskId){
        cuelloTaskService.deleteTaskById(taskId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/all")
    public ResponseEntity<?> fetchAllTask(){
        List<CuelloTask> cuelloTaskList =  cuelloTaskService.getAllTasks();
        return new ResponseEntity<>(cuelloTaskList,HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> updateTask(@RequestBody CuelloTask cuelloTask){
        CuelloTask updatedCuelloTask = cuelloTaskService.updateTask(cuelloTask);
        return new ResponseEntity<>(updatedCuelloTask,HttpStatus.OK);
    }


}
