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

WebUI.setText(findTestObject('Page_CheckTransacationAfterAddProducts/input_username'), username1)

WebUI.setText(findTestObject('Page_CheckTransacationAfterAddProducts/input_password'), password1)

WebUI.click(findTestObject('Page_CheckTransacationAfterAddProducts/button_Login'))

WebUI.verifyElementText(findTestObject('Page_CheckTransacationAfterAddProducts/h5_Garden'), 'Garden', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_CheckTransacationAfterAddProducts/button_add to cart'))

WebUI.click(findTestObject('Page_CheckTransacationAfterAddProducts/a_Carts            1'))

WebUI.verifyElementText(findTestObject('Page_CheckTransacationAfterAddProducts/td_Garden'), 'Garden')

WebUI.setText(findTestObject('Page_CheckTransacationAfterAddProducts/input_amount'), '2')

WebUI.click(findTestObject('Page_CheckTransacationAfterAddProducts/button_confirm'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Page_CheckTransacationAfterAddProducts/button_Logout'))

WebUI.waitForPageLoad(0)

WebUI.setText(findTestObject('Page_CheckTransacationAfterAddProducts/input_username'), username2)

WebUI.setText(findTestObject('Page_CheckTransacationAfterAddProducts/input_password'), password2)

WebUI.click(findTestObject('Page_CheckTransacationAfterAddProducts/button_Login'))

WebUI.click(findTestObject('Page_CheckTransacationAfterAddProducts/a_Total Transaction'))

WebUI.verifyElementText(findTestObject('Page_CheckTransacationAfterAddProducts/td_Garden'), 'Garden')

WebUI.verifyElementText(findTestObject('Page_CheckTransacationAfterAddProducts/td_40000 THB'), '40,000 THB')

WebUI.closeBrowser()

