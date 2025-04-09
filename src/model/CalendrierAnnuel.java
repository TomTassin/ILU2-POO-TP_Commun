package model;

public class CalendrierAnnuel {
	private Mois[] calendrier;
	
	
	public CalendrierAnnuel() {
		calendrier = new Mois[12];
		calendrier[0] = new Mois("Janvier", 31);
		calendrier[1] = new Mois("Fevrier", 28);
		calendrier[2] = new Mois("Mars", 31);
		calendrier[3] = new Mois("Avril", 30);
		calendrier[4] = new Mois("Mai", 31);
		calendrier[5] = new Mois("Juni", 30);
		calendrier[6] = new Mois("Juillet", 31);
		calendrier[7] = new Mois("Aout", 31);
		calendrier[8] = new Mois("Septembre", 30);
		calendrier[9] = new Mois("Octobre", 31);
		calendrier[10] = new Mois("Novembre", 30);
		calendrier[11] = new Mois("Decembre", 31);
		
	}
	
	private static class Mois{
		private String nom;
		private Boolean[] jour;
		
		private Mois(String nom, int nbJours) {
			this.nom = nom;
			this.jour = new Boolean[nbJours];
		}
		
		private void reserver(int jour) {
			this.jour[jour-1] = true;
		}
		
		private boolean estLibre(int jour) {
			return this.jour[jour-1] == false;
		}
	}
	
	public boolean estLibre(int jour, int mois) {
		return calendrier[mois].estLibre(jour);
	}
	
	public boolean reserver(int jour, int mois) {
		return calendrier[mois].reserver(jour);
	}
	
}
