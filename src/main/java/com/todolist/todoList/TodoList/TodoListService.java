package com.todolist.todoList.TodoList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoListService {
    private final TodoListRepository todoListRepository;

    @Autowired
    public TodoListService(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    public List<TodoList> getAllTasks(){
        return todoListRepository.findAll();
    }

    public void addTask(TodoList s) {
        todoListRepository.save(s);
    }

    public void deleteTask(Integer id) {
        boolean searchedTodo= todoListRepository.existsById(id);
        if(!searchedTodo) {
            throw new IllegalStateException("No task present with this id");
        }
        todoListRepository.deleteById(id);
    }

    public void updateTask(TodoList todoList) {
        boolean todoSearch = todoListRepository.existsById(todoList.getId());
        if(!todoSearch){
            throw new IllegalStateException("No task present with this id");
        }
//        System.out.println(todoList);
        todoListRepository.save(todoList);
    }
}
