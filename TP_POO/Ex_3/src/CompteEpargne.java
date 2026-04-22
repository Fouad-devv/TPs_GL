class CompteEpargne extends CompteBancaire {

    public CompteEpargne(String numeroCompte, double soldeInitial) {
        super(numeroCompte, soldeInitial);
    }

    public void calculerInterets(double taux) {
        double interets = solde * taux / 100;
        solde += interets;
        System.out.println("Intérêts calculés (" + taux + "%) : +" + interets
                + " €. Nouveau solde : " + solde + " €");
    }
}
