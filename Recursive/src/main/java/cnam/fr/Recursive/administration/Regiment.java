package cnam.fr.Recursive.administration;

import java.util.ArrayList;

import cnam.fr.Recursive.human.Militaire;
import cnam.fr.Recursive.human.Officier;

public class Regiment {
	ArrayList<Militaire> liste = new ArrayList<Militaire>();
	Officier officier = null;

	private int numRegiment;

	public Regiment(int numRegiment, Officier officier) {
		this.numRegiment = numRegiment;
		this.officier = officier;

	}

	public Regiment(int numRegiment) {
		this.numRegiment = numRegiment;
	}

	public void setOfficier(Officier o, Armée armée) throws Exception {
		if (officier != null && o != null) {
			officier.setRegiment(this.numRegiment, armée);
			officier = o;
		}
		this.officier = o;
	}

	public Officier getOfficier() {
		return this.officier;
	}

	public int getNumRegiment() {
		return this.numRegiment;
	}

	public ArrayList<Militaire> getListe() {
		return this.liste;
	}

	public void addMilitaire(Militaire m) {
		liste.add(m);
	}

}
