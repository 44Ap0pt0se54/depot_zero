package casino;

public class JoueursENSEM extends JoueurHawks {
	
	JoueursENSEM(int somme_initiale, int mise_depart){
		super(somme_initiale,mise_depart);
	}
	
	@Override
	void JouerHawks(int resultat) {
		
		if(this.besace>=56+510) {
			System.out.println("Les 56€ ont été atteints");
		}
		
		else {
		
			this.miser_Passe(mise,resultat);
			if(Roulette.estPasse(resultat)) {
				mise=mise_initiale;
			}
			else if(Roulette.estPasse(resultat)==false & mise<=(int)((this.table_de_jeu.mise_max*7)/2)) {    
				mise=mise*2;
			}	
		}
	}
}
	
