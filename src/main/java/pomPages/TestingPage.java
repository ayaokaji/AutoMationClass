package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestingPage 
{
	public TestingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

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

	public Object getCarttab;

	public String getSeleniumtraining() {
		// TODO Auto-generated method stub
		return null;
	}
}


