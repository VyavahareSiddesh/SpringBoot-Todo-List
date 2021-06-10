package com.todolist.todoList.TodoList;


import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/todo")
public class TodoListController {
    private final TodoListService todoListService;

    @Autowired
    public TodoListController(TodoListService todoListService)
    {
        this.todoListService=todoListService;
    }

    @GetMapping
    public List<TodoList> getAllTasks(){
        return todoListService.getAllTasks();

    }

    @PostMapping
    public void addTask(@RequestBody TodoList todoList){
        todoListService.addTask(todoList);
    }

    @DeleteMapping
    public void deleteTask(@Validated @NotNull @RequestParam Integer id)
    {
        System.out.println(id);
        todoListService.deleteTask(id);
    }

    @PatchMapping
    public void updateTask(@Validated @NotNull @RequestBody TodoList todoList){
        todoListService.updateTask(todoList);
    }

}
