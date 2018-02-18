/**
 * les cases de la grille sur laquelle se passe le jeu
 * @author mac
 *
 */
public class Case {
	private boolean etat;

	public boolean isEtat() {
		return etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}

	public Case() {
		super();
		this.etat = false;
	}
}
