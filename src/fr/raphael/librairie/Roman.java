package fr.raphael.librairie;

public class Roman extends Livre {

	private final Genre GENRE = Genre.ROMAN;
	
	
	
	private enum SousGenre{
		//======== à changer selon le Genre (Roman, BD, ...) ===========
		CLASSIQUE("Classique"),
		POLICIER("Policier"),
		AMOUR("Amour"),
		SCIFI("Scifi"),
		CONTEMPORAIN("Contemporain"),
		AVENTURE("Aventure");
		//==============================================================
		
		
		private final String NOM;

		private SousGenre(String nom) {
			NOM = nom;
		}
		
		private String getNOM() {
			return NOM;
		}
		
	}
	private SousGenre sg;
	
	
	public Roman(String nom, String auteur, int numero, int prix, String sousgenre) {
		super(nom,auteur,numero,prix);
		
		
		//On itere sur l'enum SousGenre
		for (SousGenre g : SousGenre.values()) {
			//Si la valeur de g (son String associé) correspond à sousgenre, on attribut le sous genre
		     if (g.getNOM() == sousgenre) this.sg = g;
		 }
		
	}
	
	public String toString() {
		return (this.getNom() + " de " + this.getAuteur() + "\nGenre: Roman " + this.sg.getNOM() + "\nNumero: " + this.getNumero());
	}
	
	//exemple:
	public static void main(String[] args) {
		Roman rom = new Roman("Le Rouge et le Noir", "Stendhal", 245624, 15, "Classique");
		System.out.println(rom.toString());
	}
}
