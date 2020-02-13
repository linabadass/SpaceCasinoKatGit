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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://staging.spacecasino.co.uk/')

WebUI.setEncryptedText(findTestObject('Page_Password Protection/input_Password protected site_password'), '7Ud+37EcZMriwDyAZUmMTg==')

WebUI.click(findTestObject('Page_Password Protection/button_Submit'))

WebUI.click(findTestObject('Page_Best Online Casino and Sports Betting - Space Casino/a_Sign in'))

WebUI.setText(findTestObject('Page_Login - Space Casino/input_usernameemail or phone number_username'), 'wagerlimittest')

WebUI.setEncryptedText(findTestObject('Page_Login - Space Casino/input_Password_password'), 'R2dZ4hvJ2ujoDGjQ2cClHw==')

WebUI.sendKeys(findTestObject('Page_Login - Space Casino/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_000_profileMenuButton'))

WebUI.click(findTestObject('Page_account - Space Casino/div_Responsible Gaming'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/div_Wager LimitsTap here to update24 hours1000007 days12340030 days000'))

WebUI.click(findTestObject('Page_account - Space Casino/button_30 days'))

WebUI.setText(findTestObject('Page_account - Space Casino/input_Current Limit_amount'), '4321')

WebUI.click(findTestObject('Page_account - Space Casino/div_Back'))

WebUI.closeBrowser()

