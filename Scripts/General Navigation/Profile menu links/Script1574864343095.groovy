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

WebUI.sendKeys(findTestObject('Page_Password Protection/input_Password protected site_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Best Online Casino and Sports Betting _8ba448/a_Sign in'))

WebUI.setText(findTestObject('Page_Login - Space Casino/input_usernameemail or phone number_username'), 'moneytest')

WebUI.setEncryptedText(findTestObject('Page_Login - Space Casino/input_Password_password'), 'R2dZ4hvJ2ujoDGjQ2cClHw==')

WebUI.sendKeys(findTestObject('Page_Login - Space Casino/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_4345_profileMenuButton'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/div_Dashboard'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_4345_profileMenuButton'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/div_Profile'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_4345_profileMenuButton'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/div_Security'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/div_Change your passwordClick here to see m_168dda'))

WebUI.click(findTestObject('Page_account - Space Casino/div_Back'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/div_Multi-factor authenticationClick here t_59c929'))

WebUI.click(findTestObject('Page_account - Space Casino/div_Back'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/div_Session ActivityClick here to see more _59d2ab'))

WebUI.click(findTestObject('Page_account - Space Casino/div_Back'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/div_My devicesClick here to see more or upd_046b44'))

WebUI.click(findTestObject('Page_account - Space Casino/div_Back'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_4345_profileMenuButton'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/div_Deposit'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_4345_profileMenuButton'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/div_Withdraw'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_4345_profileMenuButton'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/div_Verify Account'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_4345_profileMenuButton'))

WebUI.click(findTestObject('Page_account - Space Casino/div_Responsible Gaming'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_4345_profileMenuButton'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/div_Latest Withdraws'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_4345_profileMenuButton'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/div_Activity'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_4345_profileMenuButton'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/div_Communication Preferences'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_4345_profileMenuButton'))

WebUI.closeBrowser()

