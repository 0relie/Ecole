package fr.adaming.ecole.humain;

public class Ecole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Eleve leMeilleur = new Eleve();
		Eleve lePire = new Eleve();
		Eleve leTricheur = new Eleve();
		Prof leProf = new Prof();
		Prof leProfTechno = new Prof(2200);
		Prof leProfMath = new Prof("Master Mathematique", 2500);
		leProfMath.adresse="24 rue des oliviers 4150 DjerbaLaDouce";
		leProfMath.age=29;
		leProfMath.nom="Herbert";
		leProfMath.prénom="Norbert";
		leProfMath.sexe='H';
		leProfMath.enseigne();
		leMeilleur.apprendre();
		
		System.out.println(leProfMath.toString());
		
	}

}
