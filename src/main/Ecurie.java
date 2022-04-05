package main;

import java.util.ArrayList;

public class Ecurie
{
	// variables d'instance - remplacez l'exemple qui suit par le v�tre
	private int victoire;
	private String nom;
	private ArrayList<Pilote> pilotes;

	/**
	 * Constructeur d'objets de classe main.Ecurie
	 */
	public Ecurie()
	{
		// initialisation des variables d'instance
		this.victoire = 0;
		this.nom = null;
		this.pilotes = new ArrayList<>();
	}

	public ArrayList<Pilote> getPilotes()
	{
		return this.pilotes;
	}

	public void addPilote(Pilote p)
	{
		if(this.pilotes.contains(p) == false) {
			this.pilotes.add(p);
		}

		if(p.getEcurie() == null) {
			p.setEcurie(this);

		} else if (!p.getEcurie().getNom().equals(this.getNom())){
			p.setEcurie(this);
		}

	}

	public void removePilote(Pilote p)
	{
		if(this.pilotes.contains(p)) {
			this.pilotes.remove(p);
			return;
		}

		if(p.getEcurie() != null) {
			p.setEcurie(null);
		} 

	}

	public void setVictoire(int vict)
	{
		this.victoire = vict;
	}

	public int getVictoire()
	{
		return this.victoire;
	}

	public void setNom(String n)
	{
		this.nom = n;
	}

	public String getNom()
	{
		return this.nom;
	}

	public void newVictoire()
	{
		this.victoire +=1;
	}

	public ArrayList<String> getNamePilotes()
	{
		ArrayList<String> nameList = new ArrayList <>();
		for(int i=0; i<(this.pilotes.size()); i++) {
			nameList.add(this.pilotes.get(i).getName());
		}
		return nameList;
	}

}
