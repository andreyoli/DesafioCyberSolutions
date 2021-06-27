package br.andrey.tests.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import br.andrey.tests.pages.RegisterPage;

public class RegisterSteps {
    RegisterPage registerPage = new RegisterPage();

    @Given("that i open the page Register")
    public void openPage() {
        registerPage.openRegisterPage();
        System.out.println("Open page");
    }

    @And("i passed my full name")
    public void writeFullName() {
        registerPage.fullName("Andrey", "Paula");
        System.out.println("Written full name");
    }

    @And("i passed my address")
    public void writeAddress() {
        registerPage.address("Rua Salvador Malaquias Leal, Catiapoã - São Vicente");
        System.out.println("Written address");
    }

    @And("i passed my email")
    public void writeEmail() {
        registerPage.emailAddress("andrey.o.paula@gmail.com");
        System.out.println("Written email");
    }

    @And("i passed my phone number")
    public void writePhoneNumber() {
        registerPage.phone("1396101665");
        System.out.println("Written phone");
    }

    @And("i marked my gender")
    public void markGender() throws Exception {
        registerPage.gender("male");
        System.out.println("Marked gender");
    }

    @And("i checked my hobbies")
    public void checkHobbies() {
        registerPage.hobbies(true, false, true);
        System.out.println("Checked hobbies");
    }

    @And("i select my languages")
    public void selectLanguages() {
        registerPage.languages();
        System.out.println("Selected languages");
    }

    @And("i select my skill")
    public void selectSkill() {
        registerPage.skills();
        System.out.println("Selected skill");
    }

    @And("i click on my country")
    public void clickOnCountry() {
        registerPage.clickCountry();
        System.out.println("Clicked on country");
    }

    @And("i select countries")
    public void selectCountries() {
        registerPage.selectCountries();
        System.out.println("Selected countries");
    }

    @And("i select my date of birth")
    public void selectDateOfBirth() {
        registerPage.dateOfBirth("1999", "April", "27");
        System.out.println("Selected date of birth");
    }

    @And("i write my password and confirm him")
    public void writeAndConfirmPassword() {
        registerPage.password("Bees123");
        System.out.println("Written and confirmed password");
    }

    @Then("i click in Submit button")
    public void clickInSubmit() {
        registerPage.submitForm();
        System.out.println("Clicked on submit button");
        registerPage.closeBrowser();
        System.out.println("Closed browser");
    }

}
