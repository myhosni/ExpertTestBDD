package com.ExpertTestBDD.accueil.stepsDefinitions;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.ExpertTestBDD.accueil.pages.AccueilPageNosPackRevision;
import com.ExpertTestBDD.accueil.pages.AccueilPageNosPromotions;
import com.ExpertTestBDD.accueil.pages.AccueilPageNosPackRevision;
import com.ExpertTestBDD.accueil.pages.AccueilPageNosPackRevision;
import com.ExpertTestBDD.utils.CommonMethods;
import com.ExpertTestBDD.utils.Setup;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class AccueilStepsDefinitionsNosPackRevision extends CommonMethods {
	public WebDriver driver;
	private AccueilPageNosPackRevision accueilPageNosPackRevision = new AccueilPageNosPackRevision();
	private CommonMethods commonMethods = new CommonMethods();
	public AccueilStepsDefinitionsNosPackRevision() {
		driver = Setup.driver;
		PageFactory.initElements(driver, AccueilPageNosPackRevision.class);
	}
	
	@When("^I click on the image Packs de revision  Sélénium$")
	public void iClickOnTheImagePacksDeRevisionSélénium() throws Throwable {
		
		logger.info("^I click on the image Packs de revision  Sélénium$");
		scrollToElement(driver, AccueilPageNosPackRevision.imgPackRevisionA40Selenium);
		accueilPageNosPackRevision.goToPackRevisionA40Selenium();
	
	}
	@Then("^I check Page product Packs de revision  Sélénium is opening \"([^\"]*)\"$")
	public void iCheckPageProductPacksDeRevisionSéléniumIsOpening(String url1) throws Throwable {
		
		logger.info("^I check Page product Packs de revision  Sélénium is opening \\\"([^\\\"]*)\\\"$");
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(url1, actualUrl);
	 
	}
	@Then("^I check Page product Packs de revision  Sélénium contains \"([^\"]*)\"$")
	public void iCheckPageProductPacksDeRevisionSéléniumContains(String txtSelenium) throws Throwable {
	
		logger.info("^I check Page product Packs de revision  Sélénium contains \\\"([^\\\"]*)\\\"$");
		commonMethods.explicitWaitVisibility(10, AccueilPageNosPackRevision.txtPackRevisionA4qSelenium);
		Assert.assertEquals(txtSelenium, AccueilPageNosPackRevision.txtPackRevisionA4qSelenium.getText());

	}
	
	@When("^I click on the image Packs de revision IQBBA Business Analyste$")
	public void iClickOnTheImagePacksDeRevisionIQBBABusinessAnalyste() throws Throwable {
		
		logger.info("^I click on the image Packs de revision IQBBA Business Analyste$");
		scrollToElement(driver, AccueilPageNosPackRevision.imgPackRevisionIqbbaBusinessAnalyste);
		accueilPageNosPackRevision.goToPackRevisionBusinessAnalyste();
	}
	
	@Then("^I check Page product Packs de revision IQBBA Business Analyste \"([^\"]*)\"$")
	public void iCheckPageProductPacksDeRevisionIQBBABusinessAnalyste(String url1) throws Throwable {
		
		logger.info("^I check Page product Packs de revision IQBBA Business Analyste \\\"([^\\\"]*)\\\"$");
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(url1, actualUrl);
	}
	
	@Then("^I check Page product Packs de revision IQBBA Business Analyste contains \"([^\"]*)\"$")
	public void iCheckPageProductPacksDeRevisionIQBBABusinessAnalysteContains(String txtPackRevisionIqbba) throws Throwable {
		
		logger.info("^I check Page product Packs de revision IQBBA Business Analyste contains \\\"([^\\\"]*)\\\"$");
		commonMethods.explicitWaitVisibility(10, AccueilPageNosPackRevision.txtPackRevisionIqbbaBusinessAnalyste);
		Assert.assertEquals(txtPackRevisionIqbba, AccueilPageNosPackRevision.txtPackRevisionIqbbaBusinessAnalyste.getText());
	}
	
	@When("^I click on the image Packs de revision ISTQB Test Manager Niveau avancé$")
	public void iClickOnTheImagePacksDeRevisionISTQBTestManagerNiveauAvancé() throws Throwable {
	
		logger.info("^I click on the image Packs de revision ISTQB Test Manager Niveau avancé$");
		scrollToElement(driver, AccueilPageNosPackRevision.imgPackRevisionTestManager);
		accueilPageNosPackRevision.goToPackRevisionTestManager();
	}
	
	@Then("^I check Page product Packs de revision ISTQB Test Manager Niveau avancé \"([^\"]*)\"$")
	public void iCheckPageProductPacksDeRevisionISTQBTestManagerNiveauAvancé(String url1) throws Throwable {
		
		logger.info("^I check Page product Packs de revision ISTQB Test Manager Niveau avancé \\\"([^\\\"]*)\\\"$");
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(url1, actualUrl);
	
	}
	
	@Then("^I check Page product Packs de revision ISTQB Test Manager Niveau avancé contains \"([^\"]*)\"$")
	public void iCheckPageProductPacksDeRevisionISTQBTestManagerNiveauAvancéContains(String txtPackTestManager) throws Throwable {
		
		logger.info("^I check Page product Packs de revision ISTQB Test Manager Niveau avancé contains \\\"([^\\\"]*)\\\"$");
		commonMethods.explicitWaitVisibility(10, AccueilPageNosPackRevision.txtPackRevisionTestManager);
		Assert.assertEquals(txtPackTestManager, AccueilPageNosPackRevision.txtPackRevisionTestManager.getText());
	}
	@When("^I click on the image Packs de revision ISTQB Foundation$")
	public void iClickOnTheImagePacksDeRevisionISTQBFoundation() throws Throwable {
		
		logger.info("^I click on the image Packs de revision ISTQB Foundation$");
		scrollToElement(driver, AccueilPageNosPackRevision.imgPackRevisionIstqbFondation);
		accueilPageNosPackRevision.goToPackRevisionIstqb_Fondation();
	}
	@Then("^I check Page product Packs de revision ISTQB Foundation is opening \"([^\"]*)\"$")
	public void iCheckPageProductPacksDeRevisionISTQBFoundationIsOpening(String url1) throws Throwable {
		
		logger.info("^I check Page product Packs de revision ISTQB Foundation is opening \\\"([^\\\"]*)\\\"$");
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(url1, actualUrl);
	}
	@Then("^I check Page product Packs de revision ISTQB Foundation contains \"([^\"]*)\"$")
	public void iCheckPageProductPacksDeRevisionISTQBFoundationContains(String txtPackISTQB) throws Throwable {
		
		logger.info("^I check Page product Packs de revision ISTQB Foundation contains \\\"([^\\\"]*)\\\"$");
		commonMethods.explicitWaitVisibility(10, AccueilPageNosPackRevision.txtPackRevisionIstqbFondation);
		String s =AccueilPageNosPackRevision.txtPackRevisionIstqbFondation.getText();
		Assert.assertEquals(txtPackISTQB, AccueilPageNosPackRevision.txtPackRevisionIstqbFondation.getText());
	}
}