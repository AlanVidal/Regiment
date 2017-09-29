package cnam.fr.Recursive.administration;

import java.util.ArrayList;
import java.util.PrimitiveIterator.OfInt;

import cnam.fr.Recursive.human.Militaire;
import cnam.fr.Recursive.human.Officier;
import cnam.fr.Recursive.human.Soldat;

public class Armée {
	static Gouvernement g;

	static private Armée laSeuleArmee = new Armée(g);
	double numRegiment;

	ArrayList<Double> listeOfficier = new ArrayList<Double>();
	ArrayList<Double> listeSoldat = new ArrayList<Double>();
	ArrayList<Double> listeMilitaire = new ArrayList<Double>();
	ArrayList<Regiment> listeRegiment = new ArrayList<Regiment>();

	@SuppressWarnings("static-access")
	public Armée(Gouvernement g) {
		this.numRegiment = -1;
		this.g = g;
		newRegiment();
	}

	@SuppressWarnings("static-access")
	public Armée getArmée() {
		return this.laSeuleArmee;
	}

	public void mutation(int r, Militaire m) throws Exception {
		listeRegiment.remove(m.getRegiment());
		listeRegiment.get(r).addMilitaire(m);

		if (m.getClass() == Officier.class) {
			if (verifOfficier(listeRegiment.get(r))) {
				listeRegiment.get(r).setOfficier(null);
				listeRegiment.remove(m.getRegiment());
				listeRegiment.get(r).addMilitaire(m);
			} else {
				throw new Exception("Ce regiment comporte deja un officier");
			}
		}

	}

	@Override
	public String toString() {
		return "Armée [listeOfficier=" + listeOfficier + ", listeSoldat=" + listeSoldat + ", listeMilitaire="
				+ listeMilitaire + ", listeRegiment=" + listeRegiment + "]";
	}

	public Soldat newSoldat(String nom, String prenom, Secu secu) {
		int iRegiment = 0;
		Soldat s = new Soldat(nom, prenom, secu, this.g, this, iRegiment);
		listeRegiment.get(iRegiment).addMilitaire(s);
		return s;
	}

	public boolean verifOfficier(Regiment r) {
		if (r.getOfficier() != null) {
			return false;
		}
		return true;
	}

	public Officier newOffier(String nom, String prenom, Secu secu) {
		int iRegiment = 0;
		if (verifOfficier(listeRegiment.get(iRegiment))) {
			Officier o = new Officier(nom, prenom, secu, this.g, this, iRegiment);
			listeRegiment.get(iRegiment).addMilitaire(o);
			return o;
		} else {
			newRegiment();
			int size = listeRegiment.size();
			Officier o = new Officier(nom, prenom, secu, this.g, this, size);
			listeRegiment.get(iRegiment).addMilitaire(o);
			return o;
		}

	}

	public void newRegiment() {
		numRegiment++;
		Regiment r = new Regiment(this.numRegiment);
		listeRegiment.add(r);
	}

	public void afficherRegiment() {
		for (Regiment r : listeRegiment) {
			for (Militaire m : r.getListe()) {
				System.out.println("N° " + r.getNumRegiment() + " " + m.getClass());
			}
		}
	}

	public void enrolement(Militaire militaire) {
		listeMilitaire.add(militaire.getNumSecu());

		if (militaire.getClass() == Soldat.class) {
			listeSoldat.add(militaire.getNumSecu());

		}
		if (militaire.getClass() == Officier.class) {
			listeOfficier.add(militaire.getNumSecu());
		}
	}

}
