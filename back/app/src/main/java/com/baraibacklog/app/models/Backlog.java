package com.baraibacklog.app.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;


@Entity
public abstract class Backlog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    public Backlog(){

    }

    public Backlog(Long id, String name, String status) {
        this.name = name;
        this.status = status;
    }

    @Column(name = "name")
    private String name;

    @Column(name = "status")
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
