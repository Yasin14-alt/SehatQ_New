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

Mobile.tap(findTestObject('OR APK/Aktifkan_Lokasi_Tidak'), 20)

Mobile.tap(findTestObject('OR APK/Klik_Profile'), 20)

Mobile.setText(findTestObject('OR APK/Email_Login'), email, 20)

Mobile.setText(findTestObject('OR APK/Password_Login'), password, 20)

Mobile.tap(findTestObject('OR APK/Button_Login'), 20)

Mobile.tap(findTestObject('OR APK/Klik_Lewati_after_Login'), 20)

Mobile.tap(findTestObject('OR APK/Yakin_Lewati_Pendaftaran_Ya'), 20)

Mobile.tap(findTestObject('OR APK/Klik_Back_from_Profile'), 20)

Mobile.tap(findTestObject('OR APK/Cart'), 20)

Mobile.tap(findTestObject('OR APK/Klik_Belanja_Sekarang'), 20)

Mobile.tap(findTestObject('OR APK/Image_Toko'), 20)

Mobile.tap(findTestObject('OR APK/Semua_Kategori'), 20)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('OR APK/Klik_Product_Obat'), 20)

Mobile.tap(findTestObject('OR APK/Promag_Double'), 20)

Mobile.tap(findTestObject('OR APK/Plus_Keranjang'), 20)

Mobile.tap(findTestObject('OR APK/android.widget.ImageView_Apotek Fakhira'), 20)

Mobile.tap(findTestObject('OR APK/android.widget.Button - Tambah ke Keranjang'), 20)

Mobile.tap(findTestObject('OR APK/Klik_Lihat_Keranjang'), 20)

Mobile.waitForElementPresent(findTestObject('OR APK/Has_been_cart'), 20)

