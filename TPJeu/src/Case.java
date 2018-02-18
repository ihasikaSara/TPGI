/**
 * les cases de la grille sur laquelle se passe le jeu
 * @author mac
 *
 */
public class Case {
	/**
	 * l'attribut etat prend true s'il a subi un tir et false sinon 
	 */
	private boolean etat;
/**
 * getter de etat
 * @return etat
 */
	public boolean isEtat() {
		return etat;
	}
/**
 * Setter de etat
 * @param etat
 */
	public void setEtat(boolean etat) {
		this.etat = etat;
	}
/**
 * Constructeur par default
 */
	public Case() {
		super();
		this.etat = false;
	}
	/**
	 * Contructeur avec un input
	 * @param etat
	 */
public Case(boolean etat) {
	super();
	this.etat = etat;
}
	
}
