package fr.raphael.librairie;



public abstract class Livre {
	private int numero;
	private String auteur;
	private String nom;
	private int prix;


	public Livre(String nom, String auteur, int numero, int prix) {
		this.nom = nom;
		this.numero = numero;
		this.prix = prix;
		this.auteur = auteur;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Livre) {
			Livre l = (Livre) o;
			return (this.numero == l.numero);
		}
		return false;
	}
	
	public abstract String toString();
	
	public String getNom() {
		return nom;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public String getAuteur() {
		return auteur;
	}
	
	public int getPrix() {
		return prix;
	}
	
	public void setPrix(int p) {
		prix = p;
	}
	

	
}
