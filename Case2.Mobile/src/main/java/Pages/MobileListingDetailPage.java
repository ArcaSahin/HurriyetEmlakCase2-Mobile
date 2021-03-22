package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobileListingDetailPage {

	public WebDriver driver;
	WebElement element;
	
	@FindBy(id="call-owner")
	WebElement clickCallOwner;
	
	public MobileListingDetailPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public MobileListingDetailPage click_CallOwner() throws InterruptedException
	{
		Thread.sleep(5000);
		clickCallOwner.click();
		return this;
	}
	
}
