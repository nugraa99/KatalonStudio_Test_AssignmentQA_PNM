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
import org.openqa.selenium.Keys
import org.testng.asserts.Assertion

import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory

// ambil data files yang tersedia
TestData data = TestDataFactory.findTestData('inputfield')

// buka chrome
WebUI.openBrowser('')
WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)
WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')
WebUI.verifyElementVisible(findTestObject('Object Repository/locator_practiceform/h1_Practice Form'), FailureHandling.STOP_ON_FAILURE) //assertion
WebUI.executeJavaScript('document.body.style.zoom=\'90%\'', null)

	int i = 1;
	String namaawal = data.getValue('firstname', i)
	String namaakhir = data.getValue('lastname', i)
	String nomorhp = data.getValue('mobile', i)
	String kontakemail = data.getValue('email', i)
	String address = data.getValue('address', i)
	
//	action step
	WebUI.setText(findTestObject('Object Repository/locator_practiceform/input_Name_firstName'), namaawal)
	WebUI.delay(1)
	WebUI.setText(findTestObject('Object Repository/locator_practiceform/input_Name_lastName'), namaakhir)
	WebUI.delay(1)
	WebUI.setText(findTestObject('Object Repository/locator_practiceform/input_Email_userEmail'), kontakemail)
	WebUI.delay(1)
	WebUI.click(findTestObject('Object Repository/locator_practiceform/label_Male'))
	WebUI.delay(1)
	WebUI.setText(findTestObject('Object Repository/locator_practiceform/input_(10 Digits)_userNumber'), nomorhp)
	WebUI.delay(1)
	WebUI.click(findTestObject('Object Repository/locator_practiceform/input_Date of Birth_dateOfBirthInput'))
	WebUI.delay(1)
	WebUI.selectOptionByValue(findTestObject('Object Repository/locator_practiceform/select_190019011902190319041905190619071908_246ee1'),
		'2002', true)
	WebUI.delay(1)
	WebUI.selectOptionByValue(findTestObject('Object Repository/locator_practiceform/select_JanuaryFebruaryMarchAprilMayJuneJuly_566629'),
		'6', true)
	WebUI.delay(1)
	WebUI.click(findTestObject('Object Repository/locator_practiceform/div_7'))
	WebUI.delay(1)
	WebUI.click(findTestObject('Object Repository/locator_practiceform/div_Subjects_subjects-auto-complete__value-_d244cf'))
	WebUI.delay(1)
	WebUI.setText(findTestObject('Object Repository/locator_practiceform/input_Subjects_subjectsInput'), 'co')
	WebUI.delay(1)
	WebUI.click(findTestObject('Object Repository/locator_practiceform/div_Computer Science'))
	WebUI.delay(1)
	WebUI.click(findTestObject('Object Repository/locator_practiceform/label_Sports'))	
	WebUI.delay(1)
	WebUI.uploadFile(findTestObject('Object Repository/locator_practiceform/input_Select picture_uploadPicture'), 'C:\\Users\\khila\\test.png')
	WebUI.delay(1)
	WebUI.setText(findTestObject('Object Repository/locator_practiceform/textarea_Current Address_currentAddress'), address)
	WebUI.delay(1)
	WebUI.click(findTestObject('Object Repository/locator_practiceform/svg_Select State_css-19bqh2r'))
	WebUI.delay(1)
	WebUI.click(findTestObject('Object Repository/locator_practiceform/div_Haryana'))
	WebUI.delay(1)
	WebUI.click(findTestObject('Object Repository/locator_practiceform/div_Select City_css-1gtu0rj-indicatorContainer'))
	WebUI.delay(1)
	WebUI.click(findTestObject('Object Repository/locator_practiceform/div_Karnal'))
	WebUI.delay(1)
	WebUI.refresh()
	WebUI.delay(1)
	WebUI.click(findTestObject('Object Repository/locator_practiceform/button_Submit'))
	WebUI.delay(1)

	//  ASSERTION
	TestObject namapertama = findTestObject('Object Repository/locator_practiceform/input_Name_firstName')
	String awalnama = WebUI.getAttribute(namapertama, 'value')
	
	if (!awalnama) {
		println("Harap isi field seluruhnya")
	} else {
		println("Lanjut submit")
	}
	WebUI.delay(1)


	WebUI.closeBrowser()
