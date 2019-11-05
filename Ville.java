/*
 * 
 *@author: AhmNouira 
 *
 */

package ville_capitale;


public class Ville {
	
   /************************** Attributes *******************************************/
    protected final String nom;  		// declare nom as const
    protected Integer nbHabitants;   	// declare nbHabitants as Integer Object
    protected char categorie;           // for the constructor control
    
    /************************************ Constructors ******************************/

    public Ville(String nom) {
    	this.nom = nom.toUpperCase();
    	this.categorie = '?';
    }
    
    public Ville(String nom, int nbH) {
	this.nom = nom.toUpperCase();
	this.nbHabitants = nbH;
	this.categorie = 'A';
   }
    
    
    
   
    /************************** Getter & Setter : only getter for Name of the city ************************************************/
    public String getNom() {
    	return nom;
    }
    
    public int getNbHabitans() {
    	if (this.nbHabitants == null) {
    		return 0;
    	} else {
    		
    		return this.nbHabitants;
    			
    		}
    	}
    	
    public void setNbHabitans(int n) {
    	if ( n < 0) {
    		this.nbHabitants = 0;
    	}
    		else {
    			this.nbHabitants = n;
    		}
    	}
    	
    
    /***********************   Members   ***********************************************************/
    
      public boolean nbHabitansConnu() {
    	  if (nbHabitants == null){
    		  	return true;
    	  } else {
    		  return false;
    	  }
      }
      
      public char categorie() {
    	  return this.categorie;
      }
      
      
      
      /*
      public char categorie() {
      	  if (nbHabitants  == null){
      		  	return '?';
      	  } 
      		  else {
      			  return 'A';
      	  } 
        }*/
      
      
     
   	 public String toString(){
    	 if (this.nbHabitants != null) { 
    		 return ("Ville de " + getNom() +": " + getNbHabitans() +" habitans.");
   	 }
    	 else {
    		 return ("Ville de " + getNom());
    	 }
     }
     
    
     
}
     
    
    
    
    

    