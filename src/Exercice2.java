public class Exercice2 {
    public static void main(String[] args) {


        Etudiant e1 = new Etudiant("Hicham", new double[]{18.5, 14.75, 16.0, 15.25});
        Etudiant e2 = new Etudiant("Lina", new double[] {1.5, 14.75, 0, 3.5});

        e1.calculMoyenne();
        e2.calculMoyenne();

        e1.affiche();
        e2.affiche();
    }
}
