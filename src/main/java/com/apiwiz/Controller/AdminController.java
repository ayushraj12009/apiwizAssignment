package com.apiwiz.Controller;

import com.apiwiz.Model.Task;
import com.apiwiz.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("admin")
@RestController
public class AdminController {

    @Autowired
    TaskRepository taskRepository;


    @GetMapping("/getAllUserTask")
    public List<Task> getAllTask(){
        return taskRepository.findAll();
    }




}
