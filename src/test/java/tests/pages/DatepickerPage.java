package tests.pages;

import core.Dsl;
import io.cucumber.java.After;
import org.openqa.selenium.By;

public class DatepickerPage {
    private final Dsl browser = new Dsl();

    /**
     * Open Datepicker page
     */
    public void openDatepickerPage() {
        browser.goTo("http://demo.automationtesting.in/Datepicker.html");
    }

    /**
     * Close Browser
     */
    public void closeBrowser() {
        browser.kill();
    }

    /**
     * Click on disabled input
     */
    public void clickOnDisabledInput() {
        By inputDisabled = new By.ByXPath("//input[@id='datepicker1']");

        browser.clickOnElement(inputDisabled);
    }

    /**
     * Select date of birth in disabled input
     * @param year year of birth
     * @param monthInEnglish month of birth
     * @param day day of birth
     */
    public void selectOnDisabledDatePicker(String year, String monthInEnglish, String day) {
        By dateYear = new By.ByXPath("//span[@class='ui-datepicker-year']");
        By dateMonth = new By.ByXPath("//span[@class='ui-datepicker-month']");
        By dateDay = new By.ByXPath("//a[@class='ui-state-default' and contains(text(), '" + day + "')]");
        By prevButton = new By.ByXPath("//a[@data-handler='prev']");


        while (!browser.getTextFromElement(dateYear).equals(year)){
            browser.clickOnElement(prevButton);
        }

        while (!browser.getTextFromElement(dateMonth).equals(monthInEnglish)){
            browser.clickOnElement(prevButton);
        }

        browser.clickOnElement(dateDay);
    }

    /**
     * He write date of birth in input
     * @param dateMMDDYY date in MM-DD-YY format
     *                   Example: 04/27/1999
     */
    public void writeOnEnabledDatepicker(String dateMMDDYY) {
        By inputEnabled = new By.ByXPath("//input[@id='datepicker2']");

        browser.writeOnElement(inputEnabled, dateMMDDYY);
    }

}
