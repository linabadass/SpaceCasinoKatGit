import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser('https://staging.spacecasino.co.uk')

WebUI.setEncryptedText(findTestObject('Page_Password Protection/input_Password protected site_password'), '7Ud+37EcZMriwDyAZUmMTg==')

WebUI.click(findTestObject('Page_Password Protection/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_Best Online Casino and Sports Betting - Space Casino/a_Sign Up'))

WebUI.setText(findTestObject('Object Repository/Page_Register - Space Casino/input_Username_username'), username)

WebUI.setText(findTestObject('Object Repository/Page_Register - Space Casino/input_Email_email'), email)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register - Space Casino/input_Password_password'), 'R2dZ4hvJ2ujoDGjQ2cClHw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register - Space Casino/input_Password Confirmation_password_confirmation'), 
    'R2dZ4hvJ2ujoDGjQ2cClHw==')

WebUI.click(findTestObject('Object Repository/Page_Register - Space Casino/label_I agree to the Terms and Conditions and Privacy Policy'))

WebUI.click(findTestObject('Object Repository/Page_Register - Space Casino/label_I certify that I am 18 years of age or older'))

WebUI.click(findTestObject('Object Repository/Page_Register - Space Casino/button_Next'))

WebUI.closeBrowser()

