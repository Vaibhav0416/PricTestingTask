package testCases;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.baseClass.BaseClass;
import com.crm.fileUtility.ReadExcel;
import com.crm.pom.EditLockedMessage;
import com.crm.pom.HomePage;

@Listeners(com.crm.listeners.Screenshot.class)

@Test
public class EditExistingLockedMessage extends BaseClass {

	public void editLockedMsg() throws EncryptedDocumentException, IOException {
		
		ArrayList<String> re = ReadExcel.readFromExcel();
		
		HomePage home = new HomePage(driver);
		home.clickEdit();

		EditLockedMessage ed = new EditLockedMessage(driver);
		ed.clickEditIcon();
		ed.enterAmount(re.get(3));
		ed.writeMsg(re.get(4));
		ed.premiumContent(re.get(5));
		ed.clickSubmit();
	}

}
