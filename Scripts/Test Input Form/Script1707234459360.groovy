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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://rpachallenge.com/')

WebUI.click(findTestObject('Object Repository/Page_Rpa Challenge/input_First Name_efi6J'))

WebUI.click(findTestObject('Object Repository/Page_Rpa Challenge/button_Start'))

WebUI.setText(findTestObject('Object Repository/Page_Rpa Challenge/input_Company Name_9FFQ8'), 'BCa')

WebUI.setText(findTestObject('Object Repository/Page_Rpa Challenge/input_Phone Number_jiYhK'), '089628372')

WebUI.setText(findTestObject('Object Repository/Page_Rpa Challenge/input_Email_WCJfs'), 'ariwira@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Rpa Challenge/input_Last Name_7r1MI'), 'wira')

WebUI.setText(findTestObject('Object Repository/Page_Rpa Challenge/input_First Name_WnRFK'), 'ari')

WebUI.setText(findTestObject('Object Repository/Page_Rpa Challenge/input_Role in Company_zZVKA'), 'qa')

WebUI.setText(findTestObject('Object Repository/Page_Rpa Challenge/input_Address_1ODde'), 'bekasi')

WebUI.click(findTestObject('Object Repository/Page_Rpa Challenge/input_Address_btn uiColorButton'))

WebUI.setText(findTestObject('Object Repository/Page_Rpa Challenge/input_First Name_B0ryq'), 'ari')

WebUI.setText(findTestObject('Object Repository/Page_Rpa Challenge/input_Phone Number_XVJDc'), '0812912')

WebUI.setText(findTestObject('Object Repository/Page_Rpa Challenge/input_Company Name_m483r'), 'finance')

WebUI.setText(findTestObject('Object Repository/Page_Rpa Challenge/input_Role in Company_PKNbi'), 'qa')

WebUI.setText(findTestObject('Object Repository/Page_Rpa Challenge/input_Last Name_zxS5R'), 'wira')

WebUI.setText(findTestObject('Object Repository/Page_Rpa Challenge/input_Address_onpDZ'), 'bekasi')

WebUI.setText(findTestObject('Object Repository/Page_Rpa Challenge/input_Email_9k5HD'), 'ariw@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Rpa Challenge/input_Address_btn uiColorButton'))

WebUI.closeBrowser()

