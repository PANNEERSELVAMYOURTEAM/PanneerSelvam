package cts.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	static WebDriver driver;
	public  WebDriver launchBrowser(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\workspace\\Panneer\\driver\\chromedriver.exe");
	    driver =new ChromeDriver();	
	    return driver;
	}
	public void loadUrl(String S){
		driver.get(S);
	}
	public void enterText(WebElement element, String s){
	  element.sendKeys(s);	
	}
	public void clickButton(WebElement element){
		element.click();
	}
	public void quitEntireBrowser(){
		driver.quit();
	}
	public void quitCurrentBrowserPage(){
		driver.close();
	}

	

}
