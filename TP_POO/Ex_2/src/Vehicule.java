abstract class Vehicule {
    private String marque;
    private String modele;
    private int annee;

    public Vehicule(String marque, String modele, int annee) {
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
    }

    public String getMarque() { return marque; }
    public String getModele() { return modele; }
    public int getAnnee()     { return annee; }

    public void demarrer() {
        System.out.println("Le véhicule démarre.");
    }

    public abstract void afficherDetails();
}
