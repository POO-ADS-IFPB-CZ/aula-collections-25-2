package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayList {

    private String titulo;
    private List<Musica> musicas;

    public PlayList(String titulo){
        this.titulo = titulo;
        musicas = new ArrayList<>();
    }

    public boolean adicionar(Musica musica){
        if(musicas.contains(musica)) return false;
        return musicas.add(musica);
    }

    public boolean remover(Musica musica){
        return musicas.remove(musica);
    }

    public List<Musica> getMusicas(){
        return musicas;
    }

    public List<Musica> aleatorio(){
        Collections.shuffle(musicas);
        return musicas;
    }

}
