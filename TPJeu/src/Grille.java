/**
 * La grille de jeu
 * @author mac
 *
 */
public class Grille {
	/**
	 * declaration de 100 case constituant la grille
	 */
public Case[][] matrice=new Case[10][10];
	/**
	 * au cas du tir, l'etat de la case change en true
	 * @param i
	 * @param j
	 */
	public void tir(int i,int j)
	{
		this.matrice[i][j].setEtat(true);
		
	}
/**
 * constructeur par defaut qui fait appel à des cases qui prennent la valeur False
 */
	public Grille() {
		super();
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				this.matrice[i][j]=new Case(); 
			}
		}
	}
	/**
	 * affiche la grille du joueur 
	 */
	public void afficheTirs()
	{	int i,j;
		for(i=0;i<10;i++)
		{
		for(j=0;j<10;j++)
		{
			if(matrice[i][j].isEtat()==false)
			{
				System.out.print(" ");
			}
			else
			{
				System.out.print("o");
			}
			
		}
		System.out.println();
		}
}
}
