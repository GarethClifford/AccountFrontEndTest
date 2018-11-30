package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UnsuccessfulPages {

	@FindBy(xpath = "//*[@id=\"page3\"]/div/h2")
	WebElement failMessage;

	public String losingMessage() {
		return failMessage.getText();
	}

}
