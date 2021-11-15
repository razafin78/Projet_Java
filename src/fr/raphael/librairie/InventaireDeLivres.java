package fr.raphael.librairie;

import java.util.LinkedList;
import java.util.Iterator;

public class InventaireDeLivres<E extends Livre> {
	private int cpt;

	private LinkedList <E> inventory;
	public InventaireDeLivres() {
		inventory = new LinkedList <E>();
		
	}

	
	public void add(E l) {
		inventory.add(l);
		cpt++;
	}
	
	public void remove(E l) {
		if (cpt == 0) return;
		inventory.remove(l);
		cpt--;
	}
	
	//Voir si il existe exemplaires d'un livre à partir de son nom, si c'est le cas on affiche les livres (donc leur numero)
	
	public void find_by_name(String nom) {
		Iterator it = inventory.iterator();
		while (it.hasNext()) {
			Livre book = ((Livre) it.next());
			if (book.getNom() == nom) {
				System.out.println(book.toString());
			}
		}
	}
	
	//idem mais à partir de l'auteur
	public void find_by_author(String auteur) {
		Iterator it = inventory.iterator();
		while (it.hasNext()) {
			Livre book = ((Livre) it.next());
			if (book.getAuteur() == auteur) {
				System.out.println(book.toString());
			}
		}
	}
	//prend en argument un numero et renvoie le livre associé
	public E find_by_number(int numero) {
		Iterator it = inventory.iterator();
		while (it.hasNext()) {
			E book = ((E) it.next());
			if (book.getNumero() == numero) {
				return book;
			}
		}
		return null;
	}
	
	public void AfficherInventaire() {
		for (E livre: this.inventory) {
			System.out.println(livre.toString());
		}
	}
	public static void main(String[] args) {
		InventaireDeLivres<BD> invBD = new InventaireDeLivres<BD>();
		BD bd1 = new BD("Astérix&Obélix", "Albert Uderzo",4988,15,"Humoristique");
        BD bd2 = new BD("Les Légendaires", "Patrick Sobral",4987,20,"Aventure");
		invBD.add(bd1);
		invBD.add(bd2);
		invBD.AfficherInventaire();
		System.out.println((invBD.find_by_number(4988)).toString());
	}
}
