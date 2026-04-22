public class Zoo {
    public static void main(String[] args) {
        Animal tigre = new Mammifere("Tigre");
        Animal perroquet = new Oiseau("Perroquet");

        tigre.faireDuBruit();     // Tigre grogne.
        perroquet.faireDuBruit(); // Perroquet chante.

        // Cast vers Oiseau pour accéder à voler() (méthode spécifique aux oiseaux)
        ((Oiseau) perroquet).voler(); // L'oiseau vole.
    }
}

