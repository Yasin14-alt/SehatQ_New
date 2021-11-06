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

WebUI.callTestCase(findTestCase('Web SehatQ/Setup'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OR_Website/Page_SehatQ  Portal Informasi Terbaru Seputar Coronavirus/Klik_Profile'))

WebUI.setText(findTestObject('OR_Website/Page_SehatQ  Portal Informasi Terbaru Seputar Coronavirus/Input_Email_Login'), 
    Email)

WebUI.setText(findTestObject('OR_Website/Page_SehatQ  Portal Informasi Terbaru Seputar Coronavirus/Input_Password_Login'), 
    Password)

WebUI.click(findTestObject('OR_Website/Page_SehatQ  Portal Informasi Terbaru Seputar Coronavirus/button_Login'))

WebUI.waitForElementPresent(findTestObject('OR_Website/Page_SehatQ  Portal Informasi Terbaru Seputar Coronavirus/Select_Cart'), 
    3)

WebUI.click(findTestObject('OR_Website/Page_SehatQ  Portal Informasi Terbaru Seputar Coronavirus/Select_Cart'))

WebUI.click(findTestObject('OR_Website/Page_SehatQ  Portal Informasi Terbaru Seputar Coronavirus/button_Belanja Sekarang'))

WebUI.click(findTestObject('OR_Website/Page_SehatQ  Portal Informasi Terbaru Seputar Coronavirus/Select_Jenis_Product'))

WebUI.click(findTestObject('OR_Website/Page_SehatQ  Portal Informasi Terbaru Seputar Coronavirus/Pilih_Product'))

WebUI.click(findTestObject('OR_Website/Page_SehatQ  Portal Informasi Terbaru Seputar Coronavirus/button_Keranjang'))

WebUI.waitForElementPresent(findTestObject('OR_Website/Page_SehatQ  Portal Informasi Terbaru Seputar Coronavirus/Notif_Produk berhasil ditambahkan'), 3)

WebUI.click(findTestObject('OR_Website/Page_SehatQ  Portal Informasi Terbaru Seputar Coronavirus/Check_Cart'))

WebUI.waitForElementPresent(findTestObject('OR_Website/Page_SehatQ  Portal Informasi Terbaru Seputar Coronavirus/Notif_Waiting_Success'), 3)

