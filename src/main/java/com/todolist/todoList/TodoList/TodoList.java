package com.todolist.todoList.TodoList;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class TodoList {
    private Integer id;
    @NotNull
    private String task;
    private String status;

    public TodoList(){}
    public TodoList(String task,String status) {
        this.status = status;
        this.task = task;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "TodoList{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", task='" + task + '\'' +
                '}';
    }
}
