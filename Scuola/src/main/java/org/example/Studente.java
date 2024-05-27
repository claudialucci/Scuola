package org.example;

public class Studente extends Persona{

    private String matricola;
    private int voto;

    public Studente(String nome, String cognome, int eta, String matricola,int voto) {
        super(nome, cognome, eta);
        this.matricola = matricola;
        this.voto = voto;

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

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", matricola='" + matricola + '\'' +
                ", voto=" + voto +
                '}';
    }
}
