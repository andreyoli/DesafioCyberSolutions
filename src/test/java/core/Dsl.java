package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dsl {
    private final WebDriver browser;

    /**
     * Setup chrome driver
     */
    public Dsl(){
        WebDriverManager.chromedriver().setup();
        browser = new ChromeDriver();

        browser.manage().window().setSize(new Dimension(1024,720));
    }

    /**
     * Go to specific url
     * @param url Website link
     */
    public void goTo(String url){
        try {
            browser.get(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Move a element in x axis
     * @param element element to move
     * @param percentage percentage to move
     */
    public void dragAndDrop(By element, Integer percentage) {
        WebElement slider = browser.findElement(element);
        double xOffset = percentage * 5.4;

        Actions action = new Actions(browser);
        action.dragAndDropBy(slider, (int)Math.round(xOffset), 0).perform();
    }

    /**
     * Quit browser
     */
    public void kill(){
        browser.quit();
    }

    /**
     * Click in element by dom path
     * @param element element on dom
     */
    public void clickOnElement(By element) {
        browser.findElement(element).click();
    }

    /**
     * Write in element by dom path
     * @param element element path
     * @param string text to write
     */
    public void writeOnElement(By element, String string) {
        try {
            browser.findElement(element).sendKeys(string);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Switch to iframe using frame name
     * @param frameName name of frame
     */
    public void switchToIframeByName(String frameName) {
        browser.switchTo().frame(frameName);
    }

    /**
     * Switch to iframe using element path
     * @param element path to frame
     */
    public void switchToIframeByElement(By element) {
        browser.switchTo().frame(browser.findElement(element));
    }

    /**
     * Switch back to default content
     */
    public void switchToDefaultContent() {
        browser.switchTo().defaultContent();
    }

    /**
     * Return text got in element
     * @param element Element path
     * @return Text
     */
    public String getTextFromElement(By element) {
        return browser.findElement(element).getText();
    }

    /**
     * Return style of element
     * @param element Element path
     * @return Text
     */
    public String getStyleFromElement(By element) {
        return browser.findElement(element).getAttribute("style");
    }

}
