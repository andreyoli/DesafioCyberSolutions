package br.andrey.tests.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import br.andrey.tests.pages.DatepickerPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DatepickerSteps {
    static Logger logger = LoggerFactory.getLogger(DatepickerSteps.class);
    DatepickerPage datepickerPage = new DatepickerPage();

    @Given("that i open the page Datepicker")
    public void openPage() {
        datepickerPage.openDatepickerPage();
        logger.info("Driver launched");
    }

    @And("click on disabled input")
    public void clickOnInputDisable() {
        datepickerPage.clickOnDisabledInput();
        logger.info("Clicked on disabled input");
    }

    @And("select my date of birth")
    public void selectDateOfBirth() {
        datepickerPage.selectOnDisabledDatePicker("1999", "April", "27");
        logger.info("Selected date of birth");
    }

    @Then("write on input enabled")
    public void writeOnInputEnabled() {
        datepickerPage.writeOnEnabledDatepicker("04/27/1999");
        logger.info("Written date of birth");
        datepickerPage.closeBrowser();
        logger.info("Closed browser");
    }

}
