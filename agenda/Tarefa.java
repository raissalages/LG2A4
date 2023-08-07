package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Tarefa extends Modelo{
    private String descricao;
    private boolean seEventoDuraDiaTodo;


    private static ArrayList<Tarefa> tarefas = new ArrayList<>();

    public Tarefa() {
    }

    public Tarefa(String titulo, String categoria, String data, String hora, String descricao, boolean seEventoDuraDiaTodo) {
        super(titulo, categoria, data, hora);
        this.descricao = descricao;
        this.seEventoDuraDiaTodo = seEventoDuraDiaTodo;
    }

    public static ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isSeEventoDuraDiaTodo() {
        return seEventoDuraDiaTodo;
    }

    public void setSeEventoDuraDiaTodo(boolean seEventoDuraDiaTodo) {
        this.seEventoDuraDiaTodo = seEventoDuraDiaTodo;
    }
}
