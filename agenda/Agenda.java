package com.company;

import java.util.ArrayList;

public class Agenda {
    private static ArrayList<Evento> eventos = new ArrayList<>();
    private static ArrayList<Lembrete> lembretes = new ArrayList<>();
    private static ArrayList<Tarefa> tarefas = new ArrayList<>();


    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }

    public ArrayList<Lembrete> getLembretes() {
        return lembretes;
    }

    public void setLembretes(ArrayList<Lembrete> lembretes) {
        this.lembretes = lembretes;
    }

    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(ArrayList<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }
}
