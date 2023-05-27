package com.baraibacklog.app.models;

import jakarta.persistence.*;



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

}
