
import java.time.LocalDate;
import java.util.Scanner;

public class TestAgent {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Agent[] agents = new Agent[2];
        for (int i = 0; i < agents.length; i++) {

            System.out.println("\n--- Agent " + (i + 1) + " ---");

            System.out.print("Matricule : ");
            int matricule = sc.nextInt();
            sc.nextLine();

            System.out.print("Nom : ");
            String nom = sc.nextLine();

            System.out.print("Prenom : ");
            String prenom = sc.nextLine();

            System.out.print("Numero adresse : ");
            int numero = sc.nextInt();
            sc.nextLine();

            System.out.print("Rue adresse : ");
            String rue = sc.nextLine();

            System.out.print("Ville adresse : ");
            String ville = sc.nextLine();

            System.out.print("Pays adresse : ");
            String pays = sc.nextLine();

            System.out.print("Date (AAAA-MM-JJ) : ");
            LocalDate date = LocalDate.parse(sc.nextLine());

            Adress add = new Adress(numero, rue, ville, pays);

            agents[i] = new Agent(
                    matricule, nom, prenom, add, date
            );
        }

        System.out.println("\n===== LISTE DES AGENTS =====");

        for (int i = 0; i < agents.length; i++) {
            System.out.println("\nAgent " + (i + 1) + " :");
            System.out.println(agents[i]);
        }

        sc.close();
    }
}
