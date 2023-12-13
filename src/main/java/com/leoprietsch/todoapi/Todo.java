package com.leoprietsch.todoapi;

import io.swagger.v3.oas.annotations.media.Schema;

public class Todo {

    private static long nextId = 1;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;
    private String title;
    private String description;

    // Constructors...

    public Todo() {
        this.id = nextId++;
    }

    public Todo(String title, String description) {
        this.id = nextId++;
        this.title = title;
        this.description = description;
    }

    // Getters and setters...

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        // You can choose to allow setting the ID or not
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


