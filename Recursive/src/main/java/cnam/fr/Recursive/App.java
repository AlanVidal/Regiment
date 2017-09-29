package cnam.fr.Recursive;

import cnam.fr.Recursive.administration.Armée;
import cnam.fr.Recursive.administration.Gouvernement;
import cnam.fr.Recursive.administration.Secu;
import cnam.fr.Recursive.human.Officier;
import cnam.fr.Recursive.human.Personne;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws Exception {

		Gouvernement g = new Gouvernement();
		Secu secu = new Secu();
		Armée armée = new Armée(g);

		Personne p0 = new Personne("MrPersonne", "Paul", secu, g);

		armée.newSoldat("a", "aa", secu);
		Officier o0 = armée.newOffier("b", "bb", secu);
		Officier o1 = armée.newOffier("bd", "bb", secu);
		armée.newRegiment();

		armée.mutation(1, o1);
		armée.newRegiment();

		armée.mutation(2, o1);
		armée.afficherRegiment();

	}
}
