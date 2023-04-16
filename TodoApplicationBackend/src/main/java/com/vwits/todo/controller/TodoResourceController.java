package com.vwits.todo.controller;


import com.vwits.todo.Model.Todo;
import com.vwits.todo.service.TodoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/v1")
public class TodoResourceController {


    @Autowired
    private TodoServices service;


    @GetMapping("/todo/{id}")
    public Optional<Todo> getTodoById(@PathVariable long id) {
        return service.getTodo(id);
    }


    @PostMapping("/todo")
    public ResponseEntity<Void> addTodo(@RequestBody Todo todo) {
        Todo todoUpdated = service.addTodo(todo);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(todoUpdated.getId())
                .toUri();

        return ResponseEntity.created(uri).build();

    }

    @DeleteMapping("/todo/{id}")
    public ResponseEntity deleteTodo(@PathVariable long id) {
        return service.deleteTodo(id);
    }


    @GetMapping("/todos")
    public List getAllTodos() {
        return service.getAllTodos();
    }

    @PutMapping("/todo/{id}")
    public ResponseEntity UpdateTodo(@PathVariable long id, @RequestBody Todo todo) {
        return service.updateTodo(id, todo);
    }

}
