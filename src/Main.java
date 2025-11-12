import java.util.*;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> nomes = new Stack<>();
        nomes.push(1);
        nomes.push(5);
        nomes.push(3);

        System.out.println("Topo: "+nomes.peek());

        while(!nomes.isEmpty()){
            System.out.println(nomes.pop());
        }


    }

}
