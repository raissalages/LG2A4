package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static int opcaoMenuPrincipal;
    private static int opcaoEvento;

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Evento evento = new Evento();

        GerenciadorLista.adicionar(agenda.getEventos(), evento);

        exibirMenuInicial();

        exibirTiposDeEventos();

        switch (opcaoMenuPrincipal){
            case 1:
                break;
            case 2:

                break;
            case 3:
                break;

            case 4:
                break;
        }


    }

    public static void exibirMenuInicial(){
        System.out.println("1. Cadastrar");
        System.out.println("2. Remover");
        System.out.println("3. Consultar");
        System.out.println("4. Excluir");
        System.out.print("Indique a opção desejada:");
        opcaoMenuPrincipal = scan.nextInt();

    }

    public static void exibirTiposDeEventos(){
        System.out.println("1. Evento");
        System.out.println("2. Lembrete");
        System.out.println("3. Tarefa");
        System.out.print("Indique a opção desejada:");
        opcaoEvento = scan.nextInt();

    }


}


