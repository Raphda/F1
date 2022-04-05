package main;

public class Pilote
{
    // variables d'instance - remplacez l'exemple qui suit par le v�tre
    private String name;
    private Ecurie ecurie;

    /**
     * Constructeur d'objets de classe main.Pilote
     */
    public Pilote()
    {
        // initialisation des variables d'instance
        name = "Anonyme";
        ecurie = null;
    }
    
    public void setName(String s)
    {
        name = s;
    }
    
    public String getName()
    {
        return name;
    }

	public Ecurie getEcurie() {
		return ecurie;
	}

	public void setEcurie(Ecurie ecurie) {
		
		if(this.ecurie != null) {
			this.ecurie.removePilote(this);
		}
		
		this.ecurie = ecurie;
		
		if(ecurie != null) {
			ecurie.addPilote(this);
		}
		
	}
}
