package com.vwits.todo.service;

import com.vwits.todo.Model.Todo;
import com.vwits.todo.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TodoServices {

//    Todo person=new Todo(1, "uddesh", "learn", new Date(), false);

    static Integer idCounter = 0;

    private static List<Todo> todos = new ArrayList<>();

    static {
        todos.add(new Todo(++idCounter, "uddesh", "learn", false));
        todos.add(new Todo(++idCounter, "adil", "dance", true));
        todos.add(new Todo(++idCounter, "tejas", "learn", false));
        todos.add(new Todo(++idCounter, "monika", "learn", false));
        todos.add(new Todo(++idCounter, "Ap", "finace", true));
    }

    @Autowired
    private TodoRepository repo;

    public Optional<Todo> getTodo(long id) {

        Optional<Todo> todo = repo.findById(id);
        return todo;
    }

    public Todo addTodo(Todo todo) {
        if (todo.getId() == -1 || todo.getId() == 0) {
            repo.saveAndFlush(todo);
        } else {
            repo.deleteById(todo.getId());
            repo.saveAndFlush(todo);
        }
        return todo;
    }

    public ResponseEntity deleteTodo(long id) {
        Optional<Todo> todo = repo.findById(id);
        if (todo.isPresent()) {
            repo.deleteById(todo.get().getId());
            return ResponseEntity.accepted().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public List<Todo> getAllTodos() {
        return repo.findAll();
    }

    public ResponseEntity updateTodo(long id, Todo todo) {
        Optional<Todo> todo1 = repo.findById(id);
        if(todo1.isPresent())
        {
            repo.deleteById(id);
            Todo newTodo = new Todo();
            newTodo.setId(id);
            newTodo.setUsername(todo.getUsername());
            newTodo.setDescription(todo.getDescription());
            newTodo.setDone(todo.isDone());

            Todo todoUpdated = repo.save(newTodo);
            return new ResponseEntity<Todo>(todoUpdated,HttpStatus.OK);

        }

        else
        {
            return new ResponseEntity<>("Not Found",HttpStatus.NOT_FOUND);
        }
    }
}
