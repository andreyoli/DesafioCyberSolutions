package br.andrey.tests.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import br.andrey.tests.pages.FramesPage;

public class FramesSteps {
    FramesPage framesPage = new FramesPage();

    @Given("that i open the page Frames")
    public void openPage() {
        framesPage.openFramesPage();
        System.out.println("Open page");
    }

    @And("i enter in iframe")
    public void enterInIframe() {
        framesPage.enterOnSingleFrame();
        System.out.println("Entered in single iframe");
    }

    @And("write on input")
    public void writeOnInput() {
        framesPage.writeOnSingleFrame("bees");
        System.out.println("Written on input");
    }

    @And("left the iframe")
    public void leftTheIframe() {
        framesPage.backToDefaultContent();
        System.out.println("Left the iframe");
    }

    @And("i click on \"Iframe with in an Iframe\" button")
    public void clickOnSecondButton() {
        framesPage.clickOnMultipleFramesButton();
        System.out.println("Clicked in button 'Iframe with in an Iframe'");
    }

    @And("i enter in multiple iframe")
    public void enterInMultipleIframe() {
        framesPage.enterOnMultipleFrames();
        System.out.println("Entered in sub iframe");
    }

    @Then("write on input in sub frame")
    public void writeOnInputInSubFrame() {
        framesPage.writeOnMultipleFrame("bees");
        System.out.println("Written on input in sub frame");
        framesPage.closeBrowser();
        System.out.println("Closed browser");
    }

}
