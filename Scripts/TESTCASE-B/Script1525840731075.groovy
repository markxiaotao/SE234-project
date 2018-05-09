import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://52.39.163.150:8091/')

WebUI.setText(findTestObject('Page_AddProduct/input_username'), username)

WebUI.setText(findTestObject('Page_AddProduct/input_password'), password)

WebUI.click(findTestObject('Page_AddProduct/button_Login'))

WebUI.click(findTestObject('Page_AddProduct/h5_Garden'))

WebUI.click(findTestObject('Page_AddProduct/button_add to cart'))

WebUI.verifyElementText(findTestObject('Page_AddProduct/div_already added'), 'already added')

WebUI.click(findTestObject('Page_AddProduct/a_Carts            1'))

WebUI.verifyElementText(findTestObject('Page_AddProduct/h2_Shopping Cart'), 'Shopping Cart')

WebUI.verifyElementText(findTestObject('Page_AddProduct/td_Garden'), 'Garden')

WebUI.closeBrowser()

