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

    @Column(name="autor")
    private String autor;
    @Column(name="numEpisodios")
    private int numEpisodios;
    @Column (name="genero")
    private String genero;
    @Column (name="paisOrigem")
    private String paisOrigem;
    @Column (name="anoLancamento")
    private int anoLancamento;
    @Column (name="descricao")
    private String descricao;
    @Column (name="direcao")
    private String direcao;
}
