import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil
import java.net.URLEncoder
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

class reporting_telegram {

	
	@AfterTestSuite
	def sentTelegram(TestSuiteContext context) {

		println("=== LISTENER MASUK ===")

		String botToken = "8497078672:AAF9oqxm6WHXCZVBpj8YnNFFP6WAqzqvt3M"
		String chatId   = "5301270118"
		
		String rawMessage = "Test Listener aman"
		String message = URLEncoder.encode(rawMessage, "UTF-8")

		String url = "https://api.telegram.org/bot${botToken}/sendMessage?chat_id=${chatId}&text=${message}"

		println("URL = " + url)

		try {
			def response = new URL(url).getText()
			println("TELEGRAM RESPONSE = " + response)
		} catch (Exception e) {
			println("TELEGRAM ERROR = " + e.toString())
			e.printStackTrace()
		}
	}
}
