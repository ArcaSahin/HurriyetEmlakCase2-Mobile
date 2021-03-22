package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobileLandingPage {

	public WebDriver driver;
	WebElement element;
	
	@FindBy(linkText="Kiralık")
	WebElement clickKiralik;
	
	public MobileLandingPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public MobileForRentPage click_Satilik() throws InterruptedException
	{
		MobileForRentPage mfrp = new MobileForRentPage(driver);
		Thread.sleep(3000);
		clickKiralik.click();
		return mfrp;
	}
}
