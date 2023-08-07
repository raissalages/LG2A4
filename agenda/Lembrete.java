package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Lembrete extends Modelo{


    private static ArrayList<Lembrete> lembretes = new ArrayList<>();

    public Lembrete() {
    }

    public Lembrete(String titulo, String categoria, String data, String hora) {
        super(titulo, categoria, data, hora);
    }

    public static ArrayList<Lembrete> getLembretes() {
        return lembretes;
    }
}
