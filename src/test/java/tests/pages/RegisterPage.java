package tests.pages;

import core.Dsl;
import org.openqa.selenium.By;

public class RegisterPage {
    private final Dsl browser = new Dsl();

    /**
     * Open Register page
     */
    public void openRegisterPage() {
        browser.goTo("http://demo.automationtesting.in/Register.html");
    }

    /**
     * Close Browser
     */
    public void closeBrowser() {
        browser.kill();
    }

    public void fullName(String firstName, String lastName) {
        By firstNameInput = new By.ByXPath("//input[@placeholder='First Name']");
        By lastNameInput = new By.ByXPath("//input[@placeholder='Last Name']");

        browser.writeOnElement(firstNameInput, firstName);
        browser.writeOnElement(lastNameInput, lastName);
    }

    /**
     * He writes an address in text area
     * @param address address to write in text area
     */
    public void address(String address) {
        By addressTextArea = new By.ByXPath("//textarea[@ng-model='Adress']");

        browser.writeOnElement(addressTextArea, address);
    }

    /**
     * He writes an address in input
     * @param email email to write in input
     */
    public void emailAddress(String email) {
        By emailInput = new By.ByXPath("//input[@type='email' and @ng-model='EmailAdress']");

        browser.writeOnElement(emailInput, email);
    }

    /**
     * He writes an address in input
     * @param phoneTenCharacters phone to write in input. Its needs to be 10 characters
     */
    public void phone(String phoneTenCharacters) {
        By phoneInput = new By.ByXPath("//input[@type='tel' and @ng-model='Phone']");

        browser.writeOnElement(phoneInput, phoneTenCharacters);
    }

    /**
     * Select your gender
     * @param gender gender to select. Only accept male/female
     * @throws Exception exception if written gender is not male/female
     */
    public void gender(String gender) throws Exception {
        By genderMaleInput = new By.ByXPath("//input[@type='radio' and @value='Male']");
        By genderFeMaleInput = new By.ByXPath("//input[@type='radio' and @value='FeMale']");

        if (gender.equalsIgnoreCase("Male")){
            browser.clickOnElement(genderMaleInput);
        } else if (gender.equalsIgnoreCase("Female")) {
            browser.clickOnElement(genderFeMaleInput);
        } else {
            throw new Exception("Invalid gender");
        }

    }

    /**
     * Check your hobbies
     * @param movies true if is your hobby
     * @param cricket true if is your hobby
     * @param hockey true if is your hobby
     */
    public void hobbies(Boolean movies, Boolean cricket, Boolean hockey) {
        By hobbyMovies = new By.ByXPath("//input[@type='checkbox' and @value='Movies']");
        By hobbyCricket = new By.ByXPath("//input[@type='checkbox' and @value='Cricket']");
        By hobbyHockey = new By.ByXPath("//input[@type='checkbox' and @value='Hockey']");

        if (movies.equals(true)){
            browser.clickOnElement(hobbyMovies);
        }
        if (cricket.equals(true)){
            browser.clickOnElement(hobbyCricket);
        }
        if (hockey.equals(true)){
            browser.clickOnElement(hobbyHockey);
        }

    }

    /**
     * Click on languages portuguese and english
     */
    public void languages() {
        By languageInput = new By.ByXPath("//div[@id='msdd']");
        By languagePortuguese = new By.ByXPath("//a[contains(text(), 'Portuguese')]");
        By languageEnglish = new By.ByXPath("//a[contains(text(), 'English')]");
        By languageLabel = new By.ByXPath("//label[contains(text(), 'Languages')]");

        browser.clickOnElement(languageInput);
        browser.clickOnElement(languagePortuguese);
        browser.clickOnElement(languageEnglish);

        // Click to hide div
        browser.clickOnElement(languageLabel);
    }

    /**
     * Select on skill programming
     */
    public void skills() {
        By skillProgramming = new By.ByXPath("//option[@value='Programming']");

        browser.clickOnElement(skillProgramming);
    }

    /**
     * Select country brazil
     */
    public void clickCountry() {
        By countryBrazil = new By.ByXPath("//option[@value='Brazil']");

        browser.clickOnElement(countryBrazil);
    }

    /**
     * Click on country Japan
     */
    public void selectCountries() {
        By countrySpan = new By.ByXPath("//span[@class='selection']");
        By countryJapan = new By.ByXPath("//li[@role='treeitem' and contains(text(), 'Japan')]");

        browser.clickOnElement(countrySpan);
        browser.clickOnElement(countryJapan);
    }

    /**
     * Select date of birth
     * @param year year of birth
     * @param monthInEnglish month of birth
     * @param day day of birth
     */
    public void dateOfBirth(String year, String monthInEnglish, String day) {
        By yearInput = new By.ByXPath("//option[@value='" + year + "']");
        By monthInput = new By.ByXPath("//option[@value='" + monthInEnglish + "']");
        By dayInput = new By.ByXPath("//option[@value='" + day + "']");

        browser.clickOnElement(yearInput);
        browser.clickOnElement(monthInput);
        browser.clickOnElement(dayInput);
    }

    /**
     * He writes a password and confirm him
     * @param password password
     */
    public void password(String password) {
        By firstPassword = new By.ByXPath("//input[@id='firstpassword']");
        By confirmPassword = new By.ByXPath("//input[@id='secondpassword']");

        browser.writeOnElement(firstPassword, password);
        browser.writeOnElement(confirmPassword, password);
    }

    /**
     * Click on submit button
     */
    public void submitForm() {
        By submitButton = new By.ByXPath("//button[@id='submitbtn']");

        browser.clickOnElement(submitButton);
    }

}
