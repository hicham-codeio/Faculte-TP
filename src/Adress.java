public class Adress {
    int numero;
    String rue;
    String ville;
    String pays;

    public Adress(int numero, String rue, String ville, String pays) {
        this.numero = numero;
        this.rue = rue;
        this.ville = ville;
        this.pays = pays;
    }

    public int getNumero(){
        return numero;
    }
    public String getRue(){
        return rue;
    }
    public String getVille(){
        return ville;
    }
    public String getPays(){
        return pays;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setRue(String rue){
        this.rue = rue;
    }
    public void setVille(String ville){
        this.ville = ville;
    }
    public void setPays(String pays){
        this.pays = pays;
    }

    @Override
    public String toString() {
        return numero + " " + rue + " " + ville + " " + pays;
    }

}
