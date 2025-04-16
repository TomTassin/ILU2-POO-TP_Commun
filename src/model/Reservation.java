package model;

public abstract class Reservation {
	private int jour;
	private int mois;
	
	protected Reservation(int jour, int mois) {
		this.jour = jour;
		this.mois = mois;
	}

	@Override
	public String toString() {
		return "Le " + jour + "/" + mois + "\n";
	}
	
	
}
