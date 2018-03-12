import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



/**
 * Cette classe représente une banque 
 * @author   HAFIDI IMAD
 */
public class Banque {
	/**
	 * Liste des clients, la clé est le numéro du client
	 */
	private HashMap<Integer, Client> mesClients;
	/**
	 * Nom de la banque
	 */
	private String nom;
	
	/**
	 * La méthode respecte les régles suivantes :
	 * 1-Le client ne doit pas exister 
	 * 2-Le numéro du client est généré automatiquement ( dernier numéro +1)
	 * @param nom
	 * @param age
	 * @param typeCompte
	 * @return false : si le client n'est pas ajouté
	 */
	public boolean addClient(String nom,Integer age,  String prenom){
		 Iterator iterator = mesClients.entrySet().iterator();
	        while (iterator.hasNext()) {
	        	if(iterator.client==nom && iterator.Client.prenom=prenom && iterator.age==age)
	        	{
	        		System.out.println("Client deja existant");
	        		return false;
	        	}
	        	else
	        	{
	        		Client cl=new Client(nom,prenom,age); 
	        		  int lastKey = 0;
	        	     
	        	        for (Map.Entry<Integer, Client> entry : mesClients.entrySet()) {
	        	           lastKey = entry.getKey();
	        	        }
	        		mesClients.put(lastKey+1, cl);
	        		return true;
	        	}
	       
	        }
	}
	/**
	 * La méthode ajoute un compte et l'attribue à un client
	 * @param client
	 * @param typeCompte
	 * @return false : si le compte n'est pas crée
	 */
	public boolean addCompte(Client client, String typeCompte){
	
	Iterator<Compte> it = client.mesComptes.iterator();
		 
			if(typeCompte=="epargne")
			{Compte cmpt=new CompteCourant(1,0.0f,-300.0f);
			client.mesComptes.add(cmpt);
			return true;}
			else
			{
				Compte cmpt2=new CompteEpargne(1,0.0f);
				client.mesComptes.add(cmpt2);
				return true;
			}
	}
	/**
	 * La méthode supprime un client si seulement si le solde de tous ses comptes 
	 * est zéro
	 * @param client
	 * @return false si le client est supprimé
	 */
	public boolean removeClient(Client client) {
		
			if(mesClients.containsValue(client))
			{
				mesClients.remove(client);
				return true;
			}
			else
			{
				return false;
			}

	}
	/**
	 * Cette méthode affiche les relvés bancaires d'un client pour une date précise(05/14)
	 * @param id
	 */
	public void afficheTousComptesClient(Integer id, String mois, String année){
		//TODO
	}

}
