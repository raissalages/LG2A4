package com.company;

import java.util.ArrayList;

public class GerenciadorLista {
    public static void adicionar(ArrayList lista, Object elemento){
        lista.add(elemento);
    }

    public static void remover(ArrayList lista, Object elemento){
        lista.remove(elemento);
    }

    public static void consultarTudo(Object compromisso){
        if(compromisso instanceof Evento){
            consultarEvento();
        }

        else if(compromisso instanceof Tarefa){
            consultarTarefa();
        }

        else if(compromisso instanceof Lembrete){
            consultarLembrete();
        }
    }

    private static void consultarLembrete(){

        for (Lembrete lembrete : Lembrete.getLembretes()) {
            System.out.println("Título:" + lembrete.getTitulo());
            System.out.println("Data:" + lembrete.getData());
            System.out.println("Hora de início:" + lembrete.getHora());
            System.out.println("Categoria: " + lembrete.getCategoria());


            System.out.println("--------------//--------------");
        }

    }

    private static void consultarEvento(){

        for (Evento evento : Evento.getEventos()) {
            System.out.println("Título:" + evento.getTitulo());
            System.out.println("Data:" + evento.getData());


            if(evento.isSeEventoDuraDiaTodo())
                System.out.println("Duração: O dia inteiro");
            else{
                System.out.println("Hora de início:" + evento.getHora());
                System.out.println("Hora de término:" + evento.getHorarioFinal());
            }

            System.out.println("Descricao: " + evento.getDescricao());
            System.out.println("Localização: " + evento.getLocalizacao());

            System.out.println("--------------//--------------");
        }
    }

    private static void consultarTarefa(){

        for (Tarefa tarefa : Tarefa.getTarefas()) {
            System.out.println("Título:" + tarefa.getTitulo());
            System.out.println("Data:" + tarefa.getData());
            if(tarefa.isSeEventoDuraDiaTodo())
                System.out.println("Duração: O dia inteiro");
            else{
                System.out.println("Hora de início:" + tarefa.getHora());
            }

            System.out.println("Categoria: " + tarefa.getCategoria());


            System.out.println("--------------//--------------");
        }
    }
}
