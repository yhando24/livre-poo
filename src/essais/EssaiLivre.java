package essais;

import java.util.Scanner;

import entites.Livre;

public class EssaiLivre {

	public static void main(String[] args) {
	

				
				Scanner sc = new Scanner(System.in);
				
				
				System.out.println("Combien de livres à gerer ?");
				
				int nbDeLivres = sc.nextInt();
				sc.nextLine();
			
				// Creation du tableau de livre d'une taille fixé par l'utilisateur
				
				Livre [] livres = new Livre[nbDeLivres];
				
				
				// creation des livres et ajout au tableau
				
				for(int i = 0; i<nbDeLivres; i++) {
					
					Livre livre = new Livre ();
					
					// ajout des attributs
					
					System.out.println("Veuillez saisir l'auteur " + (i+1));
					livre.setAuteur(sc.nextLine());
					
				
					System.out.println("Veuillez saisir le titre " + (i+1));
					livre.setTitre(sc.nextLine());
					
					
					System.out.println("Veuillez saisir le prix " + (i+1));					
					livre.setPrix(sc.nextLine());
					
					//ajout au tableau
					livres[i] = livre;
				}
				

			//affichage des livres
			for(int i=0; i<livres.length; i++) {
				
				System.out.println(livres[i].toString());

			}
	}	
			


}


