import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("Maria");
        nomes.add(0, "Pedro");
        System.out.println(nomes);
        nomes.remove("Maria");
        System.out.println(nomes);
        System.out.println("Indice de João: "+nomes.indexOf("João"));
        System.out.println("João existe? "+nomes.contains("João"));
        System.out.println("Lista inversa: "+nomes.reversed());


    }

}
