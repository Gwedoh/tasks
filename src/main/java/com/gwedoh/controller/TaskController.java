package com.gwedoh.controller;

import com.gwedoh.domain.Task;
import com.gwedoh.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(value = {"", "/"})
    public Iterable<Task> list() {
        return this.taskService.list();
    }

    @PostMapping(value = "/save")
    public Task saveTask(@RequestBody Task task) {
        return this.taskService.save(task);
    }

}
