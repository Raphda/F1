package testRunners;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.Ecurie;
import main.Pilote;
import org.junit.Assert;



public class US_000 {
	private Ecurie ecurie1 = new Ecurie();
	private Pilote pilote1 = new Pilote();
	private Pilote pilote2 = new Pilote();

	@Given("La création d une écurie avec un {string}, un {int} et une {string}, {string}")
	public void la_création_d_une_écurie_avec_un_un_et_une(String string, Integer int1, String string2,
			String string3) {
		ecurie1.setNom(string);
		ecurie1.setVictoire(int1);
		ecurie1.addPilote(pilote2);
		ecurie1.addPilote(pilote1);
		pilote1.setName(string2);
		pilote2.setName(string3);
	}

	@When("l utilisateur la valide")
	public void l_utilisateur_la_valide() {
	}

	@Then("l utilisateur récupère le {string}, un {int} et une {string}, {string} lorsqu il interoge l écurie")
	public void l_utilisateur_récupère_le_un_et_une_lorsqu_il_interoge_l_écurie(String string, Integer int1,
			String string2, String string3) {
		Assert.assertEquals(string, ecurie1.getNom());
		Assert.assertEquals(int1, (Integer) ecurie1.getVictoire());
		Assert.assertEquals(string2, ecurie1.getNamePilotes().get(1));
		Assert.assertEquals(string3, ecurie1.getNamePilotes().get(0));
	}
}
