import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Jeu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grille grille1=new Grille();
		Grille grille2=new Grille();
		Joueur joueur1=new Joueur("sara",grille1);
		Joueur joueur2=new Joueur("khaoula",grille2);
		Jeu monjeu=new Jeu(joueur1,joueur2);
		monjeu.demarre();

	}

		/**
		 * Le premier joueur
		 */
		private Joueur joueur1;

		/**
		 * Le second joueur
		 */
		private Joueur joueur2;

		/**
		 * Le constructeur d'un nouveau jeu
		 *
		 * @param args contient les noms de chacun des joueurs. Si un des noms ou les deux manque,
		 * un nom par defaut est attribue
		 */
		
		public Jeu(String[] args) {
			if (args.length > 0) joueur1 = new Joueur(args[0]);
			else joueur1 = new Joueur("joueur1");
			if (args.length > 1) joueur2 = new Joueur(args[1]);
			else joueur2 = new Joueur("joueur2");
		}

		public Jeu(Joueur joueur1, Joueur joueur2) {
			super();
			this.joueur1 = joueur1;
			this.joueur2 = joueur2;
		}

		/**
		 * Saisie par le clavier un nombre entre 0 et 9
		 *
		 * @return un nombre entre 0 et 9 entre par l'utilisateur
		 */
		public static int saisiePosition() {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			int pos = -1;
			while (pos == -1) {
				try {
					pos = Integer.parseInt(reader.readLine());
					if ((pos < 0)||(pos > 9)) {
						System.out.println("Erreur - entrez une position entre 0 et 9");
						pos = -1;
					}
				} catch (Exception ex) {
					pos = -1;
					System.out.println("Erreur - entrez une position valide");
				}
			}
			return pos;
		}

		/**
		 * Gere la phase de tir des deux joueurs
		 */
		public void tirs() {
			System.out.println("PROGRAMME DE TESTS INTERMEDIAIRES");
			System.out.println("Chaque joueur tire 3 fois sur la grille vide de l'autre");
			for (int i = 0; i < 3; i++) {
				System.out.println("Joueur " + joueur1.getNom() + " au tir");
				System.out.println("Indiquez les coordonnees du tir (x puis y) entre 0 et 9");
				int x = saisiePosition();
				int y = saisiePosition();
				joueur2.getGrille().tir(x,y);
				joueur2.getGrille().afficheTirs();
				System.out.println("Joueur " + joueur2.getNom() + " au tir");
				System.out.println("Indiquez les coordonnees du tir (x puis y) entre 0 et 9");
				x = saisiePosition();
				y = saisiePosition();
				joueur1.getGrille().tir(x,y);
				joueur1.getGrille().afficheTirs();
			}
		}

		/**
		 * Demarre une nouvelle partie
		 */
		public void demarre() {
			tirs();
		}

		/**
		 * Methode executable qui lance une nouvelle partie
		 *
		 * @param args Les parametres de la ligne de commande. S'il y en a, ils seront utilises
		 * comme nom pour les joueurs
		 */
		
	}


