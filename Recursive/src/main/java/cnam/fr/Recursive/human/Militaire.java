package cnam.fr.Recursive.human;

import cnam.fr.Recursive.administration.Armée;
import cnam.fr.Recursive.administration.Gouvernement;
import cnam.fr.Recursive.administration.Secu;

public abstract class Militaire extends Personne {
	Armée armée;
	int regiment;

	public Militaire(String nom, String prenom, Secu secu, Gouvernement g, Armée armée, int regiment) {
		super(nom, prenom, secu, g);
		this.armée = armée;
		this.regiment = regiment;
		armée.enrolement(this);
	}

	public void setRegiment(int r, Armée armée) throws Exception {
		armée.mutation(r, this);
		this.regiment = r;
		
	}
	public int getRegiment() {
		return this.regiment;
	}
}
