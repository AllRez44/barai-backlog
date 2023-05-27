package com.baraibacklog.app.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;



@Entity
@Table(name = SeriesBacklog.TABLE_NAME)
public class SeriesBacklog extends Backlog{
    public static final String TABLE_NAME = "series";

    public SeriesBacklog() {

    }

    @Column(name = "plataforma")
    private String plataforma;

    //TODO: Add more Series-specific attributes
}
