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

WebUI.navigateToUrl('https://staging.spacecasino.co.uk/')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Password Protection/input_Password protected site_password'), 
    '7Ud+37EcZMriwDyAZUmMTg==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Password Protection/input_Password protected site_password'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Best Online Casino and Sports Betting - Space Casino/div_Casino'))

WebUI.click(findTestObject('Object Repository/Page_Casino - Space Casino/a_Popular Games'))

WebUI.click(findTestObject('Object Repository/Page_Casino - Space Casino/img'))

WebUI.click(findTestObject('Object Repository/Page_Play Starburst - netent - Space Casino/span_netent_GameHeaderstyles__Close-sc-1xax_dc19f6'))

WebUI.click(findTestObject('Object Repository/Page_Casino - Space Casino/a_New Games'))

WebUI.click(findTestObject('Object Repository/Page_Casino - Space Casino/img_1'))

WebUI.click(findTestObject('Object Repository/Page_Play RNG Lightning Roulette - evolutio_14257b/a_evolution_GameHeaderstyles__CloseButton-s_351c43'))

WebUI.click(findTestObject('Object Repository/Page_Casino - Space Casino/a_Video Slots'))

WebUI.click(findTestObject('Object Repository/Page_Casino - Space Casino/img'))

WebUI.click(findTestObject('Object Repository/Page_Play Starburst - netent - Space Casino/a_netent_GameHeaderstyles__CloseButton-sc-1_98ef43'))

WebUI.click(findTestObject('Object Repository/Page_Casino - Space Casino/a_Table Games'))

WebUI.click(findTestObject('Object Repository/Page_Casino - Space Casino/img_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Page_Play Roulette Pro(Low Limit) - netent _0a2027/a_netent_GameHeaderstyles__CloseButton-sc-1_98ef43'))

WebUI.closeBrowser()

