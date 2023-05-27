package com.baraibacklog.app.models;

import jakarta.persistence.*;



@Entity
@Table(name = BookBacklog.TABLE_NAME)
public class BookBacklog extends Backlog{
    public static final String TABLE_NAME = "book";

    public BookBacklog(){

    }

    @Column(name = "autor")
    private String autor;



    //TODO: Add more unique to book attributes

}
