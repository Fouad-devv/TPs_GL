class Mammifere extends Animal {

    public Mammifere(String nom) {
        super(nom);
    }

    @Override
    public void faireDuBruit() {
        System.out.println(getNom() + " grogne.");
    }
}
