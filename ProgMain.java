package ville_capitale;

public class ProgMain{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
      Capitale C1 = new Capitale("Espagne", "Madrid", 10000);
      Capitale C2 = new Capitale("Tunisia", "Tunis");
      Capitale C3 = new Capitale("France", "Paris");
      C2.setNbHabitans(300000);
      System.out.println(C1.toString());
      System.out.println(C2.getNbHabitans());
      System.out.println(C3.getNbHabitans());
    		*/
	 Ville v1, v2;
	 v1 = new Ville("Toulouse");
	 v2 = new Ville("Strasboutg", 272975);
	 
	 System.out.println(v1);    // toString override the System.out.println
	 System.out.println(v2);
	 System.out.println();
	 
	 Capitale c1, c2;
	 
	 c1 = new Capitale("france","paris" );
	 c2 = new Capitale("Italie", "Rome", 2700000);
	 c1.setNbHabitans(2181371);
	 System.out.println(c1);
	 System.out.println(c2);
	 System.out.println();
	 System.out.println("catégorie de la ville de: " + v1.getNom() + " "  + v1.categorie());
	 System.out.println("catégorie de la ville de: " + v2.getNom() + " "  + v2.categorie());
	 System.out.println("catégorie de la ville de: " + c1.getNom() + " "  + c1.categorie());

	 
		
	}

}
