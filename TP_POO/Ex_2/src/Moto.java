class Moto extends Vehicule {
    private String typeDeGuidon;

    public Moto(String marque, String modele, int annee, String typeDeGuidon) {
        super(marque, modele, annee);
        this.typeDeGuidon = typeDeGuidon;
    }

    @Override
    public void afficherDetails() {
        demarrer();
        System.out.println("Moto: " + getMarque() + " " + getModele()
                + " (" + getAnnee() + "), Guidon: " + typeDeGuidon);
    }
}
