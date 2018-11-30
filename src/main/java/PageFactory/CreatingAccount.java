package PageFactory;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class CreatingAccount {

	@FindBy(id="txtFName")
	WebElement firstNameBox;
	
	@FindBy(id="txtLName")
	WebElement lastNameBox;
	
	@FindBy(xpath="//*[@id=\"page2\"]/button")
	WebElement submitButton;
	
	@FindBy(id="errorMessage")
	WebElement errormessage;
	
	public void enterDetails(String fname, String lname) {
		firstNameBox.sendKeys(fname);
		lastNameBox.sendKeys(lname);
	}
	
	public void submittingDetails() {
		submitButton.click();
	}
	
	public String detailValidation() {
		String message;
		if (firstNameBox.getText().equals("") && lastNameBox.getText().equals("") ) {
			message = errormessage.getText();
		}else if(firstNameBox.getText().equals("")) {
			message = errormessage.getText();
		}else if(lastNameBox.getText().equals("")) {
			message = errormessage.getText();
		}else {
			message = "";
		}
		return message;
	}

}
