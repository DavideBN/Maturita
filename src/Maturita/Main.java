package Maturita;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int studenti = 0;
        System.out.print("Inserisci il numero di studenti presenti: ");
        studenti = in.nextInt();
        Classe miaClasse = new Classe(studenti);
        for (int i = 0; i < studenti; i++){
            System.out.print("Inserisci il nome dello studente " + (i+1 ) + ": ");
            String nome = in.next();
            System.out.print("Inserisci il cognome dello studente " + (i+1 ) + ": ");
            String cognome = in.next();
            System.out.print("Inserisci il voto dello studente " + (i+1 ) + ": ");
            int voto = in.nextInt();
            Studente mioStudente = new Studente(nome,cognome,voto,i);
            miaClasse.nuovoStudente(mioStudente);
        }
        System.out.println("Voto medio: " + miaClasse.votoMedioClasse());
        System.out.println("Voto max: " + miaClasse.votoMassimoClasse());
        System.out.println("Voto min: " + miaClasse.votoMinimoClasse());
        System.out.println("Studenti con il voto minimo: " + miaClasse.studenteVotoMinimo());
        System.out.println("Studenti con il voto massimo: " + miaClasse.studenteVotoMassimo());

    }
}
