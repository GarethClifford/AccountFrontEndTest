package Testing;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import PageFactory.CreatingAccount;

public class FrontEndTest {

	
	WebDriver driver;
	String url;
	
	@Before
	public void setUp() {
		url = "http://localhost:3000";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	
	@Test
	public void noNamesTest() {
		CreatingAccount creatingaccount = PageFactory.initElements(driver,CreatingAccount.class);
		assertEquals("Enter Valid First Name", creatingaccount.detailValidation());
	}
	
	@Test
	public void noFirstNameTest() {
		CreatingAccount creatingaccount = PageFactory.initElements(driver,CreatingAccount.class);
		creatingaccount.enterDetails("", "Gordon");
		assertEquals("Enter Valid First Name", creatingaccount.detailValidation());
	}
	
	@Test
	public void noValidFirstNameTest() {
		CreatingAccount creatingaccount = PageFactory.initElements(driver,CreatingAccount.class);
		creatingaccount.enterDetails("1234", "Gordon");
		assertEquals("Enter Valid First Name", creatingaccount.detailValidation());
	}
	
	@Test
	public void noLasttNameTest() {
		CreatingAccount creatingaccount = PageFactory.initElements(driver,CreatingAccount.class);
		creatingaccount.enterDetails("John", "");
		assertEquals("Enter Valid Last Name", creatingaccount.detailValidation());
	}
	
	@Test
	public void noValidLasttNameTest() {
		CreatingAccount creatingaccount = PageFactory.initElements(driver,CreatingAccount.class);
		creatingaccount.enterDetails("John", "1234");
		assertEquals("Enter Valid Last Name", creatingaccount.detailValidation());
	}
	

	
}
