package org.example.config;

import org.eclipse.jetty.util.log.Log;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;

/**
 * Class to add action to interact with the browser window
 *
 * @author ME93337
 *
 */
@Slf4j
public class WebAction extends PageObject {

	private WebElementFacade scroll = find(By.tagName("body"));
	private static WebDriver driver = ThucydidesWebDriverSupport.getDriver();
	private static Dimension size = driver.manage().window().getSize();
	private static int height = size.getHeight();

	public static void scrollElementToTop(WebElementFacade element) {
		JavascriptExecutor js = (JavascriptExecutor) (ThucydidesWebDriverSupport.getDriver());
		js.executeScript("arguments[0].scrollIntoView();", element);
		js.executeScript("window.scrollTo(0," + 1000 + ")");

	}

	public static void scrollByStep() {

		JavascriptExecutor js = (JavascriptExecutor) (ThucydidesWebDriverSupport.getDriver());
		js.executeScript("window.scrollTo(0,1000)");
	}

	public static void scrollBykeyBoard(int steps) {
		WebElement scroll = (ThucydidesWebDriverSupport.getDriver()).findElement(By.tagName("body"));
		for (int i = 0; i < steps; i++) {
			scroll.sendKeys(Keys.ARROW_DOWN);
		}
	}

	public static void waitScreen(long second) {
		try {
			Thread.sleep(second * 1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void waitElement(long second) {
		try {
			Thread.sleep(second * 1000L);
		} catch (InterruptedException var3) {
			log.error("Timeout error: [" + var3.getMessage() + "]");
		}
	}

	public void closeDriver() {
		driver.quit();
	}

	public void alerts() {

		try {
			WebDriverWait wait = new WebDriverWait(driver, 2);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			log.debug(alert.getText());
			alert.accept();
			Assert.assertTrue(alert.getText().contains("Thanks."));
		} catch (Exception e) {
			
		}

		}

}
