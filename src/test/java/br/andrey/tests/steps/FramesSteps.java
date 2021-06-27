package br.andrey.tests.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import br.andrey.tests.pages.FramesPage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FramesSteps {
    static Logger logger = LoggerFactory.getLogger(FramesSteps.class);
    FramesPage framesPage = new FramesPage();

    @Given("that i open the page Frames")
    public void openPage() {
        framesPage.openFramesPage();
        logger.info("Open page");
    }

    @And("i enter in iframe")
    public void enterInIframe() {
        framesPage.enterOnSingleFrame();
        logger.info("Entered in single iframe");
    }

    @And("write on input")
    public void writeOnInput() {
        framesPage.writeOnSingleFrame("bees");
        logger.info("Written on input");
    }

    @And("left the iframe")
    public void leftTheIframe() {
        framesPage.backToDefaultContent();
        logger.info("Left the iframe");
    }

    @And("i click on \"Iframe with in an Iframe\" button")
    public void clickOnSecondButton() {
        framesPage.clickOnMultipleFramesButton();
        logger.info("Clicked in button 'Iframe with in an Iframe'");
    }

    @And("i enter in multiple iframe")
    public void enterInMultipleIframe() {
        framesPage.enterOnMultipleFrames();
        logger.info("Entered in sub iframe");
    }

    @Then("write on input in sub frame")
    public void writeOnInputInSubFrame() {
        framesPage.writeOnMultipleFrame("bees");
        logger.info("Written on input in sub frame");
        framesPage.closeBrowser();
        logger.info("Closed browser");
    }

}
