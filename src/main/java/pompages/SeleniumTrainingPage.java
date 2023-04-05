package pompages;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class SeleniumTrainingPage {
	
	//Declarartion 
		@FindBy(xpath = "//h1[@class='page-header']")
		private WebElement pageHeader;
		
		@FindBy(xpath= "//button[@id='add']")
		private WebElement plusButton;
		
		@FindBy(xpath = "//button[text()=' Add to Cart']")
		private WebElement addToCartButton;
		
		@FindBy(xpath = "//span[text()='Item added to cart']")
		private WebElement itemAddedMessage;
		
		//Initializing
		public SeleniumTrainingPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			
		}
		//utilization
		public String getPageHeader() {
			return pageHeader.getText();
			
		}
		public void doubleClickAdd(WebDriverUtility web) {
			web.doubleClickOnElement(plusButton);
			
		}
		public void clickAddToCart() {
			addToCartButton.click();
		}
		
		public String getItemAddedMessage() {
			return itemAddedMessage.getText();
			
		}
	}


