package ville_capitale;

public class Capitale extends Ville {

	/******************* Attributes *********************************************/
	
	protected String nom_pays;
	protected char cat;
			
	
	
	/******************** Constructors ***************************************/
	
	
	public Capitale(String cap, String ville) {
		super(ville);
		this.nom_pays = cap.toUpperCase();
		categorie = 'C';    				// sets the categorie to catipal
	}
	
	public Capitale(String cap ,String nom, int nbH) {
		super(nom, nbH);
		this.nom_pays = cap.toUpperCase();
		categorie = 'C';
	}
	
	@Override
	public String toString() {
		
		return (super.toString() + " Capitale de " + this.nom_pays);
  
		}
	
	/*
	public char categorie(){
		super.categorie();
		if (nom_pays != null) {
			return 'C';
		}
		else {
			return 0;
			
		}
	} */
	
	
			
	}
	

