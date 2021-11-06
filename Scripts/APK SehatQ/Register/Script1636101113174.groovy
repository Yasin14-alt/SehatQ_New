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

Mobile.startExistingApplication('com.she.sehatq', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('OR APK/Aktifkan_Lokasi_Tidak'), 10)

Mobile.tap(findTestObject('OR APK/Klik_Profile'), 10)

Mobile.tap(findTestObject('OR APK/Klik_Daftar'), 10)

Mobile.setText(findTestObject('OR APK/Isi_Nama_Lengkap'), Nama_Lengkap, 10)

Mobile.setText(findTestObject('OR APK/Isi_Email_Registrasi'), Input_Email, 10)

Mobile.setText(findTestObject('OR APK/Isi_Password_Register'), Input_Password, 10)

Mobile.tap(findTestObject('OR APK/Check_Saya_Setuju_Daftar'), 10)

Mobile.tap(findTestObject('OR APK/Klik_Button_daftar'), 10)

//if (Action == 'sudah terdaftar')  {
	
//	Mobile.tap(findTestObject('OR APK/Notif_Ok_Daftar'), 10)


    Mobile.tap(findTestObject('OR APK/Klik_Lewati_after_Daftar'), 10)

    Mobile.tap(findTestObject('OR APK/Klik_Ya_Untuk_Yakin'), 10)

    Mobile.tap(findTestObject('OR APK/Klik_hamburger_Profile'), 10)

    Mobile.tap(findTestObject('OR APK/Klik_Pengaturan_Aplikasi'), 10)

    Mobile.tap(findTestObject('OR APK/Button_Logout'), 10)



