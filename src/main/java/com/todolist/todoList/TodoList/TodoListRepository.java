package com.todolist.todoList.TodoList;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoListRepository extends JpaRepository<TodoList,Integer> {

}
