
public class CompteEpargne extends Compte{
	private Float interet ;

	
	public CompteEpargne(Integer numero, Float solde) {
		super(numero, solde);
	}
	@Override
	/**
	 * Cette méthode doit respecter les régles métier suivantes :
	 * O- Verifier que le client n'est pas déja signataire
	 * 1-Les signataires doivent avoir le même nom de famille
	 * 2-Le nombre de signataire ne doit pas dépasser 3
	 * 3-L'interet est calculé par la moyenne d'interer offert de chaque tranche 
	 * d'age des signataires ( 5% pour les mineurs, 4% de 18 à 25, 3.5 de 25 à 40 , 
	 * 3% de 40 à 60 et 2.5 pour le reste)
	 */
	public boolean addSignataires(Client client) {
		
		if(getSignataires().size()<4) {
		getSignataires().add(client);
		return true;
		}
		else
			return false;
	}

	/**
	 * Cette méthode suuprime un signataire  et recalcule l'interet du compte
	 */
	@Override
	public boolean removeSignataires(Integer id) {
		getSignataires().remove(id);
				return true;
			}
	/**
	 * Cette méthode ajoute une opération en respectant les régles suivantes :
	 * 1- Pour un débit :  la somme ne doit jamais dépasser le solde
	 * 2- Pour un crédit : l'opération est permise seulement en anniversaire du compte
	 * 3- La méthode doit recalculer le solde
	 */
	@Override
	public boolean addOperation(Operation operation) {
		if(TypeOperation.débit)
		{
			if(operation.getJour()=="01" && operation.getMois()=="01") //anniversaire
			{
				
			}
			else
			{
				System.out.println("operation non permise");
				return false;
			}
		}
		if(TypeOperation.crédit)
		{
			if(operation.getMontant()<)
		}
		
	}
	/**
	 * Calcul l'interet et ajoute la somme au solde
	 */
	public void addIntert(){
		Float sold_actuel;
		sold_actuel=this.getSolde()+this.getSolde()*interet;
		this.setSolde(sold_actuel);
	}
}
