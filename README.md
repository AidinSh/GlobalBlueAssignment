# GlobalBlueAssignment

This project is written with the **PageObjectModel** structure and **PageFactory**.

The project consist of : 

**- Base Directiory : **
	 It consist of 2 base classes 
	 - BaseTestCase -> That has WebDriver and some usefull basic methods of test.
	 - BaseStep -> That is a class is base of Step classes. (I will describe them later)
	 
	 
**- Pages Directory : **
	It cointains *VATCalculatorPage.java* class that is responsible for elements of the page.
	
	
**- Steps Directory : **
	It contains *VATCalculatorSteps.java* class that using the *VATCalculatorPage* object for creating steps of the test. 
	
**- Data Directory :** 
	It contains test datas that are feeded to tests using DataProvider of TestNG. 
	
**- TestCase Directory :**
	Finally test case directory that contains the test cases. 
	It use a *VATCalculatorSteps* object for creating test steps on the testcase.
