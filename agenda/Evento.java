package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Evento extends Modelo{
    private String descricao;
    private String localizacao;
    private String horarioFinal;
    private boolean seEventoDuraDiaTodo;


    private static ArrayList<Evento> eventos = new ArrayList<>();


    public Evento(String titulo, String categoria, String data, String hora, String descricao, String localizacao, String horarioFinal, boolean seEventoDuraDiaTodo) {
        super(titulo, categoria, data, hora);
        this.descricao = descricao;
        this.localizacao = localizacao;
        this.horarioFinal = horarioFinal;
        this.seEventoDuraDiaTodo = seEventoDuraDiaTodo;
    }


    public Evento() {
    }

    public static ArrayList<Evento> getEventos() {
        return eventos;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }


    public boolean isSeEventoDuraDiaTodo() {
        return seEventoDuraDiaTodo;
    }

    public void setSeEventoDuraDiaTodo(boolean seEventoDuraDiaTodo) {
        this.seEventoDuraDiaTodo = seEventoDuraDiaTodo;
    }

    public String getHorarioFinal() {
        return horarioFinal;
    }

    public void setHorarioFinal(String horarioFinal) {
        this.horarioFinal = horarioFinal;
    }
}
