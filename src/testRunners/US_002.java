package testRunners;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.Ecurie;
import main.Pilote;
import org.junit.Assert;


public class US_002 {
	private Ecurie ecurie1 = new Ecurie();
	private Ecurie ecurie2 = new Ecurie();
	private Pilote pilote1 = new Pilote();
	
	@Given("La création de deux écuries avec un pilote affecté à un écurie un")
	public void la_création_de_deux_écuries_avec_un_pilote_affecté_à_un_écurie_un() {
	    // Write code here that turns the phrase above into concrete actions
		ecurie1.setNom("ecurie1");
		ecurie2.setNom("ecurie2");
		pilote1.setEcurie(ecurie1);
	}

	@When("l utilisateur affecte le pilote à l écurie deux")
	public void l_utilisateur_affecte_le_pilote_à_l_écurie_deux() {
	    // Write code here that turns the phrase above into concrete actions
		pilote1.setEcurie(ecurie2);
	}

	@Then("l utilisateur récupère la liste de l écurie un qui doit être vide et écurie deux contenir le pilote")
	public void l_utilisateur_récupère_la_liste_de_l_écurie_un_qui_doit_être_vide_et_écurie_deux_contenir_le_pilote() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals( pilote1 , ecurie2.getPilotes().get(0));
	}
}
