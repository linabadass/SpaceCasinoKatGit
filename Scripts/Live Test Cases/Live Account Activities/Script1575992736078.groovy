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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://spacecasino.co.uk/')

WebUI.click(findTestObject('Object Repository/Page_Best Online Casino and Sports Betting _8ba448/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_Login - Space Casino/input_usernameemail or phone number_username'), 
    'linatest1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - Space Casino/input_Password_password'), 'R2dZ4hvJ2ujoDGjQ2cClHw==')

WebUI.click(findTestObject('Object Repository/Page_Login - Space Casino/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_3140_profileMenuButton'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/div_Activity'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_Last Week'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_Last Month'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_Custom Date'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_Financial'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_Today'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_Last Week'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_Last Month'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_Custom Date'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/div_Back'))

WebUI.closeBrowser()

