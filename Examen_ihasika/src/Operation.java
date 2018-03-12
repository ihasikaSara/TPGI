/**
 * Cette classe représente une opération élémentaire dans un compte
 * @author   HAFIDI IMAD
 */
public class Operation {
	public static void main(String[] args) {
	Operation op=new Operation("01/12/13",2345.0f);
	String test=op.getJour();
	System.out.println(test);
	}
	
	/**
	 * La date de l'opération sous la forme jj/mm/aa (05/12/14)
	 */
	private String Date;
	/**
	 * montant de l'opération 
	 */
	private Float montant;
	/**
	 * Le type d'opération 
	 */
	private TypeOperation type;
	
	public TypeOperation getType() {
		return type;
	}
	public void setType(TypeOperation type) {
		this.type = type;
	}
	public Operation() {
		super();
	}
	/**
	 * constructeur de la classe opération prend une date et un montant et initialise tous les attributs
	 * @param date
	 * @param montant
	 */
	
	
	public Operation(String date, Float montant) {
		super();
		Date = date;
		this.montant = montant;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public Float getMontant() {
		return montant;
	}
	public void setMontant(Float montant) {
		this.montant = montant;
	}
	/**
	 * une méthode qui return l'année de la date 
	 * @return String
	 */
	public String getAnnee(){
		String result="20"+Date.substring(6,8);
		return result;
	}
	/**
	 * une méthode qui return le mois de la date 
	 * @return String
	 */
	public String getMois(){
		String result=Date.substring(3,5);
		return result;
	}
	/**
	 * une méthode qui return le jour de la date 
	 * @return String
	 */
	public String getJour(){
		String result=Date.substring(0,2);
		return result;
	}
		
}
