package cnam.fr.Recursive.human;

import cnam.fr.Recursive.administration.Armée;
import cnam.fr.Recursive.administration.Gouvernement;
import cnam.fr.Recursive.administration.Regiment;
import cnam.fr.Recursive.administration.Secu;

public class Soldat extends Militaire {

	public Soldat(String nom, String prenom, Secu secu, Gouvernement g,Armée armée, int regiment) {
		super(nom, prenom, secu, g, armée, regiment);
	}

	public void obeir() {
		System.out.println("Chef oui Chef !");
	}
 

}
