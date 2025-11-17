import model.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        PlayList playList = new PlayList("Aula POO");
        playList.adicionar(new Musica("J. Eskine",
            "Arrocha", "Resenha do Arrocha", 2025));
        playList.adicionar(new Musica("Gil Bala",
            "Arrocha", "Tremidão", 2024));
        playList.adicionar(new Musica("Slipknot",
                "Rock", "Duality", 2020));

        System.out.println(playList.getMusicas());
        System.out.println(playList.aleatorio());
        System.out.println(playList.getMusicas());

    }

}
