package Test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utility.ExtentListener;
import Base.Browser;
import Page.loginpage;
@Listeners(ExtentListener.class)
public class Logintest extends Browser {

	@Test
	public void close() {
		loginpage page = new loginpage();
		page.clickCloseIcon();

	}
}
