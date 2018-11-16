package entites;

public class Livre {
	
	private  int id=0;
	private String titre;
	private String auteur;
	private String prix;
	private static int nbrInstance = 0;
	
	
	public Livre() {
		nbrInstance++;
		this.id = nbrInstance;
		};
	
	public Livre(String titre, String auteur, String prix) {
		nbrInstance++;
		this.titre = titre;
		this.auteur = auteur;
		this.prix = prix;
		this.id = nbrInstance;
	}
	
	public int getId() {
		return id;
	}

	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public String getPrix() {
		return prix;
	}
	public void setPrix(String prix) {
		this.prix = prix;
	}

//	moyen pour compter le nombre d'instance d'une classe
//	static final AtomicInteger COUNTER = new AtomicInteger(); 
//	final int id = 1+ COUNTER.getAndIncrement();

	/**
	 * return tout les attributs de la classe Livre
	 */
	public String toString() {
		
		return "la référence du livre est le " + this.id + ". Le titre du livre est "+this.titre+" écrit par " + this.auteur+ " vendu au prix de " + this.prix + "euros";
		
	}
	
}
