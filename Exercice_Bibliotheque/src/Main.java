public class Main
{

    public static void main(String[] args)
    {

        Bibliotheque bibliotheque = new Bibliotheque();
        // Ajout de livres
        Livre livre1 = new Livre("Les Misérables", "Victor Hugo", "1862", 1, true);
        Livre livre2 = new Livre("Germinal", "Emile Zola", "1885", 2, true);
        bibliotheque.ajouterLivre(livre1);
        bibliotheque.ajouterLivre(livre2);

        // Ajout d'auteurs
        Auteur auteur1 = new Auteur("Victor Hugo", "26 février 1802", "Française");
        Auteur auteur2 = new Auteur("Emile Zola", "2 avril 1840", "Française");
        bibliotheque.ajouterAuteur(auteur1);
        bibliotheque.ajouterAuteur(auteur2);

        // Ajout d'emprunteurs
        Emprunteur emprunteur1 = new Emprunteur("Alice", "10 rue des Fleurs", "01 23 45 67 89", "", "");
        Emprunteur emprunteur2 = new Emprunteur("Bob", "20 rue des Arbres", "02 34 56 78 90", "", "");
        bibliotheque.ajouterEmprunteur(emprunteur1);
        bibliotheque.ajouterEmprunteur(emprunteur2);

        // Affichage des livres, auteurs et emprunteurs
        System.out.println("Liste des livres :");
        bibliotheque.afficherLivres();

        System.out.println("\nListe des auteurs :");
        bibliotheque.afficherAuteurs();

        System.out.println("\nListe des emprunteurs :");
        bibliotheque.afficherEmprunteurs();

        // Emprunt d'un livre
        bibliotheque.emprunterLivre(1, "Alice");

        // Affichage des livres et emprunteurs après emprunt
        System.out.println("\nListe des livres après emprunt :");
        bibliotheque.afficherLivres();

        System.out.println("\nListe des emprunteurs après emprunt :");
        bibliotheque.afficherEmprunteurs();

        // Retour d'un livre
        bibliotheque.retournerLivre(1);

        // Affichage des livres et emprunteurs après retour
        System.out.println("\nListe des livres après retour :");
        bibliotheque.afficherLivres();

        System.out.println("\nListe des emprunteurs après retour :");
        bibliotheque.afficherEmprunteurs();
    }

}