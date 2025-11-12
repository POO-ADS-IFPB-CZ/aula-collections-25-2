import model.Aluno;
import model.Professor;
import model.Turma;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Professor professor = new Professor("111.111.111-01",
            "João", 2000);
        Turma turma = new Turma(professor, "POO");
        turma.matricular(new Aluno("222.222.222-02",
                "Maria", 202412010002l));
        turma.matricular(new Aluno("333.333.333-03",
                "Pedro", 202412010003l));
        System.out.println(turma.getAlunos());
    }

}
