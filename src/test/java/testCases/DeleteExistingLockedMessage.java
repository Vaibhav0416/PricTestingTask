package testCases;

import org.testng.annotations.Test;

import com.crm.baseClass.BaseClass;
import com.crm.pom.DeleteLockedMessage;
import com.crm.pom.HomePage;

@Test
public class DeleteExistingLockedMessage extends BaseClass {

	public void DeleteLockedMsg() {
		HomePage home = new HomePage(driver);
		home.clickEdit();
		
		DeleteLockedMessage del = new DeleteLockedMessage(driver);
		del.clickDeleteIcon();
		del.clickDeleteButton();
	}
	

}
