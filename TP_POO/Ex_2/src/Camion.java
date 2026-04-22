class Camion extends Vehicule {
    private double capaciteDeCharge;

    public Camion(String marque, String modele, int annee, double capaciteDeCharge) {
        super(marque, modele, annee);
        this.capaciteDeCharge = capaciteDeCharge;
    }

    @Override
    public void afficherDetails() {
        demarrer();
        System.out.println("Camion: " + getMarque() + " " + getModele()
                + " (" + getAnnee() + "), Capacité: " + capaciteDeCharge + " tonnes");
    }
}
