package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RanfordHP 
{
     
	// Element properties
	
	@FindBy(id="txtuId")
	WebElement Uname;
	
	@FindBy(id="txtPword")
	WebElement Pswd;
	
	@FindBy(xpath="//*[@id=\'login\']")
	WebElement Lgn;
	
	//Element Methods
	
	public void Alogin() throws InterruptedException
	{
		Uname.sendKeys("Admin");
		Pswd.sendKeys("Mindq@Sel");
		Thread.sleep(3000);
		Lgn.click();
	}
	
}
