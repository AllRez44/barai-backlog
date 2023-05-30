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

    @Column(name = "editora")
    private String editora;

    @Column(name = "numPaginas")
    private int numPaginas;

    @Column(name = "genero")
    private String genero;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "anoLancamento")
    private String anoLancamento;


}
