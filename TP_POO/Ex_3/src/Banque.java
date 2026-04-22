public class Banque {
    public static void main(String[] args) {
        CompteCourant cc = new CompteCourant("CC-001", 1000.0);
        CompteEpargne ce = new CompteEpargne("CE-001", 5000.0);

        System.out.println("=== Compte Courant ===");
        cc.deposer(500);
        cc.retirer(200);
        cc.retirer(2000); // solde insuffisant

        System.out.println("\n=== Compte Epargne ===");
        ce.deposer(1000);
        ce.calculerInterets(3.5);
        ce.retirer(100);
    }
}
