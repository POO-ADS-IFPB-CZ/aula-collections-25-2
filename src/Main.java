import model.Aluno;
import model.Professor;
import model.Turma;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<Aluno> alunos = new HashSet<>();
        alunos.add(new Aluno("111.111.111-01", "João",
                123456l));
        alunos.add(new Aluno("111.111.111-01", "João",
                123456l));
        alunos.add(new Aluno("222.222.222-02", "Maria",
                654321l));
        alunos.add(new Aluno("333.333.333-03", "Pedro",
                2577412l));

        System.out.println(alunos);

    }

}
