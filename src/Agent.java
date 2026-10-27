import java.time.LocalDate;
public class Agent {
    int matricule;
    String nom;
    String prenom;
    Adress adress ;
    LocalDate date;

    public Agent(){
        this.matricule = 0;
        this.nom = "";
        this.prenom = "";
        this.adress = new Adress(0, "", "", "");
        this.date = null;

    }

    public Agent(int matricule, String nom, String prenom, Adress adress, LocalDate date){
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.adress = adress;
        this.date = date;
    }

    public Agent(Agent agent){
        this.matricule = agent.matricule;
        this.nom = agent.nom;
        this.prenom = agent.prenom;
        this.adress = agent.adress;
        this.date = agent.date;
    }

    public int getMatricule(){
        return this.matricule;
    }
    public String getNom(){
        return this.nom;
    }
    public String getPrenom(){
        return this.prenom;
    }
    public Adress getAdress(){
        return this.adress;
    }
    public LocalDate getDate(){
        return this.date;
    }

    public void setMatricule(int matricule){
        this.matricule = matricule;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    public void setAdress(Adress adress){
        this.adress = adress;
    }
    public void setDate(LocalDate date){
        this.date = date;
    }

    @Override
    public String toString() {
        return matricule + " " + nom + " " + prenom
                + " " + adress + " " + date;
    }
}
