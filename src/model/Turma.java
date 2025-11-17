package model;

import java.util.HashSet;
import java.util.Set;

public class Turma {

    private Professor professor;
    private Set<Aluno> alunos;
    private String disciplina;

    public Turma(Professor professor, String disciplina) {
        this.professor = professor;
        alunos = new HashSet<>();
        this.disciplina = disciplina;
    }

    public boolean matricular(Aluno aluno){
        return alunos.add(aluno);
    }

    public boolean trancar(Aluno aluno){
        return alunos.remove(aluno);
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Set<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(Set<Aluno> alunos) {
        this.alunos = alunos;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
