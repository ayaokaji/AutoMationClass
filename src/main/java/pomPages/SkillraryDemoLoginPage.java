package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage 
{
	//declaration
	//address of course
	@FindBy(id= "course")
	private WebElement coursetab;
	
	//address of selenium training
	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	private WebElement seleniumtraining;
	
	//address of dropdown
	@FindBy(name= "addresstype")
	private WebElement coursedd;
	
	//initilization
	public SkillraryDemoLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	public WebElement getCoursetab()
	{
		return coursetab;
		
	}
	
	public void seleniumtrainingtab()
	{
		seleniumtraining.click();
		
	}

	public WebElement getCoursedd()
	{
		return coursedd;
		
	}
	

	
	
	
	
}
