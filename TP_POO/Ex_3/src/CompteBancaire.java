class CompteBancaire {
    protected String numeroCompte;
    protected double solde;

    public CompteBancaire(String numeroCompte, double soldeInitial) {
        this.numeroCompte = numeroCompte;
        this.solde = soldeInitial;
    }

    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("Dépôt de " + montant + " € sur le compte " + numeroCompte
                    + ". Nouveau solde : " + solde + " €");
        }
    }

    public void retirer(double montant) {
        if (montant > 0 && montant <= solde) {
            solde -= montant;
            System.out.println("Retrait de " + montant + " € du compte " + numeroCompte
                    + ". Nouveau solde : " + solde + " €");
        } else {
            System.out.println("Solde insuffisant sur le compte " + numeroCompte
                    + ". Solde actuel : " + solde + " €");
        }
    }

    public double getSolde() { return solde; }
    public String getNumeroCompte() { return numeroCompte; }
}
