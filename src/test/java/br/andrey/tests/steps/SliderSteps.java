package br.andrey.tests.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import br.andrey.tests.pages.SliderPage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SliderSteps {
    static Logger logger = LoggerFactory.getLogger(SliderSteps.class);
    SliderPage sliderPage = new SliderPage();

    @Given("that i open the page Slider")
    public void openPage() {
        sliderPage.openSliderPage();
        logger.info("Open page");
    }

    @Then("move slider 50%")
    public void moveSliderToMiddle() {
        Integer percentage = 50;
        sliderPage.moveSlider(percentage);
        Assert.assertEquals("left: " + percentage + "%;", sliderPage.getSliderStyles());
        logger.info("Moved slider");
        sliderPage.closeBrowser();
        logger.info("Closed browser");
    }

}
