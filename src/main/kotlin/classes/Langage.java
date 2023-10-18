package classes;

public class Langage {
	private int id;
	private String nomLangue;

	public Langage(int id, String nomLangue) {
		this.id = id;
		this.nomLangue = nomLangue;
	}

	public int getId() {
		return id;
	}

	public String getNomLang() {
		return nomLangue;
	}

}
