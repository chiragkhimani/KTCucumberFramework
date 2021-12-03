Feature: Login Functionality Test
	Tester - chirag - chirag@knowledgetransfer.com
	
	@smoke @arpita
	Scenario: verify User Can Able To Login
			Given user open website
			When user enter valid credentials
			Then verify login successful
		
	@regression @antwan	
	Scenario: verify User Cannot Able To Login with invalid cred
			Given user open website
			When user enter invalid credentials
			Then verify invalid login error message
		