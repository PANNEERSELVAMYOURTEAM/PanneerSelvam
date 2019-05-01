package cts.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UsingBaseClass extends Baseclass {

	public static void main(String[] args) {
		Baseclass acess=new Baseclass();
		acess.launchBrowser();
		acess.loadUrl("http://www.greenstech.in/selenium-course-content.html");
		WebElement Click =driver.findElement(By.xpath("//a[text()='CONTACT US']"));
		acess.clickButton(Click);
		acess.quitCurrentBrowserPage();
		
	
		

	}

}
