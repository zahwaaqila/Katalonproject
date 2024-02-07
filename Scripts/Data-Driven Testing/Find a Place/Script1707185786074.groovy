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

WebUI.navigateToUrl('https://www.airbnb.com/')

WebUI.click(findTestObject('Object Repository/Airbnb Pages/Page_Search/button_Start exploring'))

WebUI.setText(findTestObject('Object Repository/Airbnb Pages/Page_Search/input_query'), city)

WebUI.click(findTestObject('Object Repository/Airbnb Pages/Page_Search/div_Atlanta, Georgia, United States'))

WebUI.click(findTestObject('Object Repository/Airbnb Pages/Page_Search/div_6'))

WebUI.click(findTestObject('Object Repository/Airbnb Pages/Page_Search/div_8'))

WebUI.click(findTestObject('Object Repository/Airbnb Pages/Page_Search/div_7'))

WebUI.click(findTestObject('Object Repository/Airbnb Pages/Page_Search/span_t1dqvypu atm_9s_1ulexfb atm_vy_1osqo2v_528864'))

WebUI.click(findTestObject('Airbnb Pages/Page_Search Result/span_Over 1,000 places in Atlanta'))

//WebUI.verifyTextPresent(expectedResult, false)
WebUI.verifyMatch(WebUI.getText(findTestObject('Airbnb Pages/Page_Search Result/span_Over 1,000 places in Atlanta')), expectedResult, 
    true)

WebUI.closeBrowser()

