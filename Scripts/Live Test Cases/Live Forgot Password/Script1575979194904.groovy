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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.spacecasino.co.uk/')

WebUI.click(findTestObject('Page_Best Online Casino and Sports Betting _8ba448/a_Sign in'))

WebUI.click(findTestObject('Page_Login - Space Casino/a_Forgot your password'))

WebUI.click(findTestObject('Page_Recover Password - Space Casino/input_Email or Username_emailOrUsername'))

WebUI.click(findTestObject('Page_Recover Password - Space Casino/a_Sign in instead'))

WebUI.click(findTestObject('Page_Login - Space Casino/a_Forgot your password'))

WebUI.click(findTestObject('Object Repository/Page_Recover Password - Space Casino/div_Recover PasswordPlease enter your usern_da7189'))

WebUI.setText(findTestObject('Page_Recover Password - Space Casino/input_Email or Username_emailOrUsername'), 'test@stech.com')

WebUI.click(findTestObject('Page_Recover Password - Space Casino/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_Password Recovered - Space Casino/a_Sign in'))

