package cnam.fr.Recursive.administration;

import java.util.ArrayList;

import cnam.fr.Recursive.human.Militaire;
import cnam.fr.Recursive.human.Officier;

public class Regiment {
	ArrayList<Militaire> liste = new ArrayList<Militaire>();
	Officier officier;

	private double numRegiment;

	public Regiment(double numRegiment, Officier officier) {
		this.numRegiment = numRegiment;
		this.officier = officier;

	}

	public Regiment(double numRegiment) {
		this.numRegiment = numRegiment;
	}

	public void setOfficier(Officier o) {
		this.officier = o;

	}

	public Officier getOfficier() {
		return this.officier;
	}

	public double getNumRegiment() {
		return this.numRegiment;
	}

	public ArrayList<Militaire> getListe() {
		return this.liste;
	}

	public void addMilitaire(Militaire m) {
		liste.add(m);
	}

}
