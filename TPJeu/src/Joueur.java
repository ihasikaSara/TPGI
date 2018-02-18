/**
 * class decrivant chaque joueur
 * @author mac
 *
 */
public class Joueur {
	private String nom;
	private Grille grille;
	
	/**
	 * getter du nom
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * setter du nom
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * getter de la Grille
	 * @return
	 */
	public Grille getGrille() {
		return grille;
	}
	/**
	 * setter de la grille
	 * @param grille
	 */
	public void setGrille(Grille grille) {
		this.grille = grille;
	}
	/**
	 * constructeur 
	 * @param nom
	 * @param grille
	 */
	public Joueur(String nom, Grille grille) {
		super();
		this.nom = nom;
		this.grille = grille;
	}
	/**
	 * Constructeur par defaut
	 */
	public Joueur() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * Constructeur qui prend juste le nom en parametre
	 * @param nom
	 */
	public Joueur(String nom) {
		super();
		this.nom = nom;
	}
	
	

	
}
