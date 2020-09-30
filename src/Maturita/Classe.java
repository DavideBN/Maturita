package Maturita;

public class Classe {

    private Studente[] studenti;
    private int studentiPresenti;

    public Classe(int nStudenti){
        this.studenti = new Studente[nStudenti];
    }

    public void nuovoStudente(Studente s){
        studenti[studentiPresenti] = new Studente(s);
        studentiPresenti++;
    }

    public int getStudentiPresenti() {
        return studentiPresenti;
    }

    public Studente[] getStudenti(){
        return studenti;
    }

    public double votoMedioClasse(){
        double somma = 0;
        for (int i = 0; i < studentiPresenti; i++){
            somma += studenti[i].getVoto();
        }
        return somma / studentiPresenti;
    }

    public int votoMinimoClasse(){
        int min = 10;
        for (int i = 0; i < studentiPresenti; i++){
            if (studenti[i].getVoto() < min){
                min = studenti[i].getVoto();
            }
        }
        return min;
    }

    public int votoMassimoClasse(){
        int max = 0;
        for (int i = 0; i < studentiPresenti; i++){
            if (studenti[i].getVoto() > max){
                max = studenti[i].getVoto();
            }
        }
        return max;
    }

    public String studenteVotoMinimo(){
        String ris = "";
        int min = votoMinimoClasse();
        for (int i = 0; i < studentiPresenti; i++){
            if (studenti[i].getVoto() == min){
                ris = ris + "\n" + studenti[i].getNome() + " " + studenti[i].getCognome();
            }
        }
        return ris;
    }

    public String studenteVotoMassimo(){
        String ris = "";
        int max = votoMassimoClasse();
        for (int i = 0; i < studentiPresenti; i++){
            if (studenti[i].getVoto() == max){
                ris = ris + "\n" + studenti[i].getNome() + " " + studenti[i].getCognome();
            }
        }
        return ris;
    }

    public String toString(){
        String ris = "Classe\n";
        for (int i = 0; i < studentiPresenti; i++){
            ris = ris + studenti.toString();
        }
        return ris;
    }
}
