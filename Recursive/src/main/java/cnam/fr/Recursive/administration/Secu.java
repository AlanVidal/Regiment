package cnam.fr.Recursive.administration;

//Singleton
public class Secu {
	double compteur;

	public Secu() {
		this.compteur = -1;
	}

	public double inscription(Gouvernement g) {
		compteur++;
		g.majList(compteur);
		return this.compteur;

	}

}
