package classes;

import java.util.ArrayList;
import java.util.List;

public class Etudiant {
	private String Nom;
	private String Prenom;
	private int Age;
	private List<Langage> langues;

	public Etudiant(String n, String p, int i) {
		this.Prenom = p;
		this.Nom = n;
		this.Age = i;
		this.langues = new ArrayList<Langage>();
	}

	public String getNom() {
		return this.Nom;

	}

	public String getPreom() {
		return this.Prenom;

	}

	public int getAge() {
		return this.Age;

	}

	public void setNom(String n) {
		this.Nom = n;

	}

	public void setPrenom(String p) {
		this.Prenom = p;
	}

	public void setAge(byte a) {
		this.Age = a;

	}

	public void ajouterLangue(Langage langue) {
		this.langues.add(langue);
	}

	public void afficher() {
		System.out.println("Etudaint " + Prenom + " " + Nom + "," + Age + "ans");
		for (int i = 0; i < langues.size(); i++) {
			System.out.print(langues.get(i).getNomLang());
			if (i < langues.size() - 1) {
				System.out.print(" , ");
			}
		}
		System.out.println();

	}

}
