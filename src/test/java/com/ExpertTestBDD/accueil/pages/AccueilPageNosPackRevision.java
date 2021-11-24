package com.ExpertTestBDD.accueil.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.ExpertTestBDD.utils.Setup;
public class AccueilPageNosPackRevision {
	
WebDriver driver;
	
public AccueilPageNosPackRevision() {
		driver = Setup.driver;
	}
	
	final static String IMG_PACK_REVISION_IQBBA_Business_Analyster ="//a[@href='https://www.expertest.tn/product/pack-de-revision-iqbba_-business-analyste/']";
	final static String IMG_PACK_REVISION_TEST_MANAGER ="//a[@href='https://www.expertest.tn/product/pack-de-revision-test-manager-niveau-avance/']";
	final static String IMG_PACK_REVISION_ISTQB ="//a[@href='https://www.expertest.tn/product/pack-de-revision-istqb-niveau-fondation/']";
	final static String IMG_PACK_REVISION_A4Q_SELENIUM ="//a[@href='https://www.expertest.tn/product/pack-de-revision-a4q-selenium-niveau-fondation/']";
	final static String TXT_PACK_REVISION_A4Q_SELENIUM = "//h1[contains(text(),'Pack de révision : A4Q Sélénium Niveau Fondation')]";
	final static String TXT_PACK_REVISION_IQBBA_BUSINESS_ANALYSTE = "//h1[contains(text(),'Pack de révision IQBBA_ Business Analyste')]";
	final static String TXT_PACK_REVISION_TEST_MANAGER = "//h1[contains(text(),'Pack de révision Test Manager Niveau Avancé')]";
	final static String TXT_PACK_REVISION_ISTQB = "//h1[contains(text(),'Pack de révision ISTQB Niveau Fondation')]";
	/* @FindBy */
	
	
	@FindBy(how = How.XPATH, using = IMG_PACK_REVISION_ISTQB)
	public static WebElement imgPackRevisionIstqbFondation;
	
	@FindBy(how = How.XPATH, using = IMG_PACK_REVISION_A4Q_SELENIUM)
	public static WebElement imgPackRevisionA40Selenium;
	
	@FindBy(how = How.XPATH, using = IMG_PACK_REVISION_TEST_MANAGER)
	public static WebElement imgPackRevisionTestManager;
	
	@FindBy(how = How.XPATH, using = IMG_PACK_REVISION_IQBBA_Business_Analyster)
	public static WebElement imgPackRevisionIqbbaBusinessAnalyste;
	
	@FindBy(how = How.XPATH, using = TXT_PACK_REVISION_TEST_MANAGER)
	public static WebElement txtPackRevisionTestManager;
	
	@FindBy(how = How.XPATH, using = TXT_PACK_REVISION_IQBBA_BUSINESS_ANALYSTE)
	public static WebElement txtPackRevisionIqbbaBusinessAnalyste;
	
	@FindBy(how = How.XPATH, using = TXT_PACK_REVISION_ISTQB)
	public static WebElement txtPackRevisionIstqbFondation;
	
	@FindBy(how = How.XPATH, using = TXT_PACK_REVISION_A4Q_SELENIUM)
	public static WebElement txtPackRevisionA4qSelenium;
	/* Method */
	
	public void goToPackRevisionIstqb_Fondation() {
		imgPackRevisionIstqbFondation.click();
	}
	
	public void goToPackRevisionA40Selenium() {
		imgPackRevisionA40Selenium.click();
	}
	
	public void goToPackRevisionTestManager() {
		imgPackRevisionTestManager.click();
	}
	
	public void goToPackRevisionBusinessAnalyste() {
		imgPackRevisionIqbbaBusinessAnalyste.click();
	}
	
}