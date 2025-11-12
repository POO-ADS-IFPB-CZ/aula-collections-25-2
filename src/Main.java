import model.Aluno;
import model.Professor;
import model.Turma;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Queue<Aluno> filaRefeitorio = new LinkedList<>();
        filaRefeitorio.offer(new Aluno("111.111.111-01", "João",
                202412010003l));
        filaRefeitorio.offer(new Aluno("222.222.222-02", "Maria",
                202412010014l));
        filaRefeitorio.offer(new Aluno("333.333.33-03", "Pedro",
                202412010005l));

        System.out.println("Ver o primeiro: "+filaRefeitorio.peek());

        while(!filaRefeitorio.isEmpty()){
            System.out.println(filaRefeitorio.poll());
        }

    }

}
