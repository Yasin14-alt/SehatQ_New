import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startExistingApplication('com.she.sehatq')

if (Mobile.waitForElementPresent(findTestObject('OR APK/Aktifkan_Lokasimu'),10)) {
	
	Mobile.tap(findTestObject('OR APK/Aktifkan_Lokasi_Tidak'), 10)
	
	Mobile.tap(findTestObject('OR APK/Klik_Profile'), 10)

} else if (Mobile.waitForElementPresent(findTestObject('OR APK/Logo_Login'), 30)) { 
	Mobile.tap(findTestObject('OR APK/Logo_Login'), 30)

} else {
	
	Mobile.tap(findTestObject('OR APK/Klik_Profile'), 10)
}

	Mobile.setText(findTestObject('OR APK/Email_Login'), email, 20)
	
	Mobile.setText(findTestObject('OR APK/Password_Login'), password, 10)

if (Mobile.waitForElementPresent(findTestObject('OR APK/Button_Login'), 30)) {
	
	Mobile.tap(findTestObject('OR APK/Button_Login'), 30)
	
} else {
	
	Mobile.tap(findTestObject('OR APK/Klik_Lanjut'), 30)
}

if (Mobile.waitForElementPresent(findTestObject('OR APK/Email_atau_Password_salah'), 30)) {
	
    Mobile.tap(findTestObject('OR APK/Klik_OK'), 30)

    Mobile.clearText(findTestObject('OR APK/Hapus_Email'), 30)
  
	Mobile.clearText(findTestObject('OR APK/Hapus_Password'), 30)
	
} else if (Mobile.waitForElementPresent(findTestObject('OR APK/Email_harus_diisi_dengan_benar'), 30)) {
   
	Mobile.tap(findTestObject('OR APK/Klik_OK_2'), 30)

    Mobile.clearText(findTestObject('OR APK/Hapus_Email'), 30)

    Mobile.clearText(findTestObject('OR APK/Hapus_Password'), 30)
	
} else {
    Mobile.tap(findTestObject('OR APK/Klik_Lewati_after_Login'), 30)

    Mobile.tap(findTestObject('OR APK/Yakin_Lewati_Pendaftaran_Ya'), 30)

    Mobile.tap(findTestObject('OR APK/Klik_hamburger_Profile'), 30)

    Mobile.tap(findTestObject('OR APK/Klik_Pengaturan_Aplikasi'), 30)

    Mobile.tap(findTestObject('OR APK/Button_Logout'), 30)
	
	Mobile.tap(findTestObject('OR APK/LogoutYa'), 10)
		
}

	Mobile.closeApplication()

