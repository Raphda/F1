package testRunners;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.Ecurie;
import org.junit.Assert;


public class US_001 {
	private Ecurie ecurie1 = new Ecurie();
	
	@Given("La création d une écurie avec un {string}, un {int}")
	public void la_création_d_une_écurie_avec_un_un(String string, int int1) {
		// Write code here that turns the phrase above into concrete actions
		ecurie1.setNom(string);
		ecurie1.setVictoire(int1);
	}

	@When("l utilisateur ajoute une nouvelle victoire")
	public void l_utilisateur_ajoute_une_nouvelle_victoire() {
		// Write code here that turns the phrase above into concrete actions
		ecurie1.newVictoire();
	}

	@Then("l utilisateur récupère le {int} qui doit être incrémenté de {int}")
	public void l_utilisateur_récupère_le_qui_doit_être_incrémenté_de(int int1, int int2) {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals( int1 +  int2 , ecurie1.getVictoire());
	}
}
