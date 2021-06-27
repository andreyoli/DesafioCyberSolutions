package tests.pages;

import core.Dsl;
import org.openqa.selenium.By;

public class FramesPage {
    private final Dsl browser = new Dsl();

    /**
     * Open Frames page
     */
    public void openFramesPage() {
        browser.goTo("http://demo.automationtesting.in/Frames.html");
    }

    /**
     * Close Browser
     */
    public void closeBrowser() {
        browser.kill();
    }

    /**
     * Enter in single frame on Frames page
     */
    public void enterOnSingleFrame() {
        browser.switchToIframeByName("SingleFrame");
    }

    /**
     * He write in input inside the single frame on Frames page
     * @param text text to write in input
     */
    public void writeOnSingleFrame(String text) {
        By input = new By.ByXPath("//input[@type='text']");

        browser.writeOnElement(input, text);
    }

    /**
     * Left the iframe
     */
    public void backToDefaultContent() {
        browser.switchToDefaultContent();
    }

    /**
     * Click on Button "Iframe with in an Iframe"
     */
    public void clickOnMultipleFramesButton() {
        By buttonMultipleIframe = new By.ByXPath("//a[@href='#Multiple']");

        browser.clickOnElement(buttonMultipleIframe);
    }

    /**
     * Enter in iframe inside another iframe
     */
    public void enterOnMultipleFrames() {
        By frame = new By.ByXPath("//div[@id='Multiple']/iframe[@src='MultipleFrames.html']");
        By frameInside = new By.ByXPath("//iframe[@src='SingleFrame.html']");

        browser.switchToIframeByElement(frame);
        browser.switchToIframeByElement(frameInside);
    }

    /**
     * He write in input inside the sub frame on Frames page
     * @param text text to write in input
     */
    public void writeOnMultipleFrame(String text) {
        By input = new By.ByXPath("//input[@type='text']");

        browser.writeOnElement(input, text);
    }
}
