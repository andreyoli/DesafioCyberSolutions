package tests.steps;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import tests.pages.SliderPage;

public class SliderSteps {
    SliderPage sliderPage = new SliderPage();

    @Given("that i open the page Slider")
    public void openPage() {
        sliderPage.openSliderPage();
        System.out.println("Open page");
    }

    @Then("move slider 50%")
    public void moveSliderToMiddle() {
        Integer percentage = 50;
        sliderPage.moveSlider(percentage);
        Assert.assertEquals("left: " + percentage + "%;", sliderPage.getSliderStyles());
        System.out.println("Moved slider");
        sliderPage.closeBrowser();
        System.out.println("Closed browser");
    }

}
