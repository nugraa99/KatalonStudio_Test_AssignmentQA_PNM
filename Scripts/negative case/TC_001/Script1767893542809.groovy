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
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory

// buka chrome
	WebUI.openBrowser('')
	WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)
	WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')
	WebUI.verifyElementVisible(findTestObject('Object Repository/locator_practiceform/h1_Practice Form'), FailureHandling.STOP_ON_FAILURE)
	WebUI.executeJavaScript('document.body.style.zoom=\'90%\'', null)
	
//	action step
	WebUI.click(findTestObject('Object Repository/locator_practiceform/button_Submit'))
	WebUI.delay(1)

	//  ASSERTION
	TestObject firstName = findTestObject('Object Repository/locator_practiceform/input_Name_firstName')
	TestObject lastName = findTestObject('Object Repository/locator_practiceform/input_Name_lastName')
	TestObject email = findTestObject('Object Repository/locator_practiceform/input_Email_userEmail')
	TestObject address = findTestObject('Object Repository/locator_practiceform/textarea_Current Address_currentAddress')
	String valFirst = WebUI.getAttribute(firstName, 'value')
	String valLast  = WebUI.getAttribute(lastName, 'value')
	String valEmail = WebUI.getAttribute(email, 'value')
	String valAddress = WebUI.getAttribute(address, 'value')

// contoh cek field kosong
if (!valFirst && !valLast && !valEmail && !valAddress) {
    WebUI.focus(firstName)
    WebUI.focus(lastName)
    WebUI.focus(email)
	WebUI.focus(address)
    println("Harap isi field")
} else {
    println("Lanjut submit")
}
	WebUI.closeBrowser()
