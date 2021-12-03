Feature: Add Employee Test
	Tester - chirag - chirag@knowledgetransfer.com
	
	@smoke @chirag 
	Scenario: verify verify User Can Able To Add Employee
			Given user open website
			When user enter valid credentials
			Then verify login successful
			When user select Add Employee from PIM menu
			And enter first name
			And enter last name
			And click on save button
			Then verify employee details on personal details page