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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://staging.spacecasino.co.uk')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Password Protection/input_Password protected site_password'), 
    '7Ud+37EcZMriwDyAZUmMTg==')

WebUI.click(findTestObject('Object Repository/Page_Password Protection/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_Best Online Casino and Sports Betting - Space Casino/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_Login - Space Casino/input_usernameemail or phone number_username'), 
    'savedcctest')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - Space Casino/input_Password_password'), 'R2dZ4hvJ2ujoDGjQ2cClHw==')

WebUI.click(findTestObject('Object Repository/Page_Login - Space Casino/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/a_Deposit_1'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/a_Select_Card'))

WebUI.setText(findTestObject('Object Repository/Page_account - Space Casino/input_Card Number_cardNumber'), '4012-0003-0000-1003')

WebUI.setText(findTestObject('Object Repository/Page_account - Space Casino/input_Name On Card_nameOnCard'), 'test thirteen')

WebUI.setText(findTestObject('Object Repository/Page_account - Space Casino/input_CVV_cvv'), '003')

WebUI.setText(findTestObject('Object Repository/Page_account - Space Casino/input_Expiry Month_expiryMonth'), '01')

WebUI.setText(findTestObject('Object Repository/Page_account - Space Casino/input_Expiry Year_expiryYear'), '2023')

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/input_Amount_amount'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_Submit'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Wirecard Bank/input_Password_password'), 'Hyc+o3wDPjk78wXSuizEqA==')

WebUI.click(findTestObject('Object Repository/Page_Wirecard Bank/input_Password_authenticate'))

WebUI.closeBrowser()

