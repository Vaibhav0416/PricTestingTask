package testCases;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.baseClass.BaseClass;
import com.crm.fileUtility.ReadExcel;
import com.crm.pom.CreateLockedMessage;
import com.crm.pom.HomePage;
@Listeners(com.crm.listeners.Screenshot.class)

public class CreateNewLockedMessage extends BaseClass {
	
	@Test
public void createLockedMessage() throws EncryptedDocumentException, IOException
{
		ArrayList<String> re = ReadExcel.readFromExcel();
		
	HomePage hp = new HomePage(driver);
	hp.clickLockedMsg();
	
	CreateLockedMessage lock = new CreateLockedMessage(driver);
	lock.clickCreateLockedMsg();
	lock.enterAmount(re.get(0));
	lock.writeMsg(re.get(1));
	lock.premiumContent(re.get(2));
	lock.clickSubmit();
}
	

}
