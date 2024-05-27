package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static <School> void main(String[] args) {

        Studente studente = new Studente("Mario", "Rossi", 24,"1", 10);
        Professore professore = new Professore("Giuseppe", "Verdi", 55,"Matematica");

        System.out.println(professore.toString());

        System.out.println(studente.toString());
    }



}