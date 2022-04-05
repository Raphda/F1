package main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class EcurieTest {

	private Pilote pilote1;
    private Ecurie ecurie1;

    /**
     * Constructeur de la classe-test main.EcurieTest
     */
    public EcurieTest()
    {
    }

    /**
     * Met en place les engagements.
     *
     * M�thode appel�e avant chaque appel de m�thode de test.
     */
    @BeforeEach
    public void setUp() // throws java.lang.Exception
    {
        initialisePiloteAndEcurie();
        
        pilote1.setName("Carlos");
        ecurie1.setNom("Ferrari");
        
        pilote1.setEcurie(ecurie1);
    }

	private void initialisePiloteAndEcurie() {
		pilote1 = new Pilote();
        ecurie1 = new Ecurie();
	}

    /**
     * Supprime les engagements
     *
     * M�thode appel�e apr�s chaque appel de m�thode de test.
     */
    @AfterEach
    public void tearDown() // throws java.lang.Exception
    {
        //Lib�rez ici les ressources engag�es par setUp()
    }

    @Test
    public void testNewVictoire()
    {
        ecurie1.newVictoire();
        assertEquals(1, ecurie1.getVictoire());
    }

    @Test
    public void testGetPilotes()
    {
        assertEquals(1, ecurie1.getPilotes().size());
    }
    
    
    @Test
    public void testAddPilotes()
    {
    	Pilote pilote2 = new Pilote();
        pilote2.setName("Charles");
        
        ecurie1.addPilote(pilote2);
        assertEquals(2, ecurie1.getPilotes().size());
        assertEquals("Ferrari", pilote2.getEcurie().getNom());
    }
    
    @Test
    public void testRemovePilotes()
    {
    	Pilote pilote2 = new Pilote();
        pilote2.setName("Charles");
        
        ecurie1.removePilote(pilote2);
        assertEquals(1, ecurie1.getPilotes().size());
        assertNull(pilote2.getEcurie());
    }
    
    
    @Test
    public void testChangeEcurie()
    {
    	
    	Ecurie ecurie2 = new Ecurie();
    	ecurie2.setNom("Renault");
        
    	pilote1.setEcurie(ecurie2);
        assertEquals(1, ecurie2.getPilotes().size());
        assertEquals(0, ecurie1.getPilotes().size());
    }

}
