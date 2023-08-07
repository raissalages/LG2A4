package com.company;

import java.time.LocalDateTime;

public abstract class Modelo {
    private String titulo;
    private String categoria;
    private String data;
    private String hora;

    public Modelo(){}

    public Modelo(String titulo, String categoria, String data, String hora) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.data = data;
        this.hora = hora;
    }

    public Modelo(String titulo, String categoria, String data) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.data = data;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
