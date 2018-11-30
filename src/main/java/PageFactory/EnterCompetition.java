package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnterCompetition {
	
	@FindBy(xpath="//*[@id=\"page3\"]/h1[1]")
	WebElement successMessage;
	
	@FindBy(xpath="//*[@id=\"page3\"]/button")
	WebElement compButton;
	
	@FindBy(xpath="//*[@id=\"page3\"]/h1[2]")
	WebElement accountNumber;

	public String accountNumberCreated() {
		return successMessage.getText();
	}
	
	public String accountNumberChecker() {
		String outcome;
		if(accountNumber.getText().substring(0).equals("A") || accountNumber.getText().substring(0).equals("B")) {
			outcome = "Success";
		} else {
			outcome = "Failure";
		}
		return outcome;
	}
	
	
	public void buttonClick() {	
		compButton.click();
	}

}
