package pomPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestingPage 
{
	//declaration
	//address of pic
		@FindBy(xpath="//img[@id='Selenium Training']")
		private WebElement seleniumtraining;
		
	//address of carttab
		@FindBy(id="cartArea")
		private WebElement carttab;
		
	//address of facebook
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebook;
}


