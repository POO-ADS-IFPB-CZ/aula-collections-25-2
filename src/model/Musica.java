package model;

import java.util.Objects;

public class Musica {

    private String autor;
    private String genero;
    private String titulo;
    private int ano;

    public Musica(String autor, String genero, String titulo, int ano) {
        this.autor = autor;
        this.genero = genero;
        this.titulo = titulo;
        this.ano = ano;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                ", titulo='" + titulo + '\'' +
                ", ano=" + ano +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Musica musica)) return false;
        return ano == musica.ano && Objects.equals(autor, musica.autor) && Objects.equals(genero, musica.genero) && Objects.equals(titulo, musica.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autor, genero, titulo, ano);
    }
}
