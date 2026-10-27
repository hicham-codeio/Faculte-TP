import java.util.Scanner;
public class Exercice1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.printf("Saisir Prix HT : ");
        double prixHt = sc.nextDouble();

        System.out.printf("Saisir Categorie (alimentaire / autre) : ");
        String categorie = sc.next();

        System.out.printf("Saisir le nombre article : ");
        int nbrArticles = sc.nextInt();

        double TVA ;

        if (categorie.equalsIgnoreCase("alimentaire")){
            TVA = 0.07;
        } else {
            TVA = 0.2;
        }

        double prixTTC = prixHt * (1+TVA);
        double prixLotTTC = prixTTC * nbrArticles;

        System.out.printf("Prix TTC du produit = %.2f DH%n", prixTTC);
        System.out.printf("Prix TTC du lot = %.2f DH", prixLotTTC);

        sc.close();
    }
}