package com.project.to_do_list;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {


    private final TaskRepository taskRepository;


    public TaskService(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }


    public List<Task> getTasks(){
        return taskRepository.findAll();
    }
}
