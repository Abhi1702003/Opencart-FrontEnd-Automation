package pages;

import org.openqa.selenium.support.PageFactory;

import base.Base;

public class MyAccountPage extends Base {

	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}
}
