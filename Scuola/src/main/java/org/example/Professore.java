package org.example;

public class Professore extends Persona{

    private String materia;

    public Professore(String nome, String cognome, int eta, String materia) {
        super(nome, cognome, eta);
        this.materia = materia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Professore{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", materia='" + materia + '\'' +
                '}';
    }
}
