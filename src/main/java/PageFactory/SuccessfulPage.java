package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessfulPage {

	@FindBy(xpath="//*[@id=\"page3\"]/div/h2")
	WebElement successMessage;
	
	public String winningMessage() {
		return successMessage.getText().substring(0, 14);
	}
	
	
}
