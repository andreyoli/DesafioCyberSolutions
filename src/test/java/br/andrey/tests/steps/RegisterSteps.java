package br.andrey.tests.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import br.andrey.tests.pages.RegisterPage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RegisterSteps {
    static Logger logger = LoggerFactory.getLogger(RegisterSteps.class);
    RegisterPage registerPage = new RegisterPage();

    @Given("that i open the page Register")
    public void openPage() {
        registerPage.openRegisterPage();
        logger.info("Open page");
    }

    @And("i passed my full name")
    public void writeFullName() {
        registerPage.fullName("Andrey", "Paula");
        logger.info("Written full name");
    }

    @And("i passed my address")
    public void writeAddress() {
        registerPage.address("Rua Salvador Malaquias Leal, Catiapoã - São Vicente");
        logger.info("Written address");
    }

    @And("i passed my email")
    public void writeEmail() {
        registerPage.emailAddress("andrey.o.paula@gmail.com");
        logger.info("Written email");
    }

    @And("i passed my phone number")
    public void writePhoneNumber() {
        registerPage.phone("1396101665");
        logger.info("Written phone");
    }

    @And("i marked my gender")
    public void markGender() throws Exception {
        registerPage.gender("male");
        logger.info("Marked gender");
    }

    @And("i checked my hobbies")
    public void checkHobbies() {
        registerPage.hobbies(true, false, true);
        logger.info("Checked hobbies");
    }

    @And("i select my languages")
    public void selectLanguages() {
        registerPage.languages();
        logger.info("Selected languages");
    }

    @And("i select my skill")
    public void selectSkill() {
        registerPage.skills();
        logger.info("Selected skill");
    }

    @And("i click on my country")
    public void clickOnCountry() {
        registerPage.clickCountry();
        logger.info("Clicked on country");
    }

    @And("i select countries")
    public void selectCountries() {
        registerPage.selectCountries();
        logger.info("Selected countries");
    }

    @And("i select my date of birth")
    public void selectDateOfBirth() {
        registerPage.dateOfBirth("1999", "April", "27");
        logger.info("Selected date of birth");
    }

    @And("i write my password and confirm him")
    public void writeAndConfirmPassword() {
        registerPage.password("Bees123");
        logger.info("Written and confirmed password");
    }

    @Then("i click in Submit button")
    public void clickInSubmit() {
        registerPage.submitForm();
        logger.info("Clicked on submit button");
        registerPage.closeBrowser();
        logger.info("Closed browser");
    }

}
