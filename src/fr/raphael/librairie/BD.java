package fr.raphael.librairie;





public class BD extends Livre {
	
	
    private final Genre GENRE = Genre.BD;

    private enum SousGenre{

        AVENTURE("Aventure"),
        HISTOIRE("Histoire"),
        HUMORISTIQUE("Humoristique"),
        SCIFI("Scifi");


        private final String NOM;

		private SousGenre(String nom) {
			NOM = nom;
		}
		
		private String getNOM() {
			return NOM;
		}
    }

    private SousGenre sg;

    public BD(String nom, String auteur, int numero, int prix, String sousgenre) {
        super(nom,auteur,numero,prix);
		
		
		for (SousGenre g : SousGenre.values()) {
			//Si la valeur de g (son String associé) correspond à sousgenre, on attribut le sous genre
		     if (g.getNOM() == sousgenre) this.sg = g;
		 }
    }

    public String toString() {
		return (this.getNom() + " de " + this.getAuteur() + "\nGenre: BD " + this.sg.getNOM() + "\nNumero: " + this.getNumero());
	}

    public static void main(String[] args) {
        BD bd1 = new BD("Astérix&Obélix", "Albert Uderzo",4988,15,"Humoristique");
        BD bd2 = new BD("Les Légendaires", "Patrick Sobral",4987,20,"Aventure");
        System.out.println(bd1.toString());
        System.out.println(bd2.toString());
    }
}
