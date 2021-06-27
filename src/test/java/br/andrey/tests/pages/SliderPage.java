package br.andrey.tests.pages;

import br.andrey.core.Dsl;
import org.openqa.selenium.By;

public class SliderPage {
    public final Dsl browser = new Dsl();

    /**
     * Open Register page
     */
    public void openSliderPage() {
        browser.goTo("http://demo.automationtesting.in/Slider.html");
    }

    /**
     * Close Browser
     */
    public void closeBrowser() {
        browser.kill();
    }

    /**
     * Move slider by percentage
     * @param percentage percentage to move slider
     */
    public void moveSlider(Integer percentage){
        By slider = new By.ByXPath("//div[@id='slider']/a");

        browser.dragAndDrop(slider, percentage);
    }

    /**
     * Get styles in slider
     * @return return styles in string
     */
    public String getSliderStyles() {
        By slider = new By.ByXPath("//div[@id='slider']/a");

        return browser.getStyleFromElement(slider);
    }
}
