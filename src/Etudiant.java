public class Etudiant {
    String nom;
    double[] notes;
    double moyenne;
    String resultat;

    public Etudiant(String nom, double[] notes){
        this.nom = nom;
        this.notes = notes;
    }

    public void calculMoyenne(){
        double somme = 0;
        for (double n : notes){
            somme += n;
        }
        moyenne = somme / notes.length;

        if (moyenne >= 10){
            resultat = "admis";
        } else {
            resultat = "non admis";
        }
    }

    public void affiche() {
        System.out.println("Non : " + nom);
        System.out.print("Notes : ");
        for (double n : notes) {
            System.out.print(n + " ");
        }
        System.out.println("\nMoyenne : " + moyenne);
        System.out.println("Resultat : " + resultat);
        System.out.println("---------------------");
    }
}