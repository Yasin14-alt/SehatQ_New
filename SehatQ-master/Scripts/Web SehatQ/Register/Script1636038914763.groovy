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

WebUI.click(findTestObject('OR_Website/Page_SehatQ  Portal Informasi Terbaru Seputar Coronavirus/Klik_Daftar'))

WebUI.setText(findTestObject('OR_Website/Page_SehatQ  Portal Informasi Terbaru Seputar Coronavirus/Input_Nama_Lengkap'), 
    Input_Nama_Lengkap)

WebUI.setText(findTestObject('OR_Website/Page_SehatQ  Portal Informasi Terbaru Seputar Coronavirus/Input_Email'), Input_Email)

WebUI.setText(findTestObject('OR_Website/Page_SehatQ  Portal Informasi Terbaru Seputar Coronavirus/Input_Password_Email'), 
    Input_Password)

WebUI.click(findTestObject('OR_Website/Page_SehatQ  Portal Informasi Terbaru Seputar Coronavirus/View_Password'))

WebUI.check(findTestObject('OR_Website/Page_SehatQ  Portal Informasi Terbaru Seputar Coronavirus/Click_Saya menyetujui Ketentuan dan Kebijakan Privasi di SehatQ'))

WebUI.click(findTestObject('OR_Website/Page_SehatQ  Portal Informasi Terbaru Seputar Coronavirus/Button_Daftar'))

if (Action == 'sudah terdaftar') {
    WebUI.comment('Email Sudah terdaftar')
} else {
    
    WebUI.click(findTestObject('OR_Website/Page_SehatQ  Portal Informasi Terbaru Seputar Coronavirus/Klik_Lewati'))

    WebUI.click(findTestObject('OR_Website/Page_SehatQ  Portal Informasi Terbaru Seputar Coronavirus/Klik_Profile_Logout'))

    WebUI.click(findTestObject('OR_Website/Page_SehatQ  Portal Informasi Terbaru Seputar Coronavirus/Log_Out'))
}

