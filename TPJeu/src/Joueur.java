
public class Joueur {
	private String nom;
	private Grille grille;
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Grille getGrille() {
		return grille;
	}
	public void setGrille(Grille grille) {
		this.grille = grille;
	}
	public Joueur(String nom, Grille grille) {
		super();
		this.nom = nom;
		this.grille = grille;
	}
	public Joueur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Joueur(String nom) {
		super();
		this.nom = nom;
	}
	
	

	
}
