package fr.raphael.librairie;

public class Theatre extends Livre {

    private final Genre GENRE = Genre.THEATRE;
    
    private enum SousGenre{

        CLASSIQUE("classique"),
        DRAMATIQUE("Dramatique"),
        COMEDIE("Comédie");

        private final String NOM;

		private SousGenre(String nom) {
			NOM = nom;
		}
		
		private String getNOM() {
			return NOM;
		}
    }

    private SousGenre sg;

    public Theatre(String nom, String auteur, int numero, int prix, String sousgenre) {
        super(nom,auteur,numero,prix);
		
		
		for (SousGenre g : SousGenre.values()) {
			//Si la valeur de g (son String associé) correspond à sousgenre, on attribut le sous genre
		     if (g.getNOM() == sousgenre) this.sg = g;
		 }
    }

    public String toString() {
		return (this.getNom() + " de " + this.getAuteur() + "\nGenre: Theatre " + this.sg.getNOM() + "\nNumero: " + this.getNumero());
	}

    public static void main(String[] args) {
        Theatre The = new Theatre("Le Malade Imaginaire", "Moliere",257,10,"Comédie");
        System.out.println(The.toString());
    }

}
