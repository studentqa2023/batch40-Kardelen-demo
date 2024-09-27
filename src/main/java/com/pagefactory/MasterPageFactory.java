package com.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MasterPageFactory {
	
    @FindBy(xpath="//i[@class='fa fa-lock']")
	private WebElement singninbtn_homepage;

	public WebElement getSingninbtn_homepage() {
		return singninbtn_homepage;
	}
	
	
}
