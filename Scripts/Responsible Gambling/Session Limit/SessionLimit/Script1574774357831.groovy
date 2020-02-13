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

WebUI.navigateToUrl('https://staging.spacecasino.co.uk/')

WebUI.setEncryptedText(findTestObject('Page_Password Protection/input_Password protected site_password'), '7Ud+37EcZMriwDyAZUmMTg==')

WebUI.click(findTestObject('Page_Password Protection/button_Submit'))

WebUI.click(findTestObject('Page_Best Online Casino and Sports Betting _8ba448/a_Sign in'))

WebUI.setText(findTestObject('Page_Login - Space Casino/input_usernameemail or phone number_username'), 'sessionlimittest')

WebUI.setEncryptedText(findTestObject('Page_Login - Space Casino/input_Password_password'), 'R2dZ4hvJ2ujoDGjQ2cClHw==')

WebUI.click(findTestObject('Page_Login - Space Casino/button_Sign in'))

WebUI.click(findTestObject('Page_account - Space Casino/button_000_profileMenuButton'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_account - Space Casino/div_Responsible Gaming'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/div_Session LimitTap here to update1 minute'))

WebUI.doubleClick(findTestObject('Page_account - Space Casino/input_Set Your Session Limit_duration'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Page_account - Space Casino/input_Set Your Session Limit_duration'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Page_account - Space Casino/input_Set Your Session Limit_duration'), '1')

WebUI.click(findTestObject('Page_account - Space Casino/button_Set Session Limit'))

WebUI.delay(40)

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_Continue (25)'))

WebUI.closeBrowser()

