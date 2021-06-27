package br.andrey.tests.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import br.andrey.tests.pages.DatepickerPage;

public class DatepickerSteps {
    DatepickerPage datepickerPage = new DatepickerPage();

    @Given("that i open the page Datepicker")
    public void openPage() {
        datepickerPage.openDatepickerPage();
        System.out.println("Driver launched");
    }

    @And("click on disabled input")
    public void clickOnInputDisable() {
        datepickerPage.clickOnDisabledInput();
        System.out.println("Clicked on disabled input");
    }

    @And("select my date of birth")
    public void selectDateOfBirth() {
        datepickerPage.selectOnDisabledDatePicker("1999", "April", "27");
        System.out.println("Selected date of birth");
    }

    @Then("write on input enabled")
    public void writeOnInputEnabled() {
        datepickerPage.writeOnEnabledDatepicker("04/27/1999");
        System.out.println("Written date of birth");
        datepickerPage.closeBrowser();
        System.out.println("Closed browser");
    }

}
