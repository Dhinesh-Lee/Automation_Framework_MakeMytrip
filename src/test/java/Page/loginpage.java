package Page;
import org.openqa.selenium.By;

import utility.LogUtil;
import utility.waits;


public class loginpage 

	 {
	

			By CloseIcon = By.xpath("//span[@data-cy='closeModal']");
			
			public void clickCloseIcon() 
			{
				LogUtil.info("Log-in Menu was Closed");
				waits.waitForClickable(CloseIcon).click();
				//Browser.driver.findElement(CloseIcon).click();
			}

	}





