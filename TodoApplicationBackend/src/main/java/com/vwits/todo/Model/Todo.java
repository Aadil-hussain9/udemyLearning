package com.vwits.todo.Model;

import javax.persistence.*;

@Entity
@Table(name = "Todo")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private long id;

    @Column(name = "Name")
    private String username;

    @Column(name = "Description")
    private String description;

    @Column(name = "Is_Done")
    private boolean isDone;

    public Todo() {
        super();
    }

    public Todo(long id, String username, String description, boolean isDone) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.isDone = isDone;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if ((obj == null) || (getClass() != obj.getClass())) return false;
        Todo other = (Todo) obj;
        return id == other.id;
    }

    public String getDescription() {
        return description;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }


    public boolean isDone() {
        return isDone;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
