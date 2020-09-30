package Maturita;

public class Studente {

    private String nome;
    private String cognome;
    private int voto;
    private int nRegistro;

    public Studente(String nome,String cognome,int voto,int nRegistro){
        this.nome = nome;
        this.cognome = cognome;
        this.voto = voto;
        this.nRegistro = nRegistro;
    }

    public Studente(Studente s){
        this.nome = s.nome;
        this.cognome = s.cognome;
        this.voto = s.voto;
        this.nRegistro = s.nRegistro;
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

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    public int getnRegistro() {
        return nRegistro;
    }

    public void setnRegistro(int nRegistro) {
        this.nRegistro = nRegistro;
    }

    public String toString(){
        String ris = "Studente\n";
        ris = ris + "Num: " + getnRegistro() + "\n";
        ris = ris + "Nome: " + getNome() + "\n";
        ris = ris + "Cognome: " + getCognome() + "\n";
        ris = ris + "Voto: " + getVoto() + "\n";
        return ris;
    }

}
