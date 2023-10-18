package classes;

public class MAin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Langage arabe = new Langage(1, "Arabe");
		Langage francais = new Langage(2, "Français");
		Langage anglais = new Langage(3, "Anglais");
		Langage espagnol = new Langage(4, "Espagnol");
//        System.out.println(arabe.getNomLang());

		Etudiant ahmed = new Etudiant("Ahmed", "ALi", 22);
		ahmed.ajouterLangue(arabe);
		ahmed.ajouterLangue(francais);
		ahmed.ajouterLangue(anglais);

		Etudiant yassine = new Etudiant("Yassine", "ja", 18);
		yassine.ajouterLangue(arabe);
		yassine.ajouterLangue(francais);

		Etudiant khalid = new Etudiant("Khalid", "hj", 20);
		khalid.ajouterLangue(anglais);
		khalid.ajouterLangue(espagnol);

		ahmed.afficher();
		yassine.afficher();
		khalid.afficher();

	}

}
